package io.admin;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.admin.configuration.GrpcServerFactory;
import io.dropwizard.core.Configuration;
import io.dropwizard.db.DataSourceFactory;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Configuration class that handles application configurations.
 */
public class TimeclockConfiguration extends Configuration {

  @Valid
  @NotNull
  private DataSourceFactory dataSourceFactory = new DataSourceFactory();

  @Valid
  @NotNull
  private GrpcServerFactory grpcServer = new GrpcServerFactory();

  @JsonProperty("grpcPort")
  public GrpcServerFactory getGrpcServerFactory() {
    return grpcServer;
  }

  @JsonProperty("grpcPort")
  public void setGrpcServerFactory(GrpcServerFactory grpcServer) {
    this.grpcServer = grpcServer;
  }

  @JsonProperty("database")
  public DataSourceFactory getDataSourceFactory() {
    return dataSourceFactory;
  }

  @JsonProperty("database")
  public void setDataSourceFactory(DataSourceFactory dataSourceFactory) {
    this.dataSourceFactory = dataSourceFactory;
  }

}
