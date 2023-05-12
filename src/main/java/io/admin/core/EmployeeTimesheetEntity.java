package io.admin.core;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Enity class for EmployeeTimesheet class.
 */
public class EmployeeTimesheetEntity extends AbstractEntity {

  @Nullable
  @ManyToOne
  @JoinColumn(name = "employee_detail_id", referencedColumnName = "id")
  private EmployeeDetailEntity employeeDetail;

  @Nullable
  @ManyToOne
  @JoinColumn(name = "timesheet_id")
  private TimesheetEntity timesheet;

  @Nullable
  @Column(name = "weekly_period_date")
  private OffsetDateTime weeklyPeriodDate;

  @Nullable
  @Column(name = "weekly_hours_worked")
  private int weeklyHoursWorked;

  protected EmployeeTimesheetEntity() {}

  @Nullable
  public EmployeeDetailEntity getEmployeeDetail() {
    return employeeDetail;
  }

  public void setEmployeeDetail(@Nullable EmployeeDetailEntity employeeDetail) {
    this.employeeDetail = employeeDetail;
  }

  @Nullable
  public TimesheetEntity getTimesheet() {
    return timesheet;
  }

  public void setTimesheet(@Nullable TimesheetEntity timesheet) {
    this.timesheet = timesheet;
  }

  @Nullable
  public OffsetDateTime getWeeklyPeriodDate() {
    return weeklyPeriodDate;
  }

  public void setWeeklyPeriodDate(@Nullable OffsetDateTime weeklyPeriodDate) {
    this.weeklyPeriodDate = weeklyPeriodDate;
  }

  @Nullable
  public int getWeeklyHoursWorked() {
    return weeklyHoursWorked;
  }

  public void setWeeklyHoursWorked(@Nullable int weeklyHoursWorked) {
    this.weeklyHoursWorked = weeklyHoursWorked;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof EmployeeTimesheetEntity)) {
      return false;
    }
    EmployeeTimesheetEntity other = (EmployeeTimesheetEntity) obj;
    return getId() == other.getId()
      && Objects.equals(employeeDetail, other.employeeDetail)
      && Objects.equals(timesheet, other.timesheet)
      && Objects.equals(weeklyPeriodDate, other.weeklyPeriodDate)
      && Objects.equals(weeklyHoursWorked, other.weeklyHoursWorked)
      && weeklyHoursWorked == other.weeklyHoursWorked;
  }

  public static EmployeeTimesheetEntity newInstance() {
    return new EmployeeTimesheetEntity();
  }

}
