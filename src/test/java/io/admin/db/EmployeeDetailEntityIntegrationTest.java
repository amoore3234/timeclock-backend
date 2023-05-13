package io.admin.db;

import static org.assertj.core.api.Assertions.assertThat;

import io.admin.core.EmployeeDetailEntity;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeDetailEntityIntegrationTest extends AbstractRepositoryIntegrationTest {
  private EmployeeDetailEntityRepository employeeDetailRepository;

  @BeforeEach
  void setUp() {
    employeeDetailRepository = new EmployeeDetailEntityRepository(daoTest.getSessionFactory());
  }

  @Test
  void testFindAll() {
    final int count = 3;
    final Long[] ids = new Long[count];
    for (int i = 0; i < count; i++) {
      ids[i] = newEmployeeDetail();
    }
    final List<Long> idList = new ArrayList<>();
    for (EmployeeDetailEntity entity : employeeDetailRepository.findAll()) {
      idList.add(entity.getId());
    }
    assertThat(idList).hasSizeGreaterThanOrEqualTo(count).contains(ids);
  }

  @Test
  void testGeyById() {
    final long id = newEmployeeDetail();

    final EmployeeDetailEntity employeeDetailEntity = employeeDetailRepository.getById(id).get();

    assertThat(employeeDetailEntity.getUserLogin()).isNotNull();
    assertThat(employeeDetailEntity.getFirstName()).isNotNull();
    assertThat(employeeDetailEntity.getLastName()).isNotNull();
    assertThat(employeeDetailEntity.getEmployeeType()).isNotNull();
    assertThat(employeeDetailEntity.getEmployeeGrade()).isNotNull();
    assertThat(employeeDetailEntity.getStartDate()).isNotNull();
    assertThat(employeeDetailEntity.getEndDate()).isNotNull();
  }

  @Test
  void testDeleteById() {
    final long id = newEmployeeDetail();

    daoTest.inTransaction(() -> employeeDetailRepository.deleteById(id));

    assertThat(employeeDetailRepository.getById(id)).isEmpty();
  }

  @Test
  void testDeleteByEntity() {
    final long id = newEmployeeDetail();

    final EmployeeDetailEntity employeeDetailEntity = employeeDetailRepository.getById(id).get();
    daoTest.inTransaction(() -> employeeDetailRepository.delete(employeeDetailEntity));

    assertThat(employeeDetailRepository.getById(id).isPresent()).isEqualTo(false);
  }

  private Long newEmployeeDetail() {
    final EmployeeDetailEntity employeeDetailEntity = daoTest
        .inTransaction(() -> EntityUtil.employeeDetailTestEntity(daoTest.getSessionFactory()));
    daoTest.getSessionFactory().getCurrentSession().clear();
    return employeeDetailEntity.getId();
  }

}
