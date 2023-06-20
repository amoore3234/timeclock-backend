package io.admin.service;

import io.admin.DbBuilder;
import io.admin.core.EmployeeTimesheetEntity;
import io.admin.db.EmployeeTimesheetEntityRepository;
import io.admin.timesheet.CreateEmployeeTimesheet;
import io.admin.timesheet.EmployeeTimesheetResponse;
import io.admin.timesheet.EmployeeTimesheetServiceGrpc.EmployeeTimesheetServiceImplBase;
import io.admin.timesheet.GetEmployeeTimesheetById;
import io.admin.timesheet.UpdateEmployeeTimesheet;
import io.admin.util.RequestBuilderUtil;
import io.dropwizard.hibernate.UnitOfWork;
import io.grpc.stub.StreamObserver;

public class EmployeeTimesheetServiceImpl extends EmployeeTimesheetServiceImplBase {

  private DbBuilder dbBuilder;

  public EmployeeTimesheetServiceImpl(DbBuilder dbBuilder) {
    this.dbBuilder = dbBuilder;
  }

  @UnitOfWork
  @Override
  public void createEmployeeTimesheet(CreateEmployeeTimesheet request,
      StreamObserver<EmployeeTimesheetResponse> responseObserver) {
    final EmployeeTimesheetEntityRepository repository = dbBuilder.getEmployeeTimesheetEntityRepository();
    EmployeeTimesheetEntity entity = RequestBuilderUtil.createEmployeeTimesheetRequest(request);
    EmployeeTimesheetEntity response = repository.save(entity);
    RequestBuilderUtil.employeeTimesheetResponse(response, responseObserver);
  }

  @UnitOfWork
  @Override
  public void updateEmployeeTimesheet(UpdateEmployeeTimesheet request,
      StreamObserver<EmployeeTimesheetResponse> responseObserver) {
    final EmployeeTimesheetEntityRepository repository = dbBuilder.getEmployeeTimesheetEntityRepository();
    EmployeeTimesheetEntity entity = repository.getById(request.getId()).get();
    EmployeeTimesheetEntity newEntity =
        RequestBuilderUtil.updateEmployeeTimesheetRequest(request, entity);
    EmployeeTimesheetEntity response = repository.save(newEntity);
    RequestBuilderUtil.employeeTimesheetResponse(response, responseObserver);
  }

  @UnitOfWork
  @Override
  public void getEmployeeTimesheetById(GetEmployeeTimesheetById request,
      StreamObserver<EmployeeTimesheetResponse> responseObserver) {
    final EmployeeTimesheetEntityRepository repository = dbBuilder.getEmployeeTimesheetEntityRepository();
    Long id = request.getId();
    EmployeeTimesheetEntity response = repository.getById(id).get();
    RequestBuilderUtil.employeeTimesheetResponse(response, responseObserver);
  }

  @UnitOfWork
  @Override
  public void deleteEmployeeTimesheet(GetEmployeeTimesheetById request,
      StreamObserver<EmployeeTimesheetResponse> responseObserver) {
    final EmployeeTimesheetEntityRepository repository = dbBuilder.getEmployeeTimesheetEntityRepository();
    Long id = request.getId();
    EmployeeTimesheetEntity response = repository.getById(id).get();
    repository.deleteById(id);
    RequestBuilderUtil.employeeTimesheetResponse(response, responseObserver);
  }
}
