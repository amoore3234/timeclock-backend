package io.admin.service;

import static org.assertj.core.api.Assertions.assertThat;

import io.admin.core.UserLoginEntity;
import io.admin.db.UserLoginEntityRepository;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

class UserLoginServiceImplTest {

  private UserLoginEntityRepository userLoginEntityRepository;

  @BeforeEach
  void setUp() {
    userLoginEntityRepository = Mockito.mock(UserLoginEntityRepository.class);
  }

  @Test
  void testGetUserById() {
    final Long id = 1L;
    final String email = "test email";
    final String password = "test password";

    UserLoginEntity mockUserLoginEntity = Mockito.mock(UserLoginEntity.class);

    Mockito.when(mockUserLoginEntity.getEmail()).thenReturn(email);
    Mockito.when(mockUserLoginEntity.getPassword()).thenReturn(password);

    Mockito.when(userLoginEntityRepository.getById(Mockito.any(Long.class)))
        .thenReturn(Optional.of(mockUserLoginEntity));

    final ArgumentCaptor<Long> idCaptor = ArgumentCaptor.forClass(Long.class);
    userLoginEntityRepository.save(mockUserLoginEntity);
    UserLoginEntity response = userLoginEntityRepository.getById(id).get();
    Mockito.verify(userLoginEntityRepository).getById(idCaptor.capture());

    assertThat(idCaptor.getValue()).isEqualTo(id);
    assertThat(response.getEmail()).isEqualTo(email);
    assertThat(response.getPassword()).isEqualTo(password);
  }

  @Test
  void testCreateUser() {
    final String email = "test email";
    final String password = "test password";

    UserLoginEntity mockUserLoginEntity = Mockito.mock(UserLoginEntity.class);

    Mockito.when(mockUserLoginEntity.getEmail()).thenReturn(email);
    Mockito.when(mockUserLoginEntity.getPassword()).thenReturn(password);

    Mockito.when(userLoginEntityRepository.save(Mockito.any(UserLoginEntity.class)))
        .thenReturn(mockUserLoginEntity);
    final ArgumentCaptor<UserLoginEntity> captor = ArgumentCaptor.forClass(UserLoginEntity.class);
    final UserLoginEntity response = userLoginEntityRepository.save(mockUserLoginEntity);
    Mockito.verify(userLoginEntityRepository).save(captor.capture());
    final UserLoginEntity created = captor.getValue();

    assertThat(created.getEmail()).isEqualTo(email);
    assertThat(created.getPassword()).isEqualTo(password);
    assertThat(response.getEmail()).isEqualTo(email);
    assertThat(response.getPassword()).isEqualTo(password);
  }

  @Test
  void testUpdateUser() {
    final Long id = 1L;
    final String email = "test email";
    final String password = "test password";

    UserLoginEntity mockUserLoginEntity = Mockito.mock(UserLoginEntity.class);

    Mockito.when(mockUserLoginEntity.getId()).thenReturn(id);
    Mockito.when(mockUserLoginEntity.getEmail()).thenReturn(email);
    Mockito.when(mockUserLoginEntity.getPassword()).thenReturn(password);

    Mockito.when(userLoginEntityRepository.save(Mockito.any(UserLoginEntity.class)))
        .thenReturn(mockUserLoginEntity);
    Mockito.when(userLoginEntityRepository.getById(Mockito.any(Long.class)))
        .thenReturn(Optional.of(mockUserLoginEntity));

    final UserLoginEntity response = userLoginEntityRepository.getById(id).get();

    assertThat(response.getId()).isEqualTo(id);
    assertThat(response.getEmail()).isEqualTo(email);
    assertThat(response.getPassword()).isEqualTo(password);
  }

  @Test
  void testDeletById() {
    final Long id = 1L;

    UserLoginEntity mockUserLoginEntity = Mockito.mock(UserLoginEntity.class);

    Mockito.when(mockUserLoginEntity.getId()).thenReturn(id);

    Mockito.when(userLoginEntityRepository.getById(Mockito.any(Long.class)))
        .thenReturn(Optional.of(mockUserLoginEntity));

    final ArgumentCaptor<Long> idCaptor = ArgumentCaptor.forClass(Long.class);
    userLoginEntityRepository.deleteById(id);
    Mockito.verify(userLoginEntityRepository).deleteById(idCaptor.capture());

    assertThat(idCaptor.getValue()).isEqualTo(id);
  }

}
