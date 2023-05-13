package io.admin.db;

import static org.assertj.core.api.Assertions.assertThat;

import io.admin.core.ProjectEntity;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProjectEntityIntegrationTest extends AbstractRepositoryIntegrationTest {
  private ProjectEntityRepository projectRepository;

  @BeforeEach
  void setUp() {
    projectRepository = new ProjectEntityRepository(daoTest.getSessionFactory());
  }

  @Test
  void testFindAll() {
    final int count = 3;
    final Long[] ids = new Long[count];
    for (int i = 0; i < count; i++) {
      ids[i] = newProject();
    }
    final List<Long> idList = new ArrayList<>();
    for (ProjectEntity entity : projectRepository.findAll()) {
      idList.add(entity.getId());
    }
    assertThat(idList).hasSizeGreaterThanOrEqualTo(count).contains(ids);
  }

  @Test
  void testGeyById() {
    final long id = newProject();

    final ProjectEntity projectEntity = projectRepository.getById(id).get();

    assertThat(projectEntity.getEmployeeDetail()).isNotNull();
    assertThat(projectEntity.getProjectName()).isNotNull();
    assertThat(projectEntity.getStartDate()).isNotNull();
    assertThat(projectEntity.getEndDate()).isNotNull();
    assertThat(projectEntity.getProjectStatus()).isNotNull();
  }

  @Test
  void testDeleteById() {
    final long id = newProject();

    daoTest.inTransaction(() -> projectRepository.deleteById(id));

    assertThat(projectRepository.getById(id)).isEmpty();
  }

  @Test
  void testDeleteByEntity() {
    final long id = newProject();

    final ProjectEntity projectEntity = projectRepository.getById(id).get();
    daoTest.inTransaction(() -> projectRepository.delete(projectEntity));

    assertThat(projectRepository.getById(id).isPresent()).isEqualTo(false);
  }

  private Long newProject() {
    final ProjectEntity projectEntity = daoTest
        .inTransaction(() -> EntityUtil.projectTestEntity(daoTest.getSessionFactory()));
    daoTest.getSessionFactory().getCurrentSession().clear();
    return projectEntity.getId();
  }

}
