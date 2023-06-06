package io.admin.service;

import static org.assertj.core.api.Assertions.assertThat;

import io.admin.core.EmployeeDetailEntity;
import io.admin.core.ProjectEntity;
import io.admin.db.ProjectEntityRepository;
import java.sql.Timestamp;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

public class ProjectServiceImplTest {

  private ProjectEntityRepository projectEntityRepository;

  @BeforeEach
  void setUp() {
    projectEntityRepository = Mockito.mock(ProjectEntityRepository.class);
  }

  @Test
  void testGetEmployeeDetailById() {
    final String date = "2020-07-01 19:10:25";
    final Long id = 1L;
    final Long employeeDetailId = 1L;
    final String projectName = "test project name";
    final String projectStatus = "active";
    final Timestamp startDate = Timestamp.valueOf(date);
    final Timestamp endDate = Timestamp.valueOf(date);

    final ProjectEntity mockProjectEntity = Mockito.mock(ProjectEntity.class);
    final EmployeeDetailEntity mockEmployeeDetailEntity = Mockito.mock(EmployeeDetailEntity.class);

    Mockito.when(mockEmployeeDetailEntity.getId()).thenReturn(employeeDetailId);

    Mockito.when(mockProjectEntity.getEmployeeDetail()).thenReturn(mockEmployeeDetailEntity);
    Mockito.when(mockProjectEntity.getProjectName()).thenReturn(projectName);
    Mockito.when(mockProjectEntity.getProjectStatus()).thenReturn(projectStatus);
    Mockito.when(mockProjectEntity.getStartDate()).thenReturn(startDate);
    Mockito.when(mockProjectEntity.getEndDate()).thenReturn(endDate);


    Mockito.when(projectEntityRepository.getById(Mockito.any(Long.class)))
        .thenReturn(Optional.of(mockProjectEntity));

    final ArgumentCaptor<Long> idCaptor = ArgumentCaptor.forClass(Long.class);
    projectEntityRepository.save(mockProjectEntity);
    ProjectEntity response = projectEntityRepository.getById(id).get();
    Mockito.verify(projectEntityRepository).getById(idCaptor.capture());

    assertThat(idCaptor.getValue()).isEqualTo(id);
    assertThat(mockProjectEntity.getProjectName()).isEqualTo(projectName);
    assertThat(mockProjectEntity.getProjectStatus()).isEqualTo(projectStatus);
    assertThat(mockProjectEntity.getStartDate()).isEqualTo(startDate);
    assertThat(mockProjectEntity.getEndDate()).isEqualTo(endDate);
    assertThat(response.getProjectName()).isEqualTo(projectName);
    assertThat(response.getProjectStatus()).isEqualTo(projectStatus);
    assertThat(response.getStartDate()).isEqualTo(startDate);
    assertThat(response.getEndDate()).isEqualTo(endDate);
  }

  @Test
  void testCreateUser() {
    final String date = "2020-07-01 19:10:25";
    final Long employeeDetailId = 1L;
    final String projectName = "test project name";
    final String projectStatus = "active";
    final Timestamp startDate = Timestamp.valueOf(date);
    final Timestamp endDate = Timestamp.valueOf(date);

    final ProjectEntity mockProjectEntity = Mockito.mock(ProjectEntity.class);
    final EmployeeDetailEntity mockEmployeeDetailEntity = Mockito.mock(EmployeeDetailEntity.class);

    Mockito.when(mockEmployeeDetailEntity.getId()).thenReturn(employeeDetailId);

    Mockito.when(mockProjectEntity.getEmployeeDetail()).thenReturn(mockEmployeeDetailEntity);
    Mockito.when(mockProjectEntity.getProjectName()).thenReturn(projectName);
    Mockito.when(mockProjectEntity.getProjectStatus()).thenReturn(projectStatus);
    Mockito.when(mockProjectEntity.getStartDate()).thenReturn(startDate);
    Mockito.when(mockProjectEntity.getEndDate()).thenReturn(endDate);

    Mockito.when(projectEntityRepository.save(Mockito.any(ProjectEntity.class)))
        .thenReturn(mockProjectEntity);
    final ArgumentCaptor<ProjectEntity> captor =
        ArgumentCaptor.forClass(ProjectEntity.class);
    final ProjectEntity response = projectEntityRepository
          .save(mockProjectEntity);
    Mockito.verify(projectEntityRepository).save(captor.capture());
    final ProjectEntity created = captor.getValue();

    assertThat(mockProjectEntity.getEmployeeDetail()).isNotNull();
    assertThat(mockProjectEntity.getProjectName()).isEqualTo(projectName);
    assertThat(mockProjectEntity.getProjectStatus()).isEqualTo(projectStatus);
    assertThat(mockProjectEntity.getStartDate()).isEqualTo(startDate);
    assertThat(mockProjectEntity.getEndDate()).isEqualTo(endDate);
    assertThat(response.getEmployeeDetail()).isNotNull();
    assertThat(response.getProjectName()).isEqualTo(projectName);
    assertThat(response.getProjectStatus()).isEqualTo(projectStatus);
    assertThat(response.getStartDate()).isEqualTo(startDate);
    assertThat(response.getEndDate()).isEqualTo(endDate);
    assertThat(created.getEmployeeDetail()).isNotNull();
    assertThat(created.getProjectName()).isEqualTo(projectName);
    assertThat(created.getProjectStatus()).isEqualTo(projectStatus);
    assertThat(created.getStartDate()).isEqualTo(startDate);
    assertThat(created.getEndDate()).isEqualTo(endDate);
  }

  @Test
  void testUpdateUser() {
    final String date = "2020-07-01 19:10:25";
    final Long id = 1L;
    final Long employeeDetailId = 1L;
    final String projectName = "test project name";
    final String projectStatus = "active";
    final Timestamp startDate = Timestamp.valueOf(date);
    final Timestamp endDate = Timestamp.valueOf(date);

    final ProjectEntity mockProjectEntity = Mockito.mock(ProjectEntity.class);
    final EmployeeDetailEntity mockEmployeeDetailEntity = Mockito.mock(EmployeeDetailEntity.class);

    Mockito.when(mockEmployeeDetailEntity.getId()).thenReturn(employeeDetailId);

    Mockito.when(mockProjectEntity.getEmployeeDetail()).thenReturn(mockEmployeeDetailEntity);
    Mockito.when(mockProjectEntity.getProjectName()).thenReturn(projectName);
    Mockito.when(mockProjectEntity.getProjectStatus()).thenReturn(projectStatus);
    Mockito.when(mockProjectEntity.getStartDate()).thenReturn(startDate);
    Mockito.when(mockProjectEntity.getEndDate()).thenReturn(endDate);

    Mockito.when(projectEntityRepository.save(Mockito.any(ProjectEntity.class)))
        .thenReturn(mockProjectEntity);
    Mockito.when(projectEntityRepository.getById(Mockito.any(Long.class)))
        .thenReturn(Optional.of(mockProjectEntity));

    final ProjectEntity response = projectEntityRepository.getById(id).get();

    assertThat(response.getProjectName()).isEqualTo(projectName);
    assertThat(response.getProjectStatus()).isEqualTo(projectStatus);
    assertThat(response.getStartDate()).isEqualTo(startDate);
    assertThat(response.getEndDate()).isEqualTo(endDate);
  }

  @Test
  void testDeletById() {
    final Long id = 1L;

    ProjectEntity mockProjectEntity = Mockito.mock(ProjectEntity.class);

    Mockito.when(mockProjectEntity.getId()).thenReturn(id);

    Mockito.when(projectEntityRepository.getById(Mockito.any(Long.class)))
        .thenReturn(Optional.of(mockProjectEntity));

    final ArgumentCaptor<Long> idCaptor = ArgumentCaptor.forClass(Long.class);
    projectEntityRepository.deleteById(id);
    Mockito.verify(projectEntityRepository).deleteById(idCaptor.capture());

    assertThat(idCaptor.getValue()).isEqualTo(id);
  }
}
