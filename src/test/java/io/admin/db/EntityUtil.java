package io.admin.db;

import io.admin.core.EmployeeDetailEntity;
import io.admin.core.EmployeeTimesheetEntity;
import io.admin.core.HolidayEntity;
import io.admin.core.ProjectEntity;
import io.admin.core.TimesheetEntity;
import io.admin.core.UserLoginEntity;
import java.time.OffsetDateTime;
import org.hibernate.SessionFactory;

class EntityUtil {

  private EntityUtil() {}

  static UserLoginEntity userLoginTestEntity(SessionFactory sessionFactory) {
    final UserLoginEntityRepository userLoginRepository =
        new UserLoginEntityRepository(sessionFactory);

    final UserLoginEntity userEntity = UserLoginEntity.newInstance();
    userEntity.setEmail("test email");
    userEntity.setPassword("test password");
    userLoginRepository.save(userEntity);
    return userEntity;
  }

  static EmployeeDetailEntity employeeDetailTestEntity(SessionFactory sessionFactory) {
    final EmployeeDetailEntityRepository employeeDetailRepository =
        new EmployeeDetailEntityRepository(sessionFactory);

    final OffsetDateTime now = OffsetDateTime.now();
    final EmployeeDetailEntity employeeDetailEntity = EmployeeDetailEntity.newInstance();
    employeeDetailEntity.setUserLogin(userLoginTestEntity(sessionFactory));
    employeeDetailEntity.setFirstName("test first name");
    employeeDetailEntity.setLastName("test last name");
    employeeDetailEntity.setEmployeeStatus("employee");
    employeeDetailEntity.setEmployeeType("full-time");
    employeeDetailEntity.setEmployeeGrade("L1");
    employeeDetailEntity.setStartDate(now);
    employeeDetailEntity.setEndDate(now);
    return employeeDetailRepository.save(employeeDetailEntity);
  }

  static ProjectEntity projectTestEntity(SessionFactory sessionFactory) {
    final ProjectEntityRepository projectRepository = new ProjectEntityRepository(sessionFactory);

    final OffsetDateTime now = OffsetDateTime.now();
    final ProjectEntity projectEntity = ProjectEntity.newInstance();
    projectEntity.setEmployeeDetail(employeeDetailTestEntity(sessionFactory));
    projectEntity.setProjectName("test name");
    projectEntity.setStartDate(now);
    projectEntity.setEndDate(now);
    projectEntity.setProjectStatus("active");
    return projectRepository.save(projectEntity);
  }

  static EmployeeTimesheetEntity employeeTimesheetEntity(SessionFactory sessionFactory) {
    final EmployeeTimesheetEntityRepository employeeTimesheetRepository =
        new EmployeeTimesheetEntityRepository(sessionFactory);

    final OffsetDateTime now = OffsetDateTime.now();
    final EmployeeTimesheetEntity employeeTimesheetEntity = EmployeeTimesheetEntity.newInstance();
    employeeTimesheetEntity.setEmployeeDetail(employeeDetailTestEntity(sessionFactory));
    employeeTimesheetEntity.setTimesheet(timesheetTestEntity(sessionFactory));
    employeeTimesheetEntity.setWeeklyPeriodDate(now);
    employeeTimesheetEntity.setWeeklyHoursWorked(40);
    return employeeTimesheetRepository.save(employeeTimesheetEntity);
  }

  static TimesheetEntity timesheetTestEntity(SessionFactory sessionFactory) {
    final TimesheetEntityRepository timesheetRepository =
        new TimesheetEntityRepository(sessionFactory);

    final OffsetDateTime now = OffsetDateTime.now();
    final TimesheetEntity timesheetEntity = TimesheetEntity.newInstance();
    timesheetEntity.setHoliday(holidayTestEntity(sessionFactory));
    timesheetEntity.setClockIn(now);
    timesheetEntity.setClockOut(now);
    timesheetEntity.setLunch(now);
    timesheetEntity.setHoursWorked(8);
    timesheetEntity.setOvertime(0);
    return timesheetRepository.save(timesheetEntity);
  }

  static HolidayEntity holidayTestEntity(SessionFactory sessionFactory) {
    final HolidayEntityRepository holidayRepository = new HolidayEntityRepository(sessionFactory);

    final OffsetDateTime now = OffsetDateTime.now();
    final HolidayEntity holidayEntity = HolidayEntity.newInstance();
    holidayEntity.setHolidayName("test name");
    holidayEntity.setDate(now);
    return holidayRepository.save(holidayEntity);
  }

}
