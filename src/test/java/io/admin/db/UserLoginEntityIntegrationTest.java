package io.admin.db;

import static org.assertj.core.api.Assertions.assertThat;

import io.admin.core.UserLoginEntity;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserLoginEntityIntegrationTest extends AbstractRepositoryIntegrationTest {
  private UserLoginEntityRepository userLoginRepository;

  @BeforeEach
  void setUp() {
    userLoginRepository = new UserLoginEntityRepository(daoTest.getSessionFactory());
  }

  @Test
  void testFindAll() {
    final int count = 3;
    final Long[] ids = new Long[count];
    for (int i = 0; i < count; i++) {
      ids[i] = newUserLogin();
    }
    final List<Long> idList = new ArrayList<>();
    for (UserLoginEntity entity : userLoginRepository.findAll()) {
      idList.add(entity.getId());
    }
    assertThat(idList).hasSizeGreaterThanOrEqualTo(count).contains(ids);
  }

  @Test
  void testGeyById() {
    final long id = newUserLogin();

    final UserLoginEntity userLoginEntity = userLoginRepository.getById(id).get();

    assertThat(userLoginEntity.getEmail()).isNotNull();
    assertThat(userLoginEntity.getPassword()).isNotNull();
  }

  @Test
  void testDeleteById() {
    final long id = newUserLogin();

    daoTest.inTransaction(() -> userLoginRepository.deleteById(id));

    assertThat(userLoginRepository.getById(id)).isEmpty();
  }

  @Test
  void testDeleteByEntity() {
    final long id = newUserLogin();

    final UserLoginEntity userLoginEntity = userLoginRepository.getById(id).get();
    daoTest.inTransaction(() -> userLoginRepository.delete(userLoginEntity));

    assertThat(userLoginRepository.getById(id).isPresent()).isEqualTo(false);
  }

  private Long newUserLogin() {
    final UserLoginEntity userLoginEntity = daoTest
        .inTransaction(() -> EntityUtil.userLoginTestEntity(daoTest.getSessionFactory()));
    daoTest.getSessionFactory().getCurrentSession().clear();
    return userLoginEntity.getId();
  }

}
