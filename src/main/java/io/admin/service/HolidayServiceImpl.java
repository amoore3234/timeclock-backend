package io.admin.service;

import io.admin.DbBuilder;
import io.admin.core.HolidayEntity;
import io.admin.db.HolidayEntityRepository;
import io.admin.timesheet.CreateHoliday;
import io.admin.timesheet.GetHolidayById;
import io.admin.timesheet.HolidayResponse;
import io.admin.timesheet.HolidayServiceGrpc.HolidayServiceImplBase;
import io.admin.timesheet.UpdateHoliday;
import io.admin.util.RequestBuilderUtil;
import io.dropwizard.hibernate.UnitOfWork;
import io.grpc.stub.StreamObserver;

/**
 * A service class that includes service methods for HolidayService class.
 */
public class HolidayServiceImpl extends HolidayServiceImplBase {

  private DbBuilder dbBuilder;

  public HolidayServiceImpl(DbBuilder dbBuilder) {
    this.dbBuilder = dbBuilder;
  }

  @UnitOfWork
  @Override
  public void createHoliday(CreateHoliday request,
      StreamObserver<HolidayResponse> responseObserver) {
    final HolidayEntityRepository repository = dbBuilder.getHolidayEntityRepository();
    HolidayEntity entity = RequestBuilderUtil.createHolidayRequest(request);
    HolidayEntity response = repository.save(entity);
    RequestBuilderUtil.holidayResponse(response, responseObserver);
  }

  @UnitOfWork
  @Override
  public void updateHoliday(UpdateHoliday request,
      StreamObserver<HolidayResponse> responseObserver) {
    final HolidayEntityRepository repository = dbBuilder.getHolidayEntityRepository();
    HolidayEntity entity = repository.getById(request.getId()).get();
    HolidayEntity newEntity = RequestBuilderUtil.updateHolidayRequest(request, entity);
    HolidayEntity response = repository.save(newEntity);
    RequestBuilderUtil.holidayResponse(response, responseObserver);
  }

  @UnitOfWork
  @Override
  public void getHolidayById(GetHolidayById request,
      StreamObserver<HolidayResponse> responseObserver) {
    final HolidayEntityRepository repository = dbBuilder.getHolidayEntityRepository();
    Long id = request.getId();
    HolidayEntity response = repository.getById(id).get();
    RequestBuilderUtil.holidayResponse(response, responseObserver);
  }

  @UnitOfWork
  @Override
  public void deleteHoliday(GetHolidayById request,
      StreamObserver<HolidayResponse> responseObserver) {
    final HolidayEntityRepository repository = dbBuilder.getHolidayEntityRepository();
    Long id = request.getId();
    HolidayEntity response = repository.getById(id).get();
    repository.deleteById(id);
    RequestBuilderUtil.holidayResponse(response, responseObserver);
  }
}
