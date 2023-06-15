package io.admin.service;

import static org.assertj.core.api.Assertions.assertThat;

import io.admin.core.HolidayEntity;
import io.admin.core.TimesheetEntity;
import io.admin.db.TimesheetEntityRepository;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

public class TimesheetServiceImplTest {

  private TimesheetEntityRepository timesheetEntityRepository;

  @BeforeEach
  void setUp() {
    timesheetEntityRepository = Mockito.mock(TimesheetEntityRepository.class);
  }

  @Test
  void testGetEmployeeDetailById() {
    final OffsetDateTime now = OffsetDateTime.now();
    final Long id = 1L;
    final Long holidayId = 1L;
    final OffsetDateTime clockIn = now;
    final OffsetDateTime clockOut = now;
    final OffsetDateTime lunch = now;
    final int hoursWorked = 40;
    final int overtime = 2;

    final TimesheetEntity mockTimesheetEntity = Mockito.mock(TimesheetEntity.class);
    final HolidayEntity mockHolidayEntity = Mockito.mock(HolidayEntity.class);

    Mockito.when(mockHolidayEntity.getId()).thenReturn(holidayId);

    Mockito.when(mockTimesheetEntity.getHoliday()).thenReturn(mockHolidayEntity);
    Mockito.when(mockTimesheetEntity.getClockIn()).thenReturn(clockIn);
    Mockito.when(mockTimesheetEntity.getClockOut()).thenReturn(clockOut);
    Mockito.when(mockTimesheetEntity.getLunch()).thenReturn(lunch);
    Mockito.when(mockTimesheetEntity.getHoursWorked()).thenReturn(hoursWorked);
    Mockito.when(mockTimesheetEntity.getOvertime()).thenReturn(overtime);


    Mockito.when(timesheetEntityRepository.getById(Mockito.any(Long.class)))
        .thenReturn(Optional.of(mockTimesheetEntity));

    final ArgumentCaptor<Long> idCaptor = ArgumentCaptor.forClass(Long.class);
    timesheetEntityRepository.save(mockTimesheetEntity);
    TimesheetEntity response = timesheetEntityRepository.getById(id).get();
    Mockito.verify(timesheetEntityRepository).getById(idCaptor.capture());

    assertThat(idCaptor.getValue()).isEqualTo(id);
    assertThat(mockTimesheetEntity.getClockIn()).isEqualTo(clockIn);
    assertThat(mockTimesheetEntity.getClockOut()).isEqualTo(clockOut);
    assertThat(mockTimesheetEntity.getLunch()).isEqualTo(lunch);
    assertThat(mockTimesheetEntity.getHoursWorked()).isEqualTo(hoursWorked);
    assertThat(response.getClockIn()).isEqualTo(clockIn);
    assertThat(response.getClockOut()).isEqualTo(clockOut);
    assertThat(response.getLunch()).isEqualTo(lunch);
    assertThat(response.getHoursWorked()).isEqualTo(hoursWorked);
  }

  @Test
  void testCreateUser() {
    final OffsetDateTime now = OffsetDateTime.now();
    final Long holidayId = 1L;
    final OffsetDateTime clockIn = now;
    final OffsetDateTime clockOut = now;
    final OffsetDateTime lunch = now;
    final int hoursWorked = 40;
    final int overtime = 2;

    final TimesheetEntity mockTimesheetEntity = Mockito.mock(TimesheetEntity.class);
    final HolidayEntity mockHolidayEntity = Mockito.mock(HolidayEntity.class);

    Mockito.when(mockHolidayEntity.getId()).thenReturn(holidayId);

    Mockito.when(mockTimesheetEntity.getHoliday()).thenReturn(mockHolidayEntity);
    Mockito.when(mockTimesheetEntity.getClockIn()).thenReturn(clockIn);
    Mockito.when(mockTimesheetEntity.getClockOut()).thenReturn(clockOut);
    Mockito.when(mockTimesheetEntity.getLunch()).thenReturn(lunch);
    Mockito.when(mockTimesheetEntity.getHoursWorked()).thenReturn(hoursWorked);
    Mockito.when(mockTimesheetEntity.getOvertime()).thenReturn(overtime);

    Mockito.when(timesheetEntityRepository.save(Mockito.any(TimesheetEntity.class)))
        .thenReturn(mockTimesheetEntity);
    final ArgumentCaptor<TimesheetEntity> captor =
        ArgumentCaptor.forClass(TimesheetEntity.class);
    final TimesheetEntity response = timesheetEntityRepository
          .save(mockTimesheetEntity);
    Mockito.verify(timesheetEntityRepository).save(captor.capture());
    final TimesheetEntity created = captor.getValue();

    assertThat(mockTimesheetEntity.getHoliday()).isNotNull();
    assertThat(mockTimesheetEntity.getClockIn()).isEqualTo(clockIn);
    assertThat(mockTimesheetEntity.getClockOut()).isEqualTo(clockOut);
    assertThat(mockTimesheetEntity.getLunch()).isEqualTo(lunch);
    assertThat(mockTimesheetEntity.getHoursWorked()).isEqualTo(hoursWorked);
    assertThat(response.getHoliday()).isNotNull();
    assertThat(response.getClockIn()).isEqualTo(clockIn);
    assertThat(response.getClockOut()).isEqualTo(clockOut);
    assertThat(response.getLunch()).isEqualTo(lunch);
    assertThat(response.getHoursWorked()).isEqualTo(hoursWorked);
    assertThat(created.getHoliday()).isNotNull();
    assertThat(created.getClockIn()).isEqualTo(clockIn);
    assertThat(created.getClockOut()).isEqualTo(clockOut);
    assertThat(created.getLunch()).isEqualTo(lunch);
    assertThat(created.getHoursWorked()).isEqualTo(hoursWorked);
  }

  @Test
  void testUpdateUser() {
    final OffsetDateTime now = OffsetDateTime.now();
    final Long id = 1L;
    final Long holidayId = 1L;
    final OffsetDateTime clockIn = now;
    final OffsetDateTime clockOut = now;
    final OffsetDateTime lunch = now;
    final int hoursWorked = 40;
    final int overtime = 2;

    final TimesheetEntity mockTimesheetEntity = Mockito.mock(TimesheetEntity.class);
    final HolidayEntity mockHolidayEntity = Mockito.mock(HolidayEntity.class);

    Mockito.when(mockHolidayEntity.getId()).thenReturn(holidayId);

    Mockito.when(mockTimesheetEntity.getHoliday()).thenReturn(mockHolidayEntity);
    Mockito.when(mockTimesheetEntity.getClockIn()).thenReturn(clockIn);
    Mockito.when(mockTimesheetEntity.getClockOut()).thenReturn(clockOut);
    Mockito.when(mockTimesheetEntity.getLunch()).thenReturn(lunch);
    Mockito.when(mockTimesheetEntity.getHoursWorked()).thenReturn(hoursWorked);
    Mockito.when(mockTimesheetEntity.getOvertime()).thenReturn(overtime);

    Mockito.when(timesheetEntityRepository.save(Mockito.any(TimesheetEntity.class)))
        .thenReturn(mockTimesheetEntity);
    Mockito.when(timesheetEntityRepository.getById(Mockito.any(Long.class)))
        .thenReturn(Optional.of(mockTimesheetEntity));

    final TimesheetEntity response = timesheetEntityRepository.getById(id).get();

    assertThat(response.getClockIn()).isEqualTo(clockIn);
    assertThat(response.getClockOut()).isEqualTo(clockOut);
    assertThat(response.getLunch()).isEqualTo(lunch);
    assertThat(response.getHoursWorked()).isEqualTo(hoursWorked);
  }

  @Test
  void testDeletById() {
    final Long id = 1L;

    TimesheetEntity mockTimesheetEntity = Mockito.mock(TimesheetEntity.class);

    Mockito.when(mockTimesheetEntity.getId()).thenReturn(id);

    Mockito.when(timesheetEntityRepository.getById(Mockito.any(Long.class)))
        .thenReturn(Optional.of(mockTimesheetEntity));

    final ArgumentCaptor<Long> idCaptor = ArgumentCaptor.forClass(Long.class);
    timesheetEntityRepository.deleteById(id);
    Mockito.verify(timesheetEntityRepository).deleteById(idCaptor.capture());

    assertThat(idCaptor.getValue()).isEqualTo(id);
  }
}
