package org.project_management;// Clase para gestionar días festivos y no laborables
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class CalendarManager {
    private List<Date> holidays;

    public CalendarManager() {
        this.holidays = new ArrayList<>();
    }

    // Método para obtener la lista de días festivos
    public List<Date> getHolidays() {
        return holidays;
    }

    public void setHolidays(List<Date> holidays) {
        this.holidays = holidays;
    }

    // Método para agregar un día festivo al calendario
    public void addHoliday(Date date) {
        holidays.add(date);
    }

    // Método para verificar si una fecha es un día festivo
    public boolean isHoliday(Date date) {
        return holidays.contains(date);
    }

    // Método para eliminar un día festivo del calendario
    public void deleteHoliday(Date date) {
        holidays.remove(date);
    }

    // Método para verificar si una fecha es un día laborable
    public boolean isWorkingDay(Date date) {
        return !isHoliday(date);
    }

}

