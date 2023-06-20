package io.admin.service;

import static org.assertj.core.api.Assertions.assertThat;

import io.admin.core.EmployeeDetailEntity;
import io.admin.core.EmployeeTimesheetEntity;
import io.admin.core.TimesheetEntity;
import io.admin.db.EmployeeTimesheetEntityRepository;
import java.sql.Timestamp;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

public class EmployeeTimesheetImplTest {

  private EmployeeTimesheetEntityRepository employeeTimesheetEntityRepository;

  @BeforeEach
  void setUp() {
    employeeTimesheetEntityRepository = Mockito.mock(EmployeeTimesheetEntityRepository.class);
  }

  @Test
  void testGetEmployeeDetailById() {
    final String date = "2020-07-01 19:10:25";
    final Long id = 1L;
    final Long employeeDetailId = 1L;
    final Long timesheetId = 1L;
    final Timestamp weeklyPeriodDate = Timestamp.valueOf(date);
    final int weeklyHoursWorked = 40;

    final EmployeeTimesheetEntity mockEmployeeTimesheetEntity = Mockito.mock(EmployeeTimesheetEntity.class);
    final EmployeeDetailEntity mockEmployeeDetailEntity = Mockito.mock(EmployeeDetailEntity.class);
    final TimesheetEntity mockTimesheetEntity = Mockito.mock(TimesheetEntity.class);

    Mockito.when(mockEmployeeDetailEntity.getId()).thenReturn(employeeDetailId);
    Mockito.when(mockTimesheetEntity.getId()).thenReturn(timesheetId);

    Mockito.when(mockEmployeeTimesheetEntity.getEmployeeDetail()).thenReturn(mockEmployeeDetailEntity);
    Mockito.when(mockEmployeeTimesheetEntity.getTimesheet()).thenReturn(mockTimesheetEntity);
    Mockito.when(mockEmployeeTimesheetEntity.getWeeklyPeriodDate()).thenReturn(weeklyPeriodDate);
    Mockito.when(mockEmployeeTimesheetEntity.getWeeklyHoursWorked()).thenReturn(weeklyHoursWorked);


    Mockito.when(employeeTimesheetEntityRepository.getById(Mockito.any(Long.class)))
        .thenReturn(Optional.of(mockEmployeeTimesheetEntity));

    final ArgumentCaptor<Long> idCaptor = ArgumentCaptor.forClass(Long.class);
    employeeTimesheetEntityRepository.save(mockEmployeeTimesheetEntity);
    EmployeeTimesheetEntity response = employeeTimesheetEntityRepository.getById(id).get();
    Mockito.verify(employeeTimesheetEntityRepository).getById(idCaptor.capture());

    assertThat(idCaptor.getValue()).isEqualTo(id);
    assertThat(mockEmployeeTimesheetEntity.getWeeklyPeriodDate()).isEqualTo(weeklyPeriodDate);
    assertThat(mockEmployeeTimesheetEntity.getWeeklyHoursWorked()).isEqualTo(weeklyHoursWorked);
    assertThat(response.getWeeklyPeriodDate()).isEqualTo(weeklyPeriodDate);
    assertThat(response.getWeeklyHoursWorked()).isEqualTo(weeklyHoursWorked);
  }

  @Test
  void testCreateEmployeeDetail() {
    final String date = "2020-07-01 19:10:25";
    final Long employeeDetailId = 1L;
    final Long timesheetId = 1L;
    final Timestamp weeklyPeriodDate = Timestamp.valueOf(date);
    final int weeklyHoursWorked = 40;

    final EmployeeTimesheetEntity mockEmployeeTimesheetEntity = Mockito.mock(EmployeeTimesheetEntity.class);
    final EmployeeDetailEntity mockEmployeeDetailEntity = Mockito.mock(EmployeeDetailEntity.class);
    final TimesheetEntity mockTimesheetEntity = Mockito.mock(TimesheetEntity.class);

    Mockito.when(mockEmployeeDetailEntity.getId()).thenReturn(employeeDetailId);
    Mockito.when(mockTimesheetEntity.getId()).thenReturn(timesheetId);

    Mockito.when(mockEmployeeTimesheetEntity.getEmployeeDetail()).thenReturn(mockEmployeeDetailEntity);
    Mockito.when(mockEmployeeTimesheetEntity.getTimesheet()).thenReturn(mockTimesheetEntity);
    Mockito.when(mockEmployeeTimesheetEntity.getWeeklyPeriodDate()).thenReturn(weeklyPeriodDate);
    Mockito.when(mockEmployeeTimesheetEntity.getWeeklyHoursWorked()).thenReturn(weeklyHoursWorked);

    Mockito.when(employeeTimesheetEntityRepository.save(Mockito.any(EmployeeTimesheetEntity.class)))
        .thenReturn(mockEmployeeTimesheetEntity);
    final ArgumentCaptor<EmployeeTimesheetEntity> captor =
        ArgumentCaptor.forClass(EmployeeTimesheetEntity.class);
    final EmployeeTimesheetEntity response = employeeTimesheetEntityRepository
          .save(mockEmployeeTimesheetEntity);
    Mockito.verify(employeeTimesheetEntityRepository).save(captor.capture());
    final EmployeeTimesheetEntity created = captor.getValue();

    assertThat(mockEmployeeTimesheetEntity.getEmployeeDetail()).isNotNull();
    assertThat(mockEmployeeTimesheetEntity.getTimesheet()).isNotNull();
    assertThat(mockEmployeeTimesheetEntity.getWeeklyPeriodDate()).isEqualTo(weeklyPeriodDate);
    assertThat(mockEmployeeTimesheetEntity.getWeeklyHoursWorked()).isEqualTo(weeklyHoursWorked);
    assertThat(response.getEmployeeDetail()).isNotNull();
    assertThat(response.getTimesheet()).isNotNull();
    assertThat(response.getWeeklyPeriodDate()).isEqualTo(weeklyPeriodDate);
    assertThat(response.getWeeklyHoursWorked()).isEqualTo(weeklyHoursWorked);
    assertThat(created.getEmployeeDetail()).isNotNull();
    assertThat(created.getTimesheet()).isNotNull();
    assertThat(created.getWeeklyPeriodDate()).isEqualTo(weeklyPeriodDate);
    assertThat(created.getWeeklyHoursWorked()).isEqualTo(weeklyHoursWorked);
  }

  @Test
  void testUpdateEmployeeDetail() {
    final String date = "2020-07-01 19:10:25";
    final Long id = 1L;
    final Long employeeDetailId = 1L;
    final Long timesheetId = 1L;
    final Timestamp weeklyPeriodDate = Timestamp.valueOf(date);
    final int weeklyHoursWorked = 40;

    final EmployeeTimesheetEntity mockEmployeeTimesheetEntity = Mockito.mock(EmployeeTimesheetEntity.class);
    final EmployeeDetailEntity mockEmployeeDetailEntity = Mockito.mock(EmployeeDetailEntity.class);
    final TimesheetEntity mockTimesheetEntity = Mockito.mock(TimesheetEntity.class);

    Mockito.when(mockEmployeeDetailEntity.getId()).thenReturn(employeeDetailId);
    Mockito.when(mockTimesheetEntity.getId()).thenReturn(timesheetId);

    Mockito.when(mockEmployeeTimesheetEntity.getEmployeeDetail()).thenReturn(mockEmployeeDetailEntity);
    Mockito.when(mockEmployeeTimesheetEntity.getTimesheet()).thenReturn(mockTimesheetEntity);
    Mockito.when(mockEmployeeTimesheetEntity.getWeeklyPeriodDate()).thenReturn(weeklyPeriodDate);
    Mockito.when(mockEmployeeTimesheetEntity.getWeeklyHoursWorked()).thenReturn(weeklyHoursWorked);

    Mockito.when(employeeTimesheetEntityRepository.save(Mockito.any(EmployeeTimesheetEntity.class)))
        .thenReturn(mockEmployeeTimesheetEntity);
    Mockito.when(employeeTimesheetEntityRepository.getById(Mockito.any(Long.class)))
        .thenReturn(Optional.of(mockEmployeeTimesheetEntity));

    final EmployeeTimesheetEntity response = employeeTimesheetEntityRepository.getById(id).get();

    assertThat(response.getWeeklyPeriodDate()).isEqualTo(weeklyPeriodDate);
    assertThat(response.getWeeklyHoursWorked()).isEqualTo(weeklyHoursWorked);
  }

  @Test
  void testDeletById() {
    final Long id = 1L;

    EmployeeTimesheetEntity mockEmployeeTimesheetEntity = Mockito.mock(EmployeeTimesheetEntity.class);

    Mockito.when(mockEmployeeTimesheetEntity.getId()).thenReturn(id);

    Mockito.when(employeeTimesheetEntityRepository.getById(Mockito.any(Long.class)))
        .thenReturn(Optional.of(mockEmployeeTimesheetEntity));

    final ArgumentCaptor<Long> idCaptor = ArgumentCaptor.forClass(Long.class);
    employeeTimesheetEntityRepository.deleteById(id);
    Mockito.verify(employeeTimesheetEntityRepository).deleteById(idCaptor.capture());

    assertThat(idCaptor.getValue()).isEqualTo(id);
  }
}
