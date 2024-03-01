package org.project_management;// Clase para generar informes y gráficos
import java.util.List;

class ReportGenerator {
    // Método para generar un gráfico de progreso del proyecto
    public void generateProjectProgressChart(Project project) {
        List<Task> tasks = project.getTasks();
        int totalTasks = tasks.size();
        int completedTasks = 0;
        for (Task tarea : tasks) {
            if ("COMPLETADA".equals(tarea.getState())) {
                completedTasks++;
            }
        }
        double porcentajeProgreso = (completedTasks * 100.0) / totalTasks;
        System.out.println("Progreso del Proyecto: " + porcentajeProgreso + "%");
    }

    // Método para generar un informe de tareas completadas
    public void generateCompletedTasksReport(List<Task> tasks) {
        System.out.println("Informe de Tareas Completadas:");
        for (Task task : tasks) {
            if ("COMPLETADA".equals(task.getState())) {
                System.out.println("Tarea: " + task.getName() + ", Estado: " + task.getState());
            }
        }
    }
}

