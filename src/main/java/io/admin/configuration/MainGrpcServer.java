package io.admin.configuration;

import static com.google.common.base.Preconditions.checkNotNull;

import io.dropwizard.lifecycle.Managed;
import io.dropwizard.util.Duration;
import io.grpc.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainGrpcServer implements Managed {
  private static final Logger log = LoggerFactory.getLogger(MainGrpcServer.class);

  private final Server server;
  private final Duration shutdownTimeout;

  public MainGrpcServer(final Server server) {
    this(server, Duration.seconds(5));
  }

  public MainGrpcServer(final Server server, final Duration shutdownTimeout) {
    this.server = checkNotNull(server, "server");
    this.shutdownTimeout = checkNotNull(shutdownTimeout, "shutdownTimeout");
  }

  @Override
  public void start() throws Exception {
    log.info("Starting gRPC server");
    server.start();
    log.info("gRPC server started on port {}", server.getPort());
  }

  @Override
  public void stop() throws Exception {
    log.info("Stopping gRPC server on port {}", server.getPort());

    final boolean terminatedCleanly =
            server.shutdown().awaitTermination(shutdownTimeout.getQuantity(), shutdownTimeout.getUnit());

    if (terminatedCleanly) {
        log.info("gRPC server stopped and terminated cleanly.");
    } else {
        log.info("gRPC server did not terminate cleanly after " + shutdownTimeout);
        log.info("Shutting down gRPC server forcefully.");
        server.shutdownNow();
    }
  }
}
