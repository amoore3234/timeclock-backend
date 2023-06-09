package io.admin.core;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Timesheet class modeled as an entity.
 */
@Entity
@Table(name = "timesheet")
public class TimesheetEntity extends AbstractEntity {

  @Nullable
  @Column(name = "clock_in")
  private OffsetDateTime clockIn;

  @Nullable
  @Column(name = "clock_out")
  private OffsetDateTime clockOut;

  @Nullable
  @Column(name = "lunch")
  private OffsetDateTime lunch;

  @Nullable
  @Column(name = "hours_worked")
  private int hoursWorked;

  @Nullable
  @Column(name = "overtime")
  private int overtime;

  @Nullable
  @OneToMany(mappedBy = "timesheet")
  private List<EmployeeTimesheetEntity> employeeTimesheets;

  @Nullable
  @OneToMany(mappedBy = "timesheet")
  private List<HolidayEntity> holidays;

  protected TimesheetEntity() {}

  @Nullable
  public List<HolidayEntity> getHolidays() {
    return holidays;
  }

  public void setHolidays(@Nullable List<HolidayEntity> holidays) {
    this.holidays = holidays;
  }

  @Nullable
  public OffsetDateTime getClockIn() {
    return clockIn;
  }

  public void setClockIn(@Nullable OffsetDateTime clockIn) {
    this.clockIn = clockIn;
  }

  @Nullable
  public OffsetDateTime getClockOut() {
    return clockOut;
  }

  public void setClockOut(@Nullable OffsetDateTime clockOut) {
    this.clockOut = clockOut;
  }

  @Nullable
  public OffsetDateTime getLunch() {
    return lunch;
  }

  public void setLunch(@Nullable OffsetDateTime lunch) {
    this.lunch = lunch;
  }

  @Nullable
  public int getHoursWorked() {
    return hoursWorked;
  }

  public void setHoursWorked(@Nullable int hoursWorked) {
    this.hoursWorked = hoursWorked;
  }

  @Nullable
  public int getOvertime() {
    return overtime;
  }

  public void setOvertime(@Nullable int overtime) {
    this.overtime = overtime;
  }

  @Nullable
  public List<EmployeeTimesheetEntity> getEmployeeTimesheets() {
    return employeeTimesheets;
  }

  public void setEmployeeTimesheets(@Nullable List<EmployeeTimesheetEntity> employeeTimesheets) {
    this.employeeTimesheets = employeeTimesheets;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof TimesheetEntity)) {
      return false;
    }
    TimesheetEntity other = (TimesheetEntity) obj;
    return getId() == other.getId() && hoursWorked == other.hoursWorked
      && Objects.equals(clockIn, other.clockIn)
      && Objects.equals(clockOut, other.clockOut)
      && Objects.equals(lunch, other.lunch)
      && overtime == other.overtime;
  }

  public static TimesheetEntity newInstance() {
    return new TimesheetEntity();
  }

}
