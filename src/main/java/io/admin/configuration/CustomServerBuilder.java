package io.admin.configuration;

import static com.google.common.base.Preconditions.checkNotNull;

import io.dropwizard.core.setup.Environment;
import io.dropwizard.util.Duration;
import io.grpc.BindableService;
import io.grpc.CompressorRegistry;
import io.grpc.DecompressorRegistry;
import io.grpc.HandlerRegistry;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerInterceptor;
import io.grpc.ServerServiceDefinition;
import io.grpc.ServerTransportFilter;
import io.grpc.ServerStreamTracer.Factory;
import jakarta.annotation.Nullable;
import java.io.File;
import java.util.concurrent.Executor;

public class CustomServerBuilder extends ServerBuilder<CustomServerBuilder> {

  private final Environment environment;
  private final ServerBuilder<?> origin;
  private final Duration shutdownPeriod;

  public CustomServerBuilder(final Environment environment, final ServerBuilder<?> origin,
          final Duration shutdownPeriod) {
      this.environment = checkNotNull(environment, "Environment is null");
      this.origin = checkNotNull(origin, "ServerBuilder is null");
      this.shutdownPeriod = checkNotNull(shutdownPeriod, "shutdownPeriod is null");
  }

  @Override
  public CustomServerBuilder directExecutor() {
      origin.directExecutor();
      return this;
  }

  @Override
  public CustomServerBuilder executor(@Nullable final Executor executor) {
      origin.executor(executor);
      return this;
  }

  @Override
  public CustomServerBuilder addService(final ServerServiceDefinition service) {
      // TODO configure io.grpc.ServerInterceptor to collect dropwizard metrics
      // TODO configure io.grpc.ServerInterceptor to send rpc call and exception events to logback
      origin.addService(service);
      return this;
  }

  @Override
  public CustomServerBuilder addService(final BindableService bindableService) {
      // TODO configure io.grpc.ServerInterceptor to collect dropwizard metrics
      // TODO configure io.grpc.ServerInterceptor to send rpc call and exception events to logback
      origin.addService(bindableService);
      return this;
  }

  @Override
  public CustomServerBuilder intercept(final ServerInterceptor interceptor) {
      origin.intercept(interceptor);
      return this;
  }

  @Override
  public CustomServerBuilder addTransportFilter(final ServerTransportFilter filter) {
      origin.addTransportFilter(filter);
      return this;
  }

  @Override
  public CustomServerBuilder addStreamTracerFactory(final Factory factory) {
      origin.addStreamTracerFactory(factory);
      return this;
  }

  @Override
  public CustomServerBuilder fallbackHandlerRegistry(@Nullable final HandlerRegistry fallbackRegistry) {
      origin.fallbackHandlerRegistry(fallbackRegistry);
      return this;
  }

  @Override
  public CustomServerBuilder useTransportSecurity(final File certChain, final File privateKey) {
      origin.useTransportSecurity(certChain, privateKey);
      return this;
  }

  @Override
  public CustomServerBuilder decompressorRegistry(@Nullable final DecompressorRegistry registry) {
      origin.decompressorRegistry(registry);
      return this;
  }

  @Override
  public CustomServerBuilder compressorRegistry(@Nullable final CompressorRegistry registry) {
      origin.compressorRegistry(registry);
      return this;
  }

  @Override
  public Server build() {
      final Server server;
      server = origin.build();
      environment.lifecycle().manage(new MainGrpcServer(server, shutdownPeriod));
      return server;
  }

}
