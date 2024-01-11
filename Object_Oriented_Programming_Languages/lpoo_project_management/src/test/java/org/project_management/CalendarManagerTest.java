package org.project_management;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalendarManagerTest {

    private CalendarManager calendarManager;
    private Date holidayDate;
    private Date regularDate;

    @BeforeEach
    void setUp() {
        // Inicializar el CalendarManager y las fechas antes de cada prueba
        calendarManager = new CalendarManager();
        holidayDate = new Date(2023, 12, 25); // Utilizar valores de fechas representativos
        regularDate = new Date(2023, 12, 26);
    }

    @Test
    void getHolidays_ShouldReturnEmptyList_WhenNoHolidaysSet() {
        assertTrue(calendarManager.getHolidays().isEmpty(), "La lista de días festivos no está vacía al inicio.");
    }

    @Test
    void setHolidays_ShouldContainDates_WhenHolidaysSet() {
        List<Date> newHolidays = new ArrayList<>();
        newHolidays.add(holidayDate);
        calendarManager.setHolidays(newHolidays);
        assertEquals(newHolidays, calendarManager.getHolidays(), "La lista de días festivos no contiene las fechas establecidas.");
    }

    @Test
    void addHoliday_ShouldAddDate_ToHolidaysList() {
        calendarManager.addHoliday(holidayDate);
        assertTrue(calendarManager.getHolidays().contains(holidayDate), "El día festivo no se añadió correctamente.");
    }

    @Test
    void isHoliday_ShouldReturnTrue_ForHolidayDate() {
        calendarManager.addHoliday(holidayDate);
        assertTrue(calendarManager.isHoliday(holidayDate), "El método no reconoce el día festivo.");
    }

    @Test
    void isHoliday_ShouldReturnFalse_ForRegularDate() {
        assertFalse(calendarManager.isHoliday(regularDate), "El método incorrectamente reconoce un día regular como festivo.");
    }

    @Test
    void deleteHoliday_ShouldRemoveDate_FromHolidaysList() {
        calendarManager.addHoliday(holidayDate);
        calendarManager.deleteHoliday(holidayDate);
        assertFalse(calendarManager.getHolidays().contains(holidayDate), "El día festivo no se eliminó correctamente.");
    }

    @Test
    void isWorkingDay_ShouldReturnFalse_ForHolidayDate() {
        calendarManager.addHoliday(holidayDate);
        assertFalse(calendarManager.isWorkingDay(holidayDate), "El método no reconoce el día festivo como no laborable.");
    }

    @Test
    void isWorkingDay_ShouldReturnTrue_ForRegularDate() {
        assertTrue(calendarManager.isWorkingDay(regularDate), "El método incorrectamente reconoce un día regular como no laborable.");
    }

}
