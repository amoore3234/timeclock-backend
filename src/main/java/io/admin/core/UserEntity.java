package io.admin.core;

import java.util.List;
import java.util.Objects;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

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
  private List<EmployeeDetailEntity> users;

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
  public List<EmployeeDetailEntity> getUsers() {
    return users;
  }

  public void setUsers(@Nullable List<EmployeeDetailEntity> users) {
    this.users = users;
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
      && Objects.equals(users, other.users);
  }

  public static UserEntity newInstance() {
    return new UserEntity();
  }
  
}
