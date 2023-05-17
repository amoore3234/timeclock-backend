package io.admin;

import io.admin.db.EmployeeDetailRepository;
import io.admin.db.EmployeeTimesheetRepository;
import io.admin.db.HolidayRepository;
import io.admin.db.ProjectRepository;
import io.admin.db.TimesheetRepository;
import io.admin.db.UserLoginRepository;
import jakarta.annotation.Nullable;

/**
 * A class to acces repository methods.
 */
public class DbBuilder {

  private final EmployeeDetailRepository employeeDetailRepository;
  private final EmployeeTimesheetRepository employeeTimesheetRepository;
  private final HolidayRepository holidayRepository;
  private final ProjectRepository projectRepository;
  private final TimesheetRepository timesheetRepository;
  private final UserLoginRepository userLoginRepository;

  /**
  `* Constructor that initailizes the DbBuilder class.
   */
  public DbBuilder(EmployeeDetailRepository employeeDetailRepository, EmployeeTimesheetRepository
      employeeTimesheetRepository, HolidayRepository holidayRepository, ProjectRepository
      projectRepository,
      TimesheetRepository timesheetRepository, UserLoginRepository userLoginRepository) {
    this.employeeDetailRepository = employeeDetailRepository;
    this.employeeTimesheetRepository = employeeTimesheetRepository;
    this.holidayRepository = holidayRepository;
    this.projectRepository = projectRepository;
    this.timesheetRepository = timesheetRepository;
    this.userLoginRepository = userLoginRepository;
  }

  public EmployeeDetailRepository getEmployeeDetailRepository() {
    return employeeDetailRepository;
  }

  public EmployeeTimesheetRepository getEmployeeTimesheetRepository() {
    return employeeTimesheetRepository;
  }

  public HolidayRepository getHolidayRepository() {
    return holidayRepository;
  }

  public ProjectRepository getProjectRepository() {
    return projectRepository;
  }

  public TimesheetRepository getTimesheetRepository() {
    return timesheetRepository;
  }

  public UserLoginRepository getUserLoginRepository() {
    return userLoginRepository;
  }

  public static Build newBuild() {
    return new Build();
  }

  /**
   * A class that builds the repository classes.
   */
  public static class Build {

    @Nullable
    private EmployeeDetailRepository employeeDetailRepository;

    @Nullable
    private EmployeeTimesheetRepository employeeTimesheetRepository;

    @Nullable
    private HolidayRepository holidayRepository;

    @Nullable
    private ProjectRepository projectRepository;

    @Nullable
    private TimesheetRepository timesheetRepository;

    @Nullable
    private UserLoginRepository userLoginRepository;

    private Build() {}

    public Build setEmployeeDetailRepository(EmployeeDetailRepository employeeDetailRepository) {
      this.employeeDetailRepository = employeeDetailRepository;
      return this;
    }

    public Build setEmployeeTimesheetRepository(EmployeeTimesheetRepository
        employeeTimesheetRepository) {
      this.employeeTimesheetRepository = employeeTimesheetRepository;
      return this;
    }

    public Build setHolidayRepository(HolidayRepository holidayRepository) {
      this.holidayRepository = holidayRepository;
      return this;
    }

    public Build setProjectRepository(ProjectRepository projectRepository) {
      this.projectRepository = projectRepository;
      return this;
    }

    public Build setTimesheetRepository(TimesheetRepository timesheetRepository) {
      this.timesheetRepository = timesheetRepository;
      return this;
    }

    public Build setUserLoginRepository(UserLoginRepository userLoginRepository) {
      this.userLoginRepository = userLoginRepository;
      return this;
    }

    public DbBuilder build() {
      return new DbBuilder(employeeDetailRepository, employeeTimesheetRepository,
      holidayRepository, projectRepository, timesheetRepository, userLoginRepository);
    }

  }
}
