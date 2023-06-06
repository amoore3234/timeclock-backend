package io.admin.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.core.setup.Environment;
import io.dropwizard.util.Duration;
import io.dropwizard.validation.MinDuration;
import io.grpc.ServerBuilder;
import jakarta.validation.constraints.NotNull;


public class GrpcServerFactory {

  @NotNull
  private Integer port;

  @NotNull
  @MinDuration(1)
  private Duration duration;

  @JsonProperty("port")
  public int getPort() {
      return port;
  }

  @JsonProperty("port")
  public void setPort(final int port) {
      this.port = port;
  }

  @JsonProperty("shutdownDuration")
  public Duration getShutdownDuration() {
      return duration;
  }

  @JsonProperty("shutdownDuration")
  public void setShutdownDuration(final Duration duration) {
      this.duration = duration;
  }

  /**
   * @param environment to use
   * @return A {@link ServerBuilder}, To use this, add gRPC services to the server, then call build().
   * The returned server is lifecycle-managed in the given {@link Environment}.
   */
  public ServerBuilder<?> builder(final Environment environment) {
      final ServerBuilder<?> originBuilder;
      final ServerBuilder<?> customBuilder;
      originBuilder = ServerBuilder.forPort(port);
      customBuilder = new CustomServerBuilder(environment, originBuilder, duration);
      return customBuilder;
  }
}
