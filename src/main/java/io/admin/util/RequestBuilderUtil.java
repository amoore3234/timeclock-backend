package io.admin.util;

import io.admin.core.EmployeeDetailEntity;
import io.admin.core.UserLoginEntity;
import io.admin.timesheet.CreateEmployeeDetail;
import io.admin.timesheet.CreateUser;
import io.admin.timesheet.EmployeeDetailResponse;
import io.admin.timesheet.UpdateEmployeeDetail;
import io.admin.timesheet.UpdateUser;
import io.admin.timesheet.UserResponse;
import io.grpc.stub.StreamObserver;
import java.sql.Timestamp;

/**
 * A class that includes request and response methods.
 */
public class RequestBuilderUtil {

  public RequestBuilderUtil() {}

  /**
   * Creates a UserLogin entity from a request.
   *
   * @param request {@link CreateUser} defines a request stub.
   * @return returns a UserLogin object.
   */
  public static UserLoginEntity createUserLoginRequest(CreateUser request) {
    final UserLoginEntity user = UserLoginEntity.newInstance();
    user.setEmail(request.getEmail());
    user.setPassword(request.getPassword());
    return user;
  }

  /**
   * Creates a EmployeeDetail entity from a request.
   *
   * @param request {@link CreateEmployeeDetail} defines a request stub.
   * @return returns a UserLogin object.
   */
  public static EmployeeDetailEntity createEmployeeDetailRequest(CreateEmployeeDetail request) {
    final EmployeeDetailEntity employeeDetail = EmployeeDetailEntity.newInstance();
    final UserLoginEntity user = UserLoginEntity.newInstance();
    user.setId(request.getUserId().getId());
    employeeDetail.setUserLogin(user);
    employeeDetail.setFirstName(request.getFirstName());
    employeeDetail.setLastName(request.getLastName());
    employeeDetail.setEmployeeStatus(request.getEmpStatus());
    employeeDetail.setEmployeeType(request.getEmpType());
    employeeDetail.setEmployeeGrade(request.getEmpGrade());
    employeeDetail.setStartDate(Timestamp.valueOf(request.getStartDate()));
    return employeeDetail;
  }

  /**
   * Updates an existing entity class from a request.
   *
   * @param request {@link UpdateUser} defines a request stub.
   * @param updatedUser {@link UserLoginEntity} defines an entity class.
   * @return returns a UserLoginEntity object.
   */
  public static UserLoginEntity updateUserLoginRequest(
        UpdateUser request, UserLoginEntity updatedUser) {
    updatedUser.setId(request.getId());
    updatedUser.setEmail(request.getRequest().getEmail());
    updatedUser.setPassword(request.getRequest().getPassword());
    return updatedUser;
  }

  /**
   * Updates an existing entity class from a request.
   *
   * @param request {@link UpdateEmployeeDetail} defines a request stub.
   * @param updatedEmployeeDetail {@link EmployeeDetailEntity} defines an entity class.
   * @return returns a EmployeeDetailEntity object.
   */
  public static EmployeeDetailEntity updateEmployeeDetailRequest(
        UpdateEmployeeDetail request, EmployeeDetailEntity updatedEmployeeDetail) {
    updatedEmployeeDetail.setId(request.getId());
    updatedEmployeeDetail.setFirstName(request.getRequest().getFirstName());
    updatedEmployeeDetail.setLastName(request.getRequest().getLastName());
    updatedEmployeeDetail.setEmployeeStatus(request.getRequest().getEmpStatus());
    updatedEmployeeDetail.setEmployeeType(request.getRequest().getEmpType());
    updatedEmployeeDetail.setEmployeeGrade(request.getRequest().getEmpGrade());
    updatedEmployeeDetail.setStartDate(Timestamp.valueOf(request.getRequest().getStartDate()));
    updatedEmployeeDetail.setEndDate(request.getRequest().getEndDate().isEmpty() ? null
        : Timestamp.valueOf(request.getRequest().getEndDate()));
    return updatedEmployeeDetail;
  }

  /**
   * A request that gets a user by id.
   *
   * @param id defines an id.
   * @return returns a long.
   */
  public static Long getUserByIdRequest(Long id) {
    return id;
  }

  /**
   * A request that gets a employee detail by id.
   *
   * @param id defines an id.
   * @return returns a long.
   */
  public static Long getEmployeeDetailByIdRequest(Long id) {
    return id;
  }

  /**
   * Creates a UserLogin response.
   *
   * @param user {@link UserLoginEntity} defines a UserLogin entity.
   * @param responseObserver {@link UserResponse} defines a StreamObserver response stub.
   * @return returns a StreamObserver response for UserLogin.
   */
  public static StreamObserver<UserResponse> userLoginResponse(
      UserLoginEntity user, StreamObserver<UserResponse> responseObserver) {
    io.admin.timesheet.UserResponse.Builder userLoginResponseBuilder = UserResponse.newBuilder()
        .setId(user.getId())
        .setEmail(user.getEmail())
        .setPassword(user.getPassword());
    UserResponse userLoginResponse = userLoginResponseBuilder.build();
    responseObserver.onNext(userLoginResponse);
    responseObserver.onCompleted();
    return responseObserver;
  }

  /**
   * Creates a EmployeeDetail response.
   *
   * @param employeeDetail {@link EmployeeDetailEntity} defines a EmployeeDetail entity.
   * @param responseObserver {@link EmployeeDetailResponse} defines a StreamObserver response stub.
   * @return returns a StreamObserver response for EmployeeDetail.
   */
  public static StreamObserver<EmployeeDetailResponse> employeeDetailResponse(
      EmployeeDetailEntity employeeDetail, StreamObserver<EmployeeDetailResponse>
      responseObserver) {
    io.admin.timesheet.EmployeeDetailResponse.Builder employeeDetailResponseBuilder =
        EmployeeDetailResponse.newBuilder()
        .setId(employeeDetail.getId())
        .setFirstName(employeeDetail.getFirstName())
        .setLastName(employeeDetail.getLastName())
        .setEmpStatus(employeeDetail.getEmployeeStatus())
        .setEmpType(employeeDetail.getEmployeeStatus())
        .setEmpGrade(employeeDetail.getEmployeeGrade())
        .setStartDate(((employeeDetail.getStartDate()).toString()))
        .setEndDate(employeeDetail.getEndDate() == null
          ? employeeDetail.getStartDate().toString() : employeeDetail.getEndDate().toString());
    EmployeeDetailResponse employeeDetailResponse = employeeDetailResponseBuilder.build();
    responseObserver.onNext(employeeDetailResponse);
    responseObserver.onCompleted();
    return responseObserver;
  }

}
