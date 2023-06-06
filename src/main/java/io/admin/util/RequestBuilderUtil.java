package io.admin.util;

import io.admin.core.EmployeeDetailEntity;
import io.admin.core.ProjectEntity;
import io.admin.core.UserLoginEntity;
import io.admin.timesheet.CreateEmployeeDetail;
import io.admin.timesheet.CreateProject;
import io.admin.timesheet.CreateUser;
import io.admin.timesheet.EmployeeDetailResponse;
import io.admin.timesheet.GetProjectsResponse;
import io.admin.timesheet.ProjectResponse;
import io.admin.timesheet.UpdateEmployeeDetail;
import io.admin.timesheet.UpdateProject;
import io.admin.timesheet.UpdateUser;
import io.admin.timesheet.UserResponse;
import io.grpc.stub.StreamObserver;
import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

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
   * Creates a Project entity from a request.
   *
   * @param request {@link CreateProject} defines a request stub.
   * @return returns a Project object.
   */
  public static ProjectEntity createProjectRequest(CreateProject request) {
    final ProjectEntity project = ProjectEntity.newInstance();
    final EmployeeDetailEntity employeeDetail = EmployeeDetailEntity.newInstance();
    employeeDetail.setId(request.getEmployeeDetailId().getId());
    project.setEmployeeDetail(employeeDetail);
    project.setProjectName(request.getProjectName());
    project.setProjectStatus(request.getProjectStatus());
    project.setStartDate(Timestamp.valueOf(request.getStartDate()));
    project.setEndDate(Timestamp.valueOf(request.getEndDate()));
    return project;
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
   * Updates an existing entity class from a request.
   *
   * @param request {@link UpdateProject} defines a request stub.
   * @param updatedProject {@link ProjectEntity} defines an entity class.
   * @return returns a ProjectEntity object.
   */
  public static ProjectEntity updateProjectRequest(
        UpdateProject request, ProjectEntity updatedProject) {
    updatedProject.setId(request.getId());
    updatedProject.setProjectName(request.getRequest().getProjectName());
    updatedProject.setProjectStatus(request.getRequest().getProjectStatus());
    updatedProject.setStartDate(Timestamp.valueOf(request.getRequest().getStartDate()));
    updatedProject.setEndDate(Timestamp.valueOf(request.getRequest().getEndDate()));
    return updatedProject;
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
   * A request that gets a project by id.
   *
   * @param id defines an id.
   * @return returns a long.
   */
  public static Long getProjectByIdRequest(Long id) {
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

  /**
   * Creates a Project response.
   *
   * @param project {@link ProjectEntity} defines a EmployeeDetail entity.
   * @param responseObserver {@link ProjectResponse} defines a StreamObserver response stub.
   * @return returns a StreamObserver response for EmployeeDetail.
   */
  public static StreamObserver<ProjectResponse> projectResponse(
      ProjectEntity project, StreamObserver<ProjectResponse>
      responseObserver) {
    io.admin.timesheet.ProjectResponse.Builder projectResponseBuilder =
        ProjectResponse.newBuilder()
        .setId(project.getId())
        .setProjectName(project.getProjectName())
        .setProjectStatus(project.getProjectStatus())
        .setStartDate(project.getStartDate().toString())
        .setEndDate(project.getEndDate().toString());
    ProjectResponse projectResponse = projectResponseBuilder.build();
    responseObserver.onNext(projectResponse);
    responseObserver.onCompleted();
    return responseObserver;
  }

  /**
   * Creates a Project response.
   *
   * @param project {@link ProjectEntity} defines a EmployeeDetail entity.
   * @param responseObserver {@link ProjectResponse} defines a StreamObserver response stub.
   * @return returns a StreamObserver response for EmployeeDetail.
   */
  public static StreamObserver<GetProjectsResponse> getProjectsResponse(
      EmployeeDetailEntity employee, StreamObserver<GetProjectsResponse>
      responseObserver) {
    List<ProjectEntity> projects = employee.getProjects();
    List<io.admin.timesheet.ProjectResponse> employeeProjects = projects.stream().map(projectz -> io.admin.timesheet.ProjectResponse.newBuilder()
        .setId(projectz.getId())
        .setProjectName(projectz.getProjectName())
        .setProjectStatus(projectz.getProjectStatus())
        .setStartDate(projectz.getStartDate().toString())
        .setEndDate(projectz.getEndDate().toString()).build())
        .collect(Collectors.toList());
    GetProjectsResponse projectResponse = GetProjectsResponse.newBuilder().addAllProjects(employeeProjects).build();
    responseObserver.onNext(projectResponse);
    responseObserver.onCompleted();
    return responseObserver;
  }

}
