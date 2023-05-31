package io.admin.service;

import static org.assertj.core.api.Assertions.assertThat;

import io.admin.core.EmployeeDetailEntity;
import io.admin.core.UserLoginEntity;
import io.admin.db.EmployeeDetailEntityRepository;
import java.sql.Timestamp;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

class EmployeeDetailServiceImplTest {

  private EmployeeDetailEntityRepository employeeDetailEntityRepository;

  @BeforeEach
  void setUp() {
    employeeDetailEntityRepository = Mockito.mock(EmployeeDetailEntityRepository.class);
  }

  @Test
  void testGetEmployeeDetailById() {
    final String date = "2020-07-01 19:10:25";
    final Long id = 1L;
    final Long userLoginId = 1L;
    final String firstName = "test first name";
    final String lastName = "test last name";
    final String empStatus = "employee";
    final String empType = "full-time";
    final String empGrade = "L1";
    final Timestamp startDate = Timestamp.valueOf(date);
    final Timestamp endDate = Timestamp.valueOf(date);

    final EmployeeDetailEntity mockEmployeeDetailEntity = Mockito.mock(EmployeeDetailEntity.class);
    final UserLoginEntity mockUserLoginEntity = Mockito.mock(UserLoginEntity.class);

    Mockito.when(mockUserLoginEntity.getId()).thenReturn(userLoginId);

    Mockito.when(mockEmployeeDetailEntity.getUserLogin()).thenReturn(mockUserLoginEntity);
    Mockito.when(mockEmployeeDetailEntity.getFirstName()).thenReturn(firstName);
    Mockito.when(mockEmployeeDetailEntity.getLastName()).thenReturn(lastName);
    Mockito.when(mockEmployeeDetailEntity.getEmployeeStatus()).thenReturn(empStatus);
    Mockito.when(mockEmployeeDetailEntity.getEmployeeType()).thenReturn(empType);
    Mockito.when(mockEmployeeDetailEntity.getEmployeeGrade()).thenReturn(empGrade);
    Mockito.when(mockEmployeeDetailEntity.getStartDate()).thenReturn(startDate);
    Mockito.when(mockEmployeeDetailEntity.getEndDate()).thenReturn(endDate);


    Mockito.when(employeeDetailEntityRepository.getById(Mockito.any(Long.class)))
        .thenReturn(Optional.of(mockEmployeeDetailEntity));

    final ArgumentCaptor<Long> idCaptor = ArgumentCaptor.forClass(Long.class);
    employeeDetailEntityRepository.save(mockEmployeeDetailEntity);
    EmployeeDetailEntity response = employeeDetailEntityRepository.getById(id).get();
    Mockito.verify(employeeDetailEntityRepository).getById(idCaptor.capture());

    assertThat(idCaptor.getValue()).isEqualTo(id);
    assertThat(mockEmployeeDetailEntity.getFirstName()).isEqualTo(firstName);
    assertThat(mockEmployeeDetailEntity.getLastName()).isEqualTo(lastName);
    assertThat(mockEmployeeDetailEntity.getEmployeeStatus()).isEqualTo(empStatus);
    assertThat(mockEmployeeDetailEntity.getEmployeeType()).isEqualTo(empType);
    assertThat(mockEmployeeDetailEntity.getEmployeeGrade()).isEqualTo(empGrade);
    assertThat(mockEmployeeDetailEntity.getStartDate()).isEqualTo(startDate);
    assertThat(mockEmployeeDetailEntity.getEndDate()).isEqualTo(endDate);
    assertThat(response.getFirstName()).isEqualTo(firstName);
    assertThat(response.getLastName()).isEqualTo(lastName);
    assertThat(response.getEmployeeStatus()).isEqualTo(empStatus);
    assertThat(response.getEmployeeType()).isEqualTo(empType);
    assertThat(response.getEmployeeGrade()).isEqualTo(empGrade);
    assertThat(response.getStartDate()).isEqualTo(startDate);
    assertThat(response.getEndDate()).isEqualTo(endDate);
  }

  @Test
  void testCreateUser() {
    final String date = "2020-07-01 19:10:25";
    final Long userLoginId = 1L;
    final String firstName = "test first name";
    final String lastName = "test last name";
    final String empStatus = "employee";
    final String empType = "full-time";
    final String empGrade = "L1";
    final Timestamp startDate = Timestamp.valueOf(date);
    final Timestamp endDate = Timestamp.valueOf(date);

    final EmployeeDetailEntity mockEmployeeDetailEntity = Mockito.mock(EmployeeDetailEntity.class);
    final UserLoginEntity mockUserLoginEntity = Mockito.mock(UserLoginEntity.class);

    Mockito.when(mockUserLoginEntity.getId()).thenReturn(userLoginId);

    Mockito.when(mockEmployeeDetailEntity.getUserLogin()).thenReturn(mockUserLoginEntity);
    Mockito.when(mockEmployeeDetailEntity.getFirstName()).thenReturn(firstName);
    Mockito.when(mockEmployeeDetailEntity.getLastName()).thenReturn(lastName);
    Mockito.when(mockEmployeeDetailEntity.getEmployeeStatus()).thenReturn(empStatus);
    Mockito.when(mockEmployeeDetailEntity.getEmployeeType()).thenReturn(empType);
    Mockito.when(mockEmployeeDetailEntity.getEmployeeGrade()).thenReturn(empGrade);
    Mockito.when(mockEmployeeDetailEntity.getStartDate()).thenReturn(startDate);
    Mockito.when(mockEmployeeDetailEntity.getEndDate()).thenReturn(endDate);

    Mockito.when(employeeDetailEntityRepository.save(Mockito.any(EmployeeDetailEntity.class)))
        .thenReturn(mockEmployeeDetailEntity);
    final ArgumentCaptor<EmployeeDetailEntity> captor =
        ArgumentCaptor.forClass(EmployeeDetailEntity.class);
    final EmployeeDetailEntity response = employeeDetailEntityRepository
          .save(mockEmployeeDetailEntity);
    Mockito.verify(employeeDetailEntityRepository).save(captor.capture());
    final EmployeeDetailEntity created = captor.getValue();

    assertThat(mockEmployeeDetailEntity.getUserLogin()).isNotNull();
    assertThat(mockEmployeeDetailEntity.getFirstName()).isEqualTo(firstName);
    assertThat(mockEmployeeDetailEntity.getLastName()).isEqualTo(lastName);
    assertThat(mockEmployeeDetailEntity.getEmployeeStatus()).isEqualTo(empStatus);
    assertThat(mockEmployeeDetailEntity.getEmployeeType()).isEqualTo(empType);
    assertThat(mockEmployeeDetailEntity.getEmployeeGrade()).isEqualTo(empGrade);
    assertThat(mockEmployeeDetailEntity.getStartDate()).isEqualTo(startDate);
    assertThat(mockEmployeeDetailEntity.getEndDate()).isEqualTo(endDate);
    assertThat(response.getUserLogin()).isNotNull();
    assertThat(response.getFirstName()).isEqualTo(firstName);
    assertThat(response.getLastName()).isEqualTo(lastName);
    assertThat(response.getEmployeeStatus()).isEqualTo(empStatus);
    assertThat(response.getEmployeeType()).isEqualTo(empType);
    assertThat(response.getEmployeeGrade()).isEqualTo(empGrade);
    assertThat(response.getStartDate()).isEqualTo(startDate);
    assertThat(response.getEndDate()).isEqualTo(endDate);
    assertThat(created.getUserLogin()).isNotNull();
    assertThat(created.getFirstName()).isEqualTo(firstName);
    assertThat(created.getLastName()).isEqualTo(lastName);
    assertThat(created.getEmployeeStatus()).isEqualTo(empStatus);
    assertThat(created.getEmployeeType()).isEqualTo(empType);
    assertThat(created.getEmployeeGrade()).isEqualTo(empGrade);
    assertThat(created.getStartDate()).isEqualTo(startDate);
    assertThat(created.getEndDate()).isEqualTo(endDate);
  }

  @Test
  void testUpdateUser() {
    final String date = "2020-07-01 19:10:25";
    final Long id = 1L;
    final Long userLoginId = 1L;
    final String firstName = "test first name";
    final String lastName = "test last name";
    final String empStatus = "employee";
    final String empType = "full-time";
    final String empGrade = "L1";
    final Timestamp startDate = Timestamp.valueOf(date);
    final Timestamp endDate = Timestamp.valueOf(date);

    final EmployeeDetailEntity mockEmployeeDetailEntity = Mockito.mock(EmployeeDetailEntity.class);
    final UserLoginEntity mockUserLoginEntity = Mockito.mock(UserLoginEntity.class);

    Mockito.when(mockUserLoginEntity.getId()).thenReturn(userLoginId);

    Mockito.when(mockEmployeeDetailEntity.getUserLogin()).thenReturn(mockUserLoginEntity);
    Mockito.when(mockEmployeeDetailEntity.getFirstName()).thenReturn(firstName);
    Mockito.when(mockEmployeeDetailEntity.getLastName()).thenReturn(lastName);
    Mockito.when(mockEmployeeDetailEntity.getEmployeeStatus()).thenReturn(empStatus);
    Mockito.when(mockEmployeeDetailEntity.getEmployeeType()).thenReturn(empType);
    Mockito.when(mockEmployeeDetailEntity.getEmployeeGrade()).thenReturn(empGrade);
    Mockito.when(mockEmployeeDetailEntity.getStartDate()).thenReturn(startDate);
    Mockito.when(mockEmployeeDetailEntity.getEndDate()).thenReturn(endDate);

    Mockito.when(employeeDetailEntityRepository.save(Mockito.any(EmployeeDetailEntity.class)))
        .thenReturn(mockEmployeeDetailEntity);
    Mockito.when(employeeDetailEntityRepository.getById(Mockito.any(Long.class)))
        .thenReturn(Optional.of(mockEmployeeDetailEntity));

    final EmployeeDetailEntity response = employeeDetailEntityRepository.getById(id).get();

    assertThat(response.getFirstName()).isEqualTo(firstName);
    assertThat(response.getLastName()).isEqualTo(lastName);
    assertThat(response.getEmployeeStatus()).isEqualTo(empStatus);
    assertThat(response.getEmployeeType()).isEqualTo(empType);
    assertThat(response.getEmployeeGrade()).isEqualTo(empGrade);
    assertThat(response.getStartDate()).isEqualTo(startDate);
    assertThat(response.getEndDate()).isEqualTo(endDate);
  }

  @Test
  void testDeletById() {
    final Long id = 1L;

    EmployeeDetailEntity mockEmployeeDetailEntity = Mockito.mock(EmployeeDetailEntity.class);

    Mockito.when(mockEmployeeDetailEntity.getId()).thenReturn(id);

    Mockito.when(employeeDetailEntityRepository.getById(Mockito.any(Long.class)))
        .thenReturn(Optional.of(mockEmployeeDetailEntity));

    final ArgumentCaptor<Long> idCaptor = ArgumentCaptor.forClass(Long.class);
    employeeDetailEntityRepository.deleteById(id);
    Mockito.verify(employeeDetailEntityRepository).deleteById(idCaptor.capture());

    assertThat(idCaptor.getValue()).isEqualTo(id);
  }
}
