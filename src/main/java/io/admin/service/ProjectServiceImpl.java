package io.admin.service;

import io.admin.DbBuilder;
import io.admin.core.ProjectEntity;
import io.admin.db.ProjectEntityRepository;
import io.admin.timesheet.CreateProject;
import io.admin.timesheet.GetProjectById;
import io.admin.timesheet.ProjectResponse;
import io.admin.timesheet.ProjectServiceGrpc.ProjectServiceImplBase;
import io.admin.timesheet.UpdateProject;
import io.admin.util.RequestBuilderUtil;
import io.dropwizard.hibernate.UnitOfWork;
import io.grpc.stub.StreamObserver;

public class ProjectServiceImpl extends ProjectServiceImplBase {

  private DbBuilder dbBuilder;

  public ProjectServiceImpl(DbBuilder dbBuilder) {
    this.dbBuilder = dbBuilder;
  }

  @UnitOfWork
  @Override
  public void createProject(CreateProject request,
      StreamObserver<ProjectResponse> responseObserver) {
    final ProjectEntityRepository repository = dbBuilder.getProjectEntityRepository();
    ProjectEntity entity = RequestBuilderUtil.createProjectRequest(request);
    ProjectEntity response = repository.save(entity);
    RequestBuilderUtil.projectResponse(response, responseObserver);
  }

  @UnitOfWork
  @Override
  public void updateProject(UpdateProject request,
      StreamObserver<ProjectResponse> responseObserver) {
    final ProjectEntityRepository repository = dbBuilder.getProjectEntityRepository();
    ProjectEntity entity = repository.getById(request.getId()).get();
    ProjectEntity newEntity =
        RequestBuilderUtil.updateProjectRequest(request, entity);
    ProjectEntity response = repository.save(newEntity);
    RequestBuilderUtil.projectResponse(response, responseObserver);
  }

  @UnitOfWork
  @Override
  public void getProjectById(GetProjectById request,
      StreamObserver<ProjectResponse> responseObserver) {
    final ProjectEntityRepository repository = dbBuilder.getProjectEntityRepository();
    Long id = RequestBuilderUtil.getProjectByIdRequest(request.getId());
    ProjectEntity response = repository.getById(id).get();
    RequestBuilderUtil.projectResponse(response, responseObserver);
  }

  @UnitOfWork
  @Override
  public void deleteProject(GetProjectById request,
      StreamObserver<ProjectResponse> responseObserver) {
    final ProjectEntityRepository repository = dbBuilder.getProjectEntityRepository();
    Long id = RequestBuilderUtil.getProjectByIdRequest(request.getId());
    ProjectEntity response = repository.getById(id).get();
    repository.deleteById(id);
    RequestBuilderUtil.projectResponse(response, responseObserver);
  }
}
