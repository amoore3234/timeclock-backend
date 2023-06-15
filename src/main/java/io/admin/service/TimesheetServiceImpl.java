package io.admin.service;

import io.admin.DbBuilder;
import io.admin.core.TimesheetEntity;
import io.admin.db.TimesheetEntityRepository;
import io.admin.timesheet.CreateTimesheet;
import io.admin.timesheet.GetTimesheetById;
import io.admin.timesheet.TimesheetResponse;
import io.admin.timesheet.TimesheetServiceGrpc.TimesheetServiceImplBase;
import io.admin.timesheet.UpdateTimesheet;
import io.admin.util.RequestBuilderUtil;
import io.dropwizard.hibernate.UnitOfWork;
import io.grpc.stub.StreamObserver;

public class TimesheetServiceImpl extends TimesheetServiceImplBase {

  private DbBuilder dbBuilder;

  public TimesheetServiceImpl(DbBuilder dbBuilder) {
    this.dbBuilder = dbBuilder;
  }

  @UnitOfWork
  @Override
  public void createTimesheet(CreateTimesheet request,
      StreamObserver<TimesheetResponse> responseObserver) {
    final TimesheetEntityRepository repository = dbBuilder.getTimesheetEntityRepository();
    TimesheetEntity entity = RequestBuilderUtil.createTimesheetRequest(request);
    TimesheetEntity response = repository.save(entity);
    RequestBuilderUtil.timesheetResponse(response, responseObserver);
  }

  @UnitOfWork
  @Override
  public void updateTimesheet(UpdateTimesheet request,
      StreamObserver<TimesheetResponse> responseObserver) {
    final TimesheetEntityRepository repository = dbBuilder.getTimesheetEntityRepository();
    TimesheetEntity entity = repository.getById(request.getId()).get();
    TimesheetEntity newEntity =
        RequestBuilderUtil.updateTimesheetRequest(request, entity);
    TimesheetEntity response = repository.save(newEntity);
    RequestBuilderUtil.timesheetResponse(response, responseObserver);
  }

  @UnitOfWork
  @Override
  public void getTimesheetById(GetTimesheetById request,
      StreamObserver<TimesheetResponse> responseObserver) {
    final TimesheetEntityRepository repository = dbBuilder.getTimesheetEntityRepository();
    Long id = request.getId();
    TimesheetEntity response = repository.getById(id).get();
    RequestBuilderUtil.timesheetResponse(response, responseObserver);
  }

  @UnitOfWork
  @Override
  public void deleteTimesheet(GetTimesheetById request,
      StreamObserver<TimesheetResponse> responseObserver) {
    final TimesheetEntityRepository repository = dbBuilder.getTimesheetEntityRepository();
    Long id = request.getId();
    TimesheetEntity response = repository.getById(id).get();
    repository.deleteById(id);
    RequestBuilderUtil.timesheetResponse(response, responseObserver);
  }
}
