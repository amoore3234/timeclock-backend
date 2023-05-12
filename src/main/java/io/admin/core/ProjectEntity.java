package io.admin.core;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Entity for Project class.
 */
@Entity
@Table(name = "project")
public class ProjectEntity extends AbstractEntity {

  @Nullable
  @OneToMany
  @JoinColumn(name = "employee_detail_id", referencedColumnName = "id")
  private EmployeeDetailEntity employeeDetail;

  @Nullable
  @Column(name = "project_name")
  private String projectName;

  @Nullable
  @Column(name = "start_date")
  private OffsetDateTime startDate;

  @Nullable
  @Column(name = "end_date")
  private OffsetDateTime endDate;

  @Nullable
  //TODO: Change column name to project_status
  @Column(name = "proj_status")
  private String projectStatus;

  protected ProjectEntity() {}

  @Nullable
  public EmployeeDetailEntity getEmployeeDetail() {
    return employeeDetail;
  }

  public void setEmployeeDetail(@Nullable EmployeeDetailEntity employeeDetail) {
    this.employeeDetail = employeeDetail;
  }

  @Nullable
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(@Nullable String projectName) {
    this.projectName = projectName;
  }

  @Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  @Nullable
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  @Nullable
  public String getProjectStatus() {
    return projectStatus;
  }

  public void setProjectStatus(@Nullable String projectStatus) {
    this.projectStatus = projectStatus;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof ProjectEntity)) {
      return false;
    }
    ProjectEntity other = (ProjectEntity) obj;
    return getId() == other.getId()
      && Objects.equals(employeeDetail, other.employeeDetail)
      && Objects.equals(projectName, other.projectName)
      && Objects.equals(projectStatus, other.projectStatus)
      && Objects.equals(startDate, other.startDate)
      && Objects.equals(endDate, other.endDate);
  }

  public static ProjectEntity newInstance() {
    return new ProjectEntity();
  }

}
