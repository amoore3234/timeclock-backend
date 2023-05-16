package io.admin;

import io.admin.db.EmployeeDetailEntityRepository;
import io.admin.db.EmployeeTimesheetEntityRepository;
import io.admin.db.HolidayEntityRepository;
import io.admin.db.ProjectEntityRepository;
import io.admin.db.TimesheetEntityRepository;
import io.admin.db.UserLoginEntityRepository;
import jakarta.annotation.Nullable;
//import java.lang.reflect.Field;

/**
 * A class to acces repository methods.
 */
public class DbBuilder {

  private final EmployeeDetailEntityRepository employeeDetailEntityRepository;
  private final EmployeeTimesheetEntityRepository employeeTimesheetEntityRepository;
  private final HolidayEntityRepository holidayEntityRepository;
  private final ProjectEntityRepository projectEntityRepository;
  private final TimesheetEntityRepository timesheetEntityRepository;
  private final UserLoginEntityRepository userLoginEntityRepository;

  /**
  `* Constructor that initailizes the DbBuilder class.
   */
  public DbBuilder(EmployeeDetailEntityRepository employeeDetailEntityRepository,
      EmployeeTimesheetEntityRepository employeeTimesheetEntityRepository,
      HolidayEntityRepository holidayEntityRepository, ProjectEntityRepository
      projectEntityRepository, TimesheetEntityRepository timesheetEntityRepository,
      UserLoginEntityRepository userLoginEntityRepository) {
    this.employeeDetailEntityRepository = employeeDetailEntityRepository;
    this.employeeTimesheetEntityRepository = employeeTimesheetEntityRepository;
    this.holidayEntityRepository = holidayEntityRepository;
    this.projectEntityRepository = projectEntityRepository;
    this.timesheetEntityRepository = timesheetEntityRepository;
    this.userLoginEntityRepository = userLoginEntityRepository;
  }

  public EmployeeDetailEntityRepository getEmployeeDetailEntityRepository() {
    return employeeDetailEntityRepository;
  }

  public EmployeeTimesheetEntityRepository getEmployeeTimesheetEntityRepository() {
    return employeeTimesheetEntityRepository;
  }

  public HolidayEntityRepository getHolidayEntityRepository() {
    return holidayEntityRepository;
  }

  public ProjectEntityRepository getProjectEntityRepository() {
    return projectEntityRepository;
  }

  public TimesheetEntityRepository getTimesheetEntityRepository() {
    return timesheetEntityRepository;
  }

  public UserLoginEntityRepository getUserLoginEntityRepository() {
    return userLoginEntityRepository;
  }

  public static Build newBuild() {
    return new Build();
  }

  /**
   * A class that builds the repository classes.
   */
  public static class Build {

    @Nullable
    private EmployeeDetailEntityRepository employeeDetailEntityRepository;

    @Nullable
    private EmployeeTimesheetEntityRepository employeeTimesheetEntityRepository;

    @Nullable
    private HolidayEntityRepository holidayEntityRepository;

    @Nullable
    private ProjectEntityRepository projectEntityRepository;

    @Nullable
    private TimesheetEntityRepository timesheetEntityRepository;

    @Nullable
    private UserLoginEntityRepository userLoginEntityRepository;

    private Build() {}

    public Build setEmployeeDetailEntityRepository(
        EmployeeDetailEntityRepository employeeDetailEntityRepository) {
      this.employeeDetailEntityRepository = employeeDetailEntityRepository;
      return this;
    }

    public Build setEmployeeTimesheetEntityRepository(EmployeeTimesheetEntityRepository
        employeeTimesheetEntityRepository) {
      this.employeeTimesheetEntityRepository = employeeTimesheetEntityRepository;
      return this;
    }

    public Build setHolidayEntityRepository(HolidayEntityRepository holidayEntityRepository) {
      this.holidayEntityRepository = holidayEntityRepository;
      return this;
    }

    public Build setProjectEntityRepository(ProjectEntityRepository projectEntityRepository) {
      this.projectEntityRepository = projectEntityRepository;
      return this;
    }

    public Build setTimesheetEntityRepository(TimesheetEntityRepository timesheetEntityRepository) {
      this.timesheetEntityRepository = timesheetEntityRepository;
      return this;
    }

    public Build setUserLoginEntityRepository(UserLoginEntityRepository userLoginEntityRepository) {
      this.userLoginEntityRepository = userLoginEntityRepository;
      return this;
    }

    /**
     * A build method that builds repository classes.
     *
     * @return returns a new DbBuilder instance.
     */
    public DbBuilder build() {
      //   for (Field field : this.getClass().getDeclaredFields()) {
      //     try {
      //       requiredNonNull(field.get(this), field.getName() + " is requred");
      //     } catch (IllegalAccessException e) {
      //       throw new RuntimeException(e);
      //   }
      // }
      return new DbBuilder(employeeDetailEntityRepository, employeeTimesheetEntityRepository,
      holidayEntityRepository, projectEntityRepository, timesheetEntityRepository,
      userLoginEntityRepository);
    }

    // private void requiredNonNull(Object obj, String message) {
    //   if (obj == null) {
    //     throw new IllegalArgumentException(message);
    //   }
    // }
  }
}
