package io.admin.db;

import static org.assertj.core.api.Assertions.assertThat;

import io.admin.core.HolidayEntity;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HolidayEntityIntegrationTest extends AbstractRepositoryIntegrationTest {
  private HolidayEntityRepository holidayRepository;

  @BeforeEach
  void setUp() {
    holidayRepository = new HolidayEntityRepository(daoTest.getSessionFactory());
  }

  @Test
  void testFindAll() {
    final int count = 3;
    final Long[] ids = new Long[count];
    for (int i = 0; i < count; i++) {
      ids[i] = newHoliday();
    }
    final List<Long> idList = new ArrayList<>();
    for (HolidayEntity entity : holidayRepository.findAll()) {
      idList.add(entity.getId());
    }
    assertThat(idList).hasSizeGreaterThanOrEqualTo(count).contains(ids);
  }

  @Test
  void testGeyById() {
    final long id = newHoliday();

    final HolidayEntity holidayEntity = holidayRepository.getById(id).get();

    assertThat(holidayEntity.getHolidayName()).isNotNull();
    assertThat(holidayEntity.getDate()).isNotNull();
  }

  @Test
  void testDeleteById() {
    final long id = newHoliday();

    daoTest.inTransaction(() -> holidayRepository.deleteById(id));

    assertThat(holidayRepository.getById(id)).isEmpty();
  }

  @Test
  void testDeleteByEntity() {
    final long id = newHoliday();

    final HolidayEntity holidayEntity = holidayRepository.getById(id).get();
    daoTest.inTransaction(() -> holidayRepository.delete(holidayEntity));

    assertThat(holidayRepository.getById(id).isPresent()).isEqualTo(false);
  }

  private Long newHoliday() {
    final HolidayEntity holidayEntity = daoTest
        .inTransaction(() -> EntityUtil.holidayTestEntity(daoTest.getSessionFactory()));
    daoTest.getSessionFactory().getCurrentSession().clear();
    return holidayEntity.getId();
  }

}
