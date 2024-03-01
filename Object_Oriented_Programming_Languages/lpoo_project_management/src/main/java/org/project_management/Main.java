package org.project_management;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de recursos
        Resource recurso1 = new Resource("R1", "Desarrollador Senior", new Date(), null, "Juan Pérez");
        Resource recurso2 = new Resource("R2", "Analista de Datos", new Date(), null, "María López");

        // Crear instancias de tareas
        Task tarea1 = new Task("T1", "Desarrollar módulo de login", new Date(), null, "Login Module");
        Task tarea2 = new Task("T2", "Análisis de datos de usuarios", new Date(), null, "User Data Analysis");

        // Crear instancia de un proyecto
        Project proyecto = new Project("P1", "Proyecto de Software");

        // Agregar tareas y recursos al proyecto
        proyecto.addProjectItem(tarea1);
        proyecto.addProjectItem(tarea2);
        proyecto.addProjectItem(recurso1);
        proyecto.addProjectItem(recurso2);

        // Asignar recursos a tareas
        ResourceManager gestorDeRecursos = new ResourceManager();
        gestorDeRecursos.assignResource(tarea1, recurso1); // Asignar Juan a la tarea de desarrollo
        gestorDeRecursos.assignResource(tarea2, recurso2); // Asignar María a la tarea de análisis

        // Establecer y cambiar estados de las tareas
        tarea1.setState("En progreso");
        tarea2.setState("Pendiente");

        // Mostrar detalles del proyecto
        System.out.println("Detalles del Proyecto:");
        proyecto.displayProjectDetails();

        // Cambiar estado de una tarea y mostrar detalles nuevamente
        tarea1.setState("Completada");
        System.out.println("\nDetalles Actualizados del Proyecto:");
        proyecto.displayProjectDetails();
    }
}
