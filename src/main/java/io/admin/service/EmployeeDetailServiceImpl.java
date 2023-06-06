package io.admin.service;

import io.admin.DbBuilder;
import io.admin.core.EmployeeDetailEntity;
import io.admin.db.EmployeeDetailEntityRepository;
import io.admin.timesheet.CreateEmployeeDetail;
import io.admin.timesheet.EmployeeDetailResponse;
import io.admin.timesheet.EmployeeDetailServiceGrpc.EmployeeDetailServiceImplBase;
import io.admin.timesheet.GetEmployeetDetailById;
import io.admin.timesheet.GetProjectsResponse;
import io.admin.timesheet.UpdateEmployeeDetail;
import io.admin.util.RequestBuilderUtil;
import io.dropwizard.hibernate.UnitOfWork;
import io.grpc.stub.StreamObserver;

/**
 * A service class that includes service methods for EmployeeDetailService class.
 */
public class EmployeeDetailServiceImpl extends EmployeeDetailServiceImplBase {

  private DbBuilder dbBuilder;

  public EmployeeDetailServiceImpl(DbBuilder dbBuilder) {
    this.dbBuilder = dbBuilder;
  }

  @UnitOfWork
  @Override
  public void createEmployeeDetail(CreateEmployeeDetail request,
      StreamObserver<EmployeeDetailResponse> responseObserver) {
    final EmployeeDetailEntityRepository repository = dbBuilder.getEmployeeDetailEntityRepository();
    EmployeeDetailEntity entity = RequestBuilderUtil.createEmployeeDetailRequest(request);
    EmployeeDetailEntity response = repository.save(entity);
    RequestBuilderUtil.employeeDetailResponse(response, responseObserver);
  }

  @UnitOfWork
  @Override
  public void updateEmployeeDetail(UpdateEmployeeDetail request,
      StreamObserver<EmployeeDetailResponse> responseObserver) {
    final EmployeeDetailEntityRepository repository = dbBuilder.getEmployeeDetailEntityRepository();
    EmployeeDetailEntity entity = repository.getById(request.getId()).get();
    EmployeeDetailEntity newEntity =
        RequestBuilderUtil.updateEmployeeDetailRequest(request, entity);
    EmployeeDetailEntity response = repository.save(newEntity);
    RequestBuilderUtil.employeeDetailResponse(response, responseObserver);
  }

  @UnitOfWork
  @Override
  public void getEmployeeDetailById(GetEmployeetDetailById request,
      StreamObserver<EmployeeDetailResponse> responseObserver) {
    final EmployeeDetailEntityRepository repository = dbBuilder.getEmployeeDetailEntityRepository();
    Long id = RequestBuilderUtil.getEmployeeDetailByIdRequest(request.getId());
    EmployeeDetailEntity response = repository.getById(id).get();
    RequestBuilderUtil.employeeDetailResponse(response, responseObserver);
  }

  @UnitOfWork
  @Override
  public void deleteEmployeeDetail(GetEmployeetDetailById request,
      StreamObserver<EmployeeDetailResponse> responseObserver) {
    final EmployeeDetailEntityRepository repository = dbBuilder.getEmployeeDetailEntityRepository();
    Long id = RequestBuilderUtil.getEmployeeDetailByIdRequest(request.getId());
    EmployeeDetailEntity response = repository.getById(id).get();
    repository.deleteById(id);
    RequestBuilderUtil.employeeDetailResponse(response, responseObserver);
  }

  @UnitOfWork
  @Override
  public void getProjects(GetEmployeetDetailById request,
      StreamObserver<GetProjectsResponse> responseObserver) {
    final EmployeeDetailEntityRepository repository = dbBuilder.getEmployeeDetailEntityRepository();
    Long id = request.getId();
    EmployeeDetailEntity response = repository.getById(id).get();
    RequestBuilderUtil.getProjectsResponse(response, responseObserver);
  }
}
