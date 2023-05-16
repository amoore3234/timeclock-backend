package io.admin.service;

import io.admin.DbBuilder;
import io.admin.core.UserLoginEntity;
import io.admin.db.UserLoginEntityRepository;
import io.admin.timesheet.CreateUser;
import io.admin.timesheet.GetUserById;
import io.admin.timesheet.UpdateUser;
import io.admin.timesheet.UserLoginServiceGrpc.UserLoginServiceImplBase;
import io.admin.timesheet.UserResponse;
import io.admin.util.RequestBuilderUtil;
import io.dropwizard.hibernate.UnitOfWork;
import io.grpc.stub.StreamObserver;

/**
 * A service class that includes service methods for UserLoginEntity class.
 */
public class UserLoginServiceImpl extends UserLoginServiceImplBase {

  private DbBuilder dbBuilder;

  public UserLoginServiceImpl(DbBuilder dbBuilder) {
    this.dbBuilder = dbBuilder;
  }

  @UnitOfWork
  @Override
  public void createUser(CreateUser request, StreamObserver<UserResponse> responseObserver) {
    final UserLoginEntityRepository repository = dbBuilder.getUserLoginEntityRepository();
    UserLoginEntity entity = RequestBuilderUtil.createUserLoginRequest(request);
    UserLoginEntity userLoginEntity = repository.save(entity);
    RequestBuilderUtil.userLoginResponse(userLoginEntity, responseObserver);
  }

  @UnitOfWork
  @Override
  public void updateUser(UpdateUser request, StreamObserver<UserResponse> responseObserver) {
    final UserLoginEntityRepository repository = dbBuilder.getUserLoginEntityRepository();
    UserLoginEntity entity = repository.getById(request.getId()).get();
    UserLoginEntity newEntity = RequestBuilderUtil.updateUserLoginRequest(request, entity);
    UserLoginEntity updatedEntity = repository.save(newEntity);
    RequestBuilderUtil.userLoginResponse(updatedEntity, responseObserver);

  }

  @UnitOfWork
  @Override
  public void getUserById(GetUserById request, StreamObserver<UserResponse> responseObserver) {
    final UserLoginEntityRepository repository = dbBuilder.getUserLoginEntityRepository();
    Long id = RequestBuilderUtil.getUserByIdRequest(request.getId());
    UserLoginEntity userLoginEntity = repository.getById(id).get();
    RequestBuilderUtil.userLoginResponse(userLoginEntity, responseObserver);
  }

  @UnitOfWork
  @Override
  public void deleteUserById(GetUserById request, StreamObserver<UserResponse> responseObserver) {
    final UserLoginEntityRepository repository = dbBuilder.getUserLoginEntityRepository();
    Long id = RequestBuilderUtil.getUserByIdRequest(request.getId());
    UserLoginEntity userLoginEntity = repository.getById(id).get();
    repository.deleteById(id);
    RequestBuilderUtil.userLoginResponse(userLoginEntity, responseObserver);
  }
}
