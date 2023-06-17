package io.admin.core;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Holiday class modeled as an entity.
 */
@Entity
@Table(name = "holiday")
public class HolidayEntity extends AbstractEntity {

  @Nullable
  @OneToOne
  @JoinColumn(name = "timesheet_id", referencedColumnName = "id")
  private TimesheetEntity timesheet;

  @Nullable
  @Column(name = "holiday_name")
  private String holidayName;

  @Nullable
  @Column(name = "date")
  private Timestamp date;

  protected HolidayEntity() {}

  @Nullable
  public String getHolidayName() {
    return holidayName;
  }

  public void setHolidayName(@Nullable String holidayName) {
    this.holidayName = holidayName;
  }

  @Nullable
  public Timestamp getDate() {
    return date;
  }

  public void setDate(@Nullable Timestamp date) {
    this.date = date;
  }

  @Nullable
  public TimesheetEntity getTimesheet() {
    return timesheet;
  }

  public void setTimesheet(@Nullable TimesheetEntity timesheet) {
    this.timesheet = timesheet;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof HolidayEntity)) {
      return false;
    }
    HolidayEntity other = (HolidayEntity) obj;
    return getId() == other.getId()
      && Objects.equals(holidayName, other.holidayName)
      && Objects.equals(date, other.date)
      && Objects.equals(timesheet, other.timesheet);
  }

  public static HolidayEntity newInstance() {
    return new HolidayEntity();
  }

}
