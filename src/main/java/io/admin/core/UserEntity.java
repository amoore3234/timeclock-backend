package io.admin.core;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import java.util.Objects;

/**
 * User class modeled as an entity.
 */
@Entity
@Table(name = "user")
public class UserEntity extends AbstractEntity {

  @Nullable
  @Column(name = "email")
  private String email;

  @Nullable
  @Column(name = "password")
  private String password;

  @Nullable
  @OneToMany(mappedBy = "user")
  private List<EmployeeDetailEntity> employeeDetails;

  protected UserEntity() {}

  @Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@Nullable String email) {
    this.email = email;
  }

  @Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(@Nullable String password) {
    this.password = password;
  }

  @Nullable
  public List<EmployeeDetailEntity> getEmployeeDetails() {
    return employeeDetails;
  }

  public void setDetails(@Nullable List<EmployeeDetailEntity> employeeDetails) {
    this.employeeDetails = employeeDetails;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof UserEntity)) {
      return false;
    }
    UserEntity other = (UserEntity) obj;
    return getId() == other.getId() && Objects.equals(email, other.email)
      && Objects.equals(password, other.password)
      && Objects.equals(employeeDetails, other.employeeDetails);
  }

  public static UserEntity newInstance() {
    return new UserEntity();
  }

}
