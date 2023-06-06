package io.admin.core;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Project class modeled as an entity.
 */
@Entity
@Table(name = "project")
public class ProjectEntity extends AbstractEntity {

  @Nullable
  @ManyToOne
  @JoinColumn(name = "employee_detail_id", referencedColumnName = "id")
  private EmployeeDetailEntity employeeDetail;

  @Nullable
  @Column(name = "project_name")
  private String projectName;

  @Nullable
  @Column(name = "start_date")
  private Timestamp startDate;

  @Nullable
  @Column(name = "end_date")
  private Timestamp endDate;

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
  public Timestamp getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable Timestamp startDate) {
    this.startDate = startDate;
  }

  @Nullable
  public Timestamp getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable Timestamp endDate) {
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
