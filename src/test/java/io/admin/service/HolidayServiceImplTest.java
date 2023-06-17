package io.admin.service;

import static org.assertj.core.api.Assertions.assertThat;

import io.admin.core.HolidayEntity;
import io.admin.core.TimesheetEntity;
import io.admin.db.HolidayEntityRepository;
import java.sql.Timestamp;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

class HolidayServiceImplTest {

  private HolidayEntityRepository holidayEntityRepository;

  @BeforeEach
  void setUp() {
    holidayEntityRepository = Mockito.mock(HolidayEntityRepository.class);
  }

  @Test
  void testGetHolidayById() {
    final Long id = 1L;
    final Long timesheetId = 1L;
    final String holidayName = "Independence Day";
    final String date = "2020-07-04 19:10:25";
    final Timestamp timestamp = Timestamp.valueOf(date);

    final HolidayEntity mockHolidayEntity = Mockito.mock(HolidayEntity.class);
    final TimesheetEntity mockTimesheetEntity = Mockito.mock(TimesheetEntity.class);

    Mockito.when(mockTimesheetEntity.getId()).thenReturn(timesheetId);

    Mockito.when(mockHolidayEntity.getTimesheet()).thenReturn(mockTimesheetEntity);
    Mockito.when(mockHolidayEntity.getHolidayName()).thenReturn(holidayName);
    Mockito.when(mockHolidayEntity.getDate()).thenReturn(timestamp);

    Mockito.when(holidayEntityRepository.getById(Mockito.any(Long.class)))
        .thenReturn(Optional.of(mockHolidayEntity));

    final ArgumentCaptor<Long> idCaptor = ArgumentCaptor.forClass(Long.class);
    holidayEntityRepository.save(mockHolidayEntity);
    HolidayEntity response = holidayEntityRepository.getById(id).get();
    Mockito.verify(holidayEntityRepository).getById(idCaptor.capture());

    assertThat(idCaptor.getValue()).isEqualTo(id);
    assertThat(response.getHolidayName()).isEqualTo(holidayName);
    assertThat(response.getDate()).isEqualTo(timestamp);
  }

  @Test
  void testCreateHoliday() {
    final Long timesheetId = 1L;
    final String holidayName = "Independence Day";
    final String date = "2020-07-04 19:10:25";
    final Timestamp timestamp = Timestamp.valueOf(date);

    final HolidayEntity mockHolidayEntity = Mockito.mock(HolidayEntity.class);
    final TimesheetEntity mockTimesheetEntity = Mockito.mock(TimesheetEntity.class);

    Mockito.when(mockTimesheetEntity.getId()).thenReturn(timesheetId);

    Mockito.when(mockHolidayEntity.getTimesheet()).thenReturn(mockTimesheetEntity);
    Mockito.when(mockHolidayEntity.getHolidayName()).thenReturn(holidayName);
    Mockito.when(mockHolidayEntity.getDate()).thenReturn(timestamp);

    Mockito.when(holidayEntityRepository.save(Mockito.any(HolidayEntity.class)))
        .thenReturn(mockHolidayEntity);
    final ArgumentCaptor<HolidayEntity> captor = ArgumentCaptor.forClass(HolidayEntity.class);
    final HolidayEntity response = holidayEntityRepository.save(mockHolidayEntity);
    Mockito.verify(holidayEntityRepository).save(captor.capture());
    final HolidayEntity created = captor.getValue();

    assertThat(created.getTimesheet()).isNotNull();
    assertThat(created.getHolidayName()).isEqualTo(holidayName);
    assertThat(created.getDate()).isEqualTo(timestamp);
    assertThat(response.getTimesheet()).isNotNull();
    assertThat(response.getHolidayName()).isEqualTo(holidayName);
    assertThat(response.getDate()).isEqualTo(timestamp);
  }

  @Test
  void testUpdateHoliday() {
    final Long id = 1L;
    final Long timesheetId = 1L;
    final String holidayName = "Independence Day";
    final String date = "2020-07-04 19:10:25";
    final Timestamp timestamp = Timestamp.valueOf(date);

    final HolidayEntity mockHolidayEntity = Mockito.mock(HolidayEntity.class);
    final TimesheetEntity mockTimesheetEntity = Mockito.mock(TimesheetEntity.class);

    Mockito.when(mockTimesheetEntity.getId()).thenReturn(timesheetId);

    Mockito.when(mockHolidayEntity.getId()).thenReturn(id);
    Mockito.when(mockHolidayEntity.getTimesheet()).thenReturn(mockTimesheetEntity);
    Mockito.when(mockHolidayEntity.getHolidayName()).thenReturn(holidayName);
    Mockito.when(mockHolidayEntity.getDate()).thenReturn(timestamp);

    Mockito.when(holidayEntityRepository.save(Mockito.any(HolidayEntity.class)))
        .thenReturn(mockHolidayEntity);
    Mockito.when(holidayEntityRepository.getById(Mockito.any(Long.class)))
        .thenReturn(Optional.of(mockHolidayEntity));

    final HolidayEntity response = holidayEntityRepository.getById(id).get();

    assertThat(response.getId()).isEqualTo(id);
    assertThat(response.getHolidayName()).isEqualTo(holidayName);
    assertThat(response.getDate()).isEqualTo(timestamp);
  }

  @Test
  void testDeletById() {
    final Long id = 1L;

    HolidayEntity mockHolidayEntity = Mockito.mock(HolidayEntity.class);

    Mockito.when(mockHolidayEntity.getId()).thenReturn(id);

    Mockito.when(holidayEntityRepository.getById(Mockito.any(Long.class)))
        .thenReturn(Optional.of(mockHolidayEntity));

    final ArgumentCaptor<Long> idCaptor = ArgumentCaptor.forClass(Long.class);
    holidayEntityRepository.deleteById(id);
    Mockito.verify(holidayEntityRepository).deleteById(idCaptor.capture());

    assertThat(idCaptor.getValue()).isEqualTo(id);
  }
}
