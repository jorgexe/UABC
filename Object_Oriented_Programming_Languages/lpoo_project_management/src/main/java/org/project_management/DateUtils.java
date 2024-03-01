package org.project_management;// Clase para la gestión de fechas y horarios
import java.text.SimpleDateFormat;
import java.util.Date;

class DateUtils {
    // Método para comparar dos fechas y determinar cuál es anterior
    public static boolean isEarlierDate(Date date1, Date date2) {
        return date1.before(date2);
    }

    // Método para comparar dos fechas y determinar cuál es posterior
    public static boolean isLaterDate(Date date1, Date date2) {
        return date1.after(date2);
    }

    // Método para comparar dos fechas y determinar si son iguales
    public static boolean datesAreEqual(Date date1, Date date2) {
        return date1.equals(date2);
    }

    // Método formatDate "dd/MM/yyyy"
    public static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }
}

