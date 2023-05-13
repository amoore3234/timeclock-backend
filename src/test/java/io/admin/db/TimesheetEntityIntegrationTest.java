package io.admin.db;

import static org.assertj.core.api.Assertions.assertThat;

import io.admin.core.TimesheetEntity;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TimesheetEntityIntegrationTest extends AbstractRepositoryIntegrationTest {
  private TimesheetEntityRepository timesheetRepository;

  @BeforeEach
  void setUp() {
    timesheetRepository = new TimesheetEntityRepository(daoTest.getSessionFactory());
  }

  @Test
  void testFindAll() {
    final int count = 3;
    final Long[] ids = new Long[count];
    for (int i = 0; i < count; i++) {
      ids[i] = newTimesheet();
    }
    final List<Long> idList = new ArrayList<>();
    for (TimesheetEntity entity : timesheetRepository.findAll()) {
      idList.add(entity.getId());
    }
    assertThat(idList).hasSizeGreaterThanOrEqualTo(count).contains(ids);
  }

  @Test
  void testGeyById() {
    final long id = newTimesheet();

    final TimesheetEntity timesheetEntity = timesheetRepository.getById(id).get();

    assertThat(timesheetEntity.getHoliday()).isNotNull();
    assertThat(timesheetEntity.getClockIn()).isNotNull();
    assertThat(timesheetEntity.getClockOut()).isNotNull();
    assertThat(timesheetEntity.getLunch()).isNotNull();
    assertThat(timesheetEntity.getHoursWorked()).isNotNull();
    assertThat(timesheetEntity.getOvertime()).isNotNull();
  }

  @Test
  void testDeleteById() {
    final long id = newTimesheet();

    daoTest.inTransaction(() -> timesheetRepository.deleteById(id));

    assertThat(timesheetRepository.getById(id)).isEmpty();
  }

  @Test
  void testDeleteByEntity() {
    final long id = newTimesheet();

    final TimesheetEntity timesheetEntity = timesheetRepository.getById(id).get();
    daoTest.inTransaction(() -> timesheetRepository.delete(timesheetEntity));

    assertThat(timesheetRepository.getById(id).isPresent()).isEqualTo(false);
  }

  private Long newTimesheet() {
    final TimesheetEntity timesheetEntity = daoTest
        .inTransaction(() -> EntityUtil.timesheetTestEntity(daoTest.getSessionFactory()));
    daoTest.getSessionFactory().getCurrentSession().clear();
    return timesheetEntity.getId();
  }

}
