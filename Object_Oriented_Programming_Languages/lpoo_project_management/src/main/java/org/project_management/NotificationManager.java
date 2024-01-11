package org.project_management;// Clase para gestionar notificaciones y recordatorios

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class NotificationManager {
    // Método para configurar una notificación para una tarea específica
    public void configureNotification(Task task, Date notificationDate) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Lógica para enviar la notificación (puedes implementar esto según tus necesidades)
                System.out.println("Notificación para la tarea: " + task.getName() + " - Fecha: " + notificationDate);
            }
        }, notificationDate);
    }

    // Método para configurar un recordatorio para una tarea específica
    public void configureReminder(Task task, Date notificationDate) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Lógica para enviar el recordatorio (puedes implementar esto según tus necesidades)
                System.out.println("Recordatorio para la tarea: " + task.getName() + " - Fecha: " + notificationDate);
            }
        }, notificationDate);
    }
}

