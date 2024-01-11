package org.project_management;

import org.junit.jupiter.api.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DateUtilsTest {

    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    @Test
    void isEarlierDate_ShouldReturnTrue_WhenDate1IsBeforeDate2() throws ParseException {
        Date date1 = sdf.parse("01/01/2023");
        Date date2 = sdf.parse("02/01/2023");
        assertTrue(DateUtils.isEarlierDate(date1, date2), "El método debería retornar verdadero cuando la fecha1 es anterior a la fecha2.");
    }

    @Test
    void isEarlierDate_ShouldReturnFalse_WhenDate1IsAfterDate2() throws ParseException {
        Date date1 = sdf.parse("03/01/2023");
        Date date2 = sdf.parse("02/01/2023");
        assertFalse(DateUtils.isEarlierDate(date1, date2), "El método debería retornar falso cuando la fecha1 es posterior a la fecha2.");
    }

    @Test
    void isLaterDate_ShouldReturnTrue_WhenDate1IsAfterDate2() throws ParseException {
        Date date1 = sdf.parse("02/01/2023");
        Date date2 = sdf.parse("01/01/2023");
        assertTrue(DateUtils.isLaterDate(date1, date2), "El método debería retornar verdadero cuando la fecha1 es posterior a la fecha2.");
    }

    @Test
    void isLaterDate_ShouldReturnFalse_WhenDate1IsBeforeDate2() throws ParseException {
        Date date1 = sdf.parse("01/01/2023");
        Date date2 = sdf.parse("02/01/2023");
        assertFalse(DateUtils.isLaterDate(date1, date2), "El método debería retornar falso cuando la fecha1 es anterior a la fecha2.");
    }

    @Test
    void datesAreEqual_ShouldReturnTrue_WhenDatesAreEqual() throws ParseException {
        Date date1 = sdf.parse("01/01/2023");
        Date date2 = sdf.parse("01/01/2023");
        assertTrue(DateUtils.datesAreEqual(date1, date2), "El método debería retornar verdadero cuando las dos fechas son iguales.");
    }

    @Test
    void datesAreEqual_ShouldReturnFalse_WhenDatesAreNotEqual() throws ParseException {
        Date date1 = sdf.parse("01/01/2023");
        Date date2 = sdf.parse("02/01/2023");
        assertFalse(DateUtils.datesAreEqual(date1, date2), "El método debería retornar falso cuando las dos fechas no son iguales.");
    }

    @Test
    void formatDate_ShouldReturnFormattedDate_WhenDateIsGiven() throws ParseException {
        Date date = sdf.parse("01/01/2023");
        String formattedDate = DateUtils.formatDate(date);
        assertEquals("01/01/2023", formattedDate, "El método debería formatear la fecha de acuerdo al formato especificado.");
    }

}
