package io.admin;

import io.admin.db.EmployeeDetailRepository;
import io.admin.db.EmployeeTimesheetRepository;
import io.admin.db.HolidayRepository;
import io.admin.db.ProjectRepository;
import io.admin.db.TimesheetRepository;
import io.admin.db.UserLoginRepository;

public class DbBuilder {

  private final EmployeeDetailRepository employeeDetailRepository;
  private final EmployeeTimesheetRepository employeeTimesheetRepository;
  private final HolidayRepository holidayRepository;
  private final ProjectRepository projectRepository;
  private final TimesheetRepository timesheetRepository;
  private final UserLoginRepository userLoginRepository;

  public DbBuilder(EmployeeDetailRepository employeeDetailRepository, EmployeeTimesheetRepository
      employeeTimesheetRepository, HolidayRepository holidayRepository, ProjectRepository
      projectRepository, TimesheetRepository timesheetRepository, UserLoginRepository
      userLoginRepository) {
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

  public static Build newBuilder() {
    return new Build();
  }
}
