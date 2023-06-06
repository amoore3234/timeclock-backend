package io.admin;

import io.admin.core.EmployeeDetailEntity;
import io.admin.core.EmployeeTimesheetEntity;
import io.admin.core.HolidayEntity;
import io.admin.core.ProjectEntity;
import io.admin.core.TimesheetEntity;
import io.admin.core.UserLoginEntity;
import io.admin.db.EmployeeDetailEntityRepository;
import io.admin.db.ProjectEntityRepository;
import io.admin.db.UserLoginEntityRepository;
import io.admin.service.EmployeeDetailServiceImpl;
import io.admin.service.ProjectServiceImpl;
import io.admin.service.UserLoginServiceImpl;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.hibernate.UnitOfWorkAwareProxyFactory;
import io.grpc.Server;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An Application class that runs a Timeclock service.
 */
public class TimeclockApplication extends Application<TimeclockConfiguration> {

  private static final Logger logger =
      LoggerFactory.getLogger(TimeclockApplication.class);

  public static void main(final String[] args) throws Exception {
    new TimeclockApplication().run(args);
  }

  private final HibernateBundle<TimeclockConfiguration> hibernateBundle =
      new HibernateBundle<TimeclockConfiguration>(UserLoginEntity.class,
      EmployeeDetailEntity.class, EmployeeTimesheetEntity.class, HolidayEntity.class,
      ProjectEntity.class, TimesheetEntity.class) {

        @Override
        public DataSourceFactory getDataSourceFactory(TimeclockConfiguration configuration) {
          logger.info("Retrieving datasource connection for hibernate.");
          return configuration.getDataSourceFactory();
        }

      };

  @Override
  public String getName() {
    return "Timeclock";
  }

  @Override
  public void initialize(final Bootstrap<TimeclockConfiguration> bootstrap) {
    logger.info("Initializing bootstrap bundle");
    bootstrap.addBundle(hibernateBundle);
  }

  @Override
  public void run(final TimeclockConfiguration configuration,
                  final Environment environment) throws InterruptedException {
    logger.info("DbBuilder instantiating UserLoginEntityRepository");
    final DbBuilder dbBuilder = DbBuilder.newBuild()
                    .setUserLoginEntityRepository(
                      new UserLoginEntityRepository(hibernateBundle.getSessionFactory()))
                    .setEmployeeDetailEntityRepository(
                      new EmployeeDetailEntityRepository(hibernateBundle.getSessionFactory()))
                    .setProjectEntityRepository(
                      new ProjectEntityRepository(hibernateBundle.getSessionFactory()))
                    .build();
    logger.info("Creating service with UnitOfWorkAwareProxyFactory");
    final UserLoginServiceImpl userLoginService = new UnitOfWorkAwareProxyFactory(hibernateBundle)
        .create(UserLoginServiceImpl.class, new Class<?>[]{DbBuilder.class},
          new Object[]{dbBuilder});
    final EmployeeDetailServiceImpl employeeDetailService =
        new UnitOfWorkAwareProxyFactory(hibernateBundle)
          .create(EmployeeDetailServiceImpl.class, new Class<?>[]{DbBuilder.class},
            new Object[]{dbBuilder});
    final ProjectServiceImpl projectService = new UnitOfWorkAwareProxyFactory(hibernateBundle)
        .create(ProjectServiceImpl.class, new Class<?>[]{DbBuilder.class},
          new Object[]{dbBuilder});

    logger.info("Create gRPC server");
    final Server server = configuration.getGrpcServerFactory()
                          .builder(environment)
                          .addService(userLoginService)
                          .addService(employeeDetailService)
                          .addService(projectService)
                          .build();

    try {
      logger.info("Starting server");
      server.start();
      server.awaitTermination();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
