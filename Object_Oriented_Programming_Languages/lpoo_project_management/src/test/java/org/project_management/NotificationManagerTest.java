package org.project_management;

import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class NotificationManagerTest {

    @Test
    void configureNotification_DoesNotThrowException() {
        NotificationManager notificationManager = new NotificationManager();
        Task task = new Task("1","Task Test", new Date(), new Date(), "Task 1"); // Suponiendo que Task tiene un constructor adecuado
        Date notificationDate = new Date(System.currentTimeMillis() + 10000); // Fecha en el futuro

        // Prueba que simplemente verifica que el método se ejecuta sin lanzar una excepción
        assertDoesNotThrow(() -> notificationManager.configureNotification(task, notificationDate));
    }

    @Test
    void configureReminder_DoesNotThrowException() {
        NotificationManager notificationManager = new NotificationManager();
        Task task = new Task("2", "Task Test", new Date(), new Date(), "Task 2"); // Suponiendo que Task tiene un constructor adecuado
        Date notificationDate = new Date(System.currentTimeMillis() + 10000); // Fecha en el futuro

        // Prueba que simplemente verifica que el método se ejecuta sin lanzar una excepción
        assertDoesNotThrow(() -> notificationManager.configureReminder(task, notificationDate));
    }

}
