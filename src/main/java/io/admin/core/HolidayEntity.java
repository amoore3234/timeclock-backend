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
 * Holiday class modeled as an entity.
 */
@Entity
@Table(name = "holiday")
public class HolidayEntity extends AbstractEntity {

  @Nullable
  @Column(name = "holiday_name")
  private String holidayName;

  @Nullable
  @Column(name = "date")
  private OffsetDateTime date;

  @Nullable
  @OneToMany(mappedBy = "holiday")
  private List<TimesheetEntity> timesheets;

  protected HolidayEntity() {}

  @Nullable
  public String getHolidayName() {
    return holidayName;
  }

  public void setHolidayName(@Nullable String holidayName) {
    this.holidayName = holidayName;
  }

  @Nullable
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(@Nullable OffsetDateTime date) {
    this.date = date;
  }

  @Nullable
  public List<TimesheetEntity> getTimesheets() {
    return timesheets;
  }

  public void setTimesheets(@Nullable List<TimesheetEntity> timesheets) {
    this.timesheets = timesheets;
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
      && Objects.equals(timesheets, other.timesheets);
  }

  public static HolidayEntity newInstance() {
    return new HolidayEntity();
  }

}
