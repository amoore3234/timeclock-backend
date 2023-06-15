package io.admin.util;

import io.admin.core.EmployeeDetailEntity;
import io.admin.core.HolidayEntity;
import io.admin.core.ProjectEntity;
import io.admin.core.TimesheetEntity;
import io.admin.core.UserLoginEntity;
import io.admin.timesheet.CreateEmployeeDetail;
import io.admin.timesheet.CreateHoliday;
import io.admin.timesheet.CreateProject;
import io.admin.timesheet.CreateTimesheet;
import io.admin.timesheet.CreateUser;
import io.admin.timesheet.EmployeeDetailResponse;
import io.admin.timesheet.GetProjectsResponse;
import io.admin.timesheet.HolidayResponse;
import io.admin.timesheet.ProjectResponse;
import io.admin.timesheet.TimesheetResponse;
import io.admin.timesheet.UpdateEmployeeDetail;
import io.admin.timesheet.UpdateHoliday;
import io.admin.timesheet.UpdateProject;
import io.admin.timesheet.UpdateTimesheet;
import io.admin.timesheet.UpdateUser;
import io.admin.timesheet.UserResponse;
import io.grpc.stub.StreamObserver;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
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
   * Creates a Holiday entity from a request.
   *
   * @param request {@link CreateHoliday} defines a request stub.
   * @return returns a UserLogin object.
   */
  public static HolidayEntity createHolidayRequest(CreateHoliday request) {
    final HolidayEntity holiday = HolidayEntity.newInstance();
    holiday.setHolidayName(request.getHolidayName());
    holiday.setDate(Timestamp.valueOf(request.getDate()));
    return holiday;
  }

  /**
   * Creates a Timesheet entity from a request.
   *
   * @param request {@link CreateTimesheet} defines a request stub.
   * @return returns a Timesheet object.
   */
  public static TimesheetEntity createTimesheetRequest(CreateTimesheet request) {
    Instant instant = Instant.ofEpochMilli(request.getClockIn().getNanos());
    final HolidayEntity holiday = HolidayEntity.newInstance();
    final TimesheetEntity timesheet = TimesheetEntity.newInstance();
    holiday.setId(request.getHolidayId().getId());
    timesheet.setHoliday(holiday);
    timesheet.setClockIn(OffsetDateTime.ofInstant(instant, ZoneId.systemDefault()));
    timesheet.setClockOut(OffsetDateTime.ofInstant(instant, ZoneId.systemDefault()));
    timesheet.setLunch(OffsetDateTime.ofInstant(instant, ZoneId.systemDefault()));
    timesheet.setHoursWorked(request.getHoursWorked());
    timesheet.setOvertime(request.getOvertime());
    return timesheet;
  }

  /**
   * Creates a Timesheet entity from a request.
   *
   * @param request {@link UpdateTimesheet} defines a request stub.
   * @return returns a Timesheet object.
   */
  public static TimesheetEntity updateTimesheetRequest(UpdateTimesheet request,
      TimesheetEntity updateTimesheet) {
    final HolidayEntity holiday = HolidayEntity.newInstance();
    final TimesheetEntity timesheet = TimesheetEntity.newInstance();
    holiday.setId(request.getRequest().getHolidayId().getId());
    updateTimesheet.setHoliday(holiday);
    updateTimesheet.setHoursWorked(request.getRequest().getHoursWorked());
    updateTimesheet.setOvertime(request.getRequest().getOvertime());
    return timesheet;
  }

  /**
   * Creates a Holiday entity from a request.
   *
   * @param request {@link UpdateHoliday} defines a request stub.
   * @return returns a Holiday object.
   */
  public static HolidayEntity updateHolidayRequest(UpdateHoliday request,
      HolidayEntity updateHoliday) {
    updateHoliday.setId(request.getId());
    updateHoliday.setHolidayName(request.getRequest().getHolidayName());
    updateHoliday.setDate(Timestamp.valueOf(request.getRequest().getDate()));
    return updateHoliday;
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
   * Creates a Project list response.
   *
   * @param employee {@link EmployeeDetailEntity} defines a EmployeeDetail entity.
   * @param responseObserver {@link GetProjectsResponse} defines a StreamObserver response stub.
   * @return returns a StreamObserver response for a list of projects for an employee.
   */
  public static StreamObserver<GetProjectsResponse> getProjectsResponse(
      EmployeeDetailEntity employee, StreamObserver<GetProjectsResponse>
      responseObserver) {
    List<ProjectEntity> projects = employee.getProjects();
    List<io.admin.timesheet.ProjectResponse> employeeProjects = projects.stream()
        .map(project -> io.admin.timesheet.ProjectResponse.newBuilder()
          .setId(project.getId())
          .setProjectName(project.getProjectName())
          .setProjectStatus(project.getProjectStatus())
          .setStartDate(project.getStartDate().toString())
          .setEndDate(project.getEndDate().toString()).build())
          .collect(Collectors.toList());
    GetProjectsResponse projectResponse = GetProjectsResponse.newBuilder()
        .addAllProjects(employeeProjects).build();
    responseObserver.onNext(projectResponse);
    responseObserver.onCompleted();
    return responseObserver;
  }

  /**
   * Creates a Holiday response.
   *
   * @param holiday {@link HolidayEntity} defines a Holiday entity.
   * @param responseObserver {@link HolidayResponse} defines a StreamObserver response stub.
   * @return returns a StreamObserver response for Holiday.
   */
  public static StreamObserver<HolidayResponse> holidayResponse(
      HolidayEntity holiday, StreamObserver<HolidayResponse> responseObserver) {
    io.admin.timesheet.HolidayResponse.Builder holidayResponseBuilder = HolidayResponse.newBuilder()
        .setId(holiday.getId())
        .setHolidayName(holiday.getHolidayName())
        .setDate(holiday.getDate().toString());
    HolidayResponse holidayResponse = holidayResponseBuilder.build();
    responseObserver.onNext(holidayResponse);
    responseObserver.onCompleted();
    return responseObserver;
  }

  /**
   * Creates a Timesheet response.
   *
   * @param timesheet {@link TimesheetEntity} defines a Timesheet entity.
   * @param responseObserver {@link TimesheetResponse} defines a StreamObserver response stub.
   * @return returns a StreamObserver response for Timesheet.
   */
  public static StreamObserver<TimesheetResponse> timesheetResponse(
      TimesheetEntity timesheet, StreamObserver<TimesheetResponse> responseObserver) {
    io.admin.timesheet.TimesheetResponse.Builder timesheetResponseBuilder = TimesheetResponse.newBuilder()
        .setId(timesheet.getId())
        .setClockIn(com.google.protobuf.Timestamp.newBuilder().setNanos(timesheet.getClockIn().getNano()).build())
        .setClockOut(com.google.protobuf.Timestamp.newBuilder().setNanos(timesheet.getClockOut().getNano()).build())
        .setLunch(com.google.protobuf.Timestamp.newBuilder().setNanos(timesheet.getLunch().getNano()).build())
        .setHoursWorked(timesheet.getHoursWorked())
        .setOvertime(timesheet.getOvertime());
    TimesheetResponse timesheetResponse = timesheetResponseBuilder.build();
    responseObserver.onNext(timesheetResponse);
    responseObserver.onCompleted();
    return responseObserver;
  }

}
