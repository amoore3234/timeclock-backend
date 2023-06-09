package io.admin.core;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

/**
 * EmployeeDetail class modeled as an entity.
 */
@Entity
@Table(name = "employee_detail")
public class EmployeeDetailEntity extends AbstractEntity {

  @Nullable
  @ManyToOne
  @JoinColumn(name = "user_login_id", referencedColumnName = "id")
  private UserLoginEntity userLogin;

  @Nullable
  @Column(name = "first_name")
  private String firstName;

  @Nullable
  @Column(name = "last_name")
  private String lastName;

  @Nullable
  @Column(name = "emp_status")
  private String employeeStatus;

  @Nullable
  @Column(name = "emp_type")
  private String employeeType;

  @Nullable
  @Column(name = "emp_grade")
  private String employeeGrade;

  @Nullable
  @Column(name = "start_date")
  private Timestamp startDate;

  @Nullable
  @Column(name = "end_date")
  private Timestamp endDate;

  @Nullable
  @OneToMany(mappedBy = "employeeDetail")
  private List<ProjectEntity> projects;

  @Nullable
  @OneToMany(mappedBy = "employeeDetail")
  private List<EmployeeTimesheetEntity> employeeTimesheets;

  protected EmployeeDetailEntity() {}

  @Nullable
  public UserLoginEntity getUserLogin() {
    return userLogin;
  }

  public void setUserLogin(@Nullable UserLoginEntity userLogin) {
    this.userLogin = userLogin;
  }

  @Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(@Nullable String firstName) {
    this.firstName = firstName;
  }

  @Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(@Nullable String lastName) {
    this.lastName = lastName;
  }

  @Nullable
  public String getEmployeeStatus() {
    return employeeStatus;
  }

  public void setEmployeeStatus(@Nullable String employeeStatus) {
    this.employeeStatus = employeeStatus;
  }

  @Nullable
  public String getEmployeeType() {
    return employeeType;
  }

  public void setEmployeeType(@Nullable String employeeType) {
    this.employeeType = employeeType;
  }

  @Nullable
  public String getEmployeeGrade() {
    return employeeGrade;
  }

  public void setEmployeeGrade(@Nullable String employeeGrade) {
    this.employeeGrade = employeeGrade;
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

  public List<ProjectEntity> getProjects() {
    return projects;
  }

  public void setProjects(List<ProjectEntity> projects) {
    this.projects = projects;
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
    if (!(obj instanceof EmployeeDetailEntity)) {
      return false;
    }
    EmployeeDetailEntity other = (EmployeeDetailEntity) obj;
    return getId() == other.getId() && Objects.equals(userLogin, other.userLogin)
      && Objects.equals(firstName, other.firstName)
      && Objects.equals(lastName, other.lastName)
      && Objects.equals(employeeStatus, other.employeeStatus)
      && Objects.equals(employeeType, other.employeeStatus)
      && Objects.equals(employeeGrade, other.employeeGrade)
      && Objects.equals(startDate, other.startDate)
      && Objects.equals(endDate, other.endDate)
      && Objects.equals(projects, other.projects)
      && Objects.equals(employeeTimesheets, other.employeeTimesheets);
  }

  public static EmployeeDetailEntity newInstance() {
    return new EmployeeDetailEntity();
  }

}
