package io.admin.db;

import io.admin.core.EmployeeDetailEntity;
import io.admin.core.EmployeeTimesheetEntity;
import io.admin.core.HolidayEntity;
import io.admin.core.ProjectEntity;
import io.admin.core.TimesheetEntity;
import io.admin.core.UserLoginEntity;
import io.dropwizard.testing.junit5.DAOTestExtension;
import io.dropwizard.testing.junit5.DropwizardExtensionsSupport;
import io.zonky.test.db.postgres.embedded.LiquibasePreparer;
import io.zonky.test.db.postgres.embedded.PreparedDbProvider;
import java.sql.SQLException;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.dialect.PostgreSQLDialect;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(DropwizardExtensionsSupport.class)
class AbstractRepositoryIntegrationTest {

  private final PreparedDbProvider preparedDbProvider = PreparedDbProvider
      .forPreparer(LiquibasePreparer.forClasspathLocation("migrations.xml"));

  protected final DAOTestExtension daoTest;

  /**
   * Initializes a postgres database for testing.
   */
  public AbstractRepositoryIntegrationTest() {
    String jdbcUrl;
    try {
      jdbcUrl = preparedDbProvider.createDatabase();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
    daoTest = DAOTestExtension.newBuilder()
        .customizeConfiguration(
            c -> c.setProperty(AvailableSettings.DIALECT, PostgreSQLDialect.class.getName()))
        .setDriver("org.postgresql.Driver")
        .setUrl(jdbcUrl)
        .setHbm2DdlAuto("none")
        .addEntityClass(EmployeeDetailEntity.class).addEntityClass(EmployeeTimesheetEntity.class)
        .addEntityClass(HolidayEntity.class).addEntityClass(ProjectEntity.class)
        .addEntityClass(TimesheetEntity.class).addEntityClass(UserLoginEntity.class).build();
  }

}
