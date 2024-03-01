package org.project_management;

import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ProjectItemTest {

    @Test
    void projectItemMethods_ShouldWorkCorrectly_ForTask() {
        Date startDate = new Date(2023, 1, 1);
        Date endDate = new Date(2023, 12, 31);
        Task task = new Task("001", "Test Task", startDate, endDate, "Task Name");

        assertEquals("001", task.getId(), "El ID del Task no se estableció correctamente.");
        assertEquals("Test Task", task.getDescription(), "La descripción del Task no se estableció correctamente.");
        assertEquals(startDate, task.getStartDate(), "La fecha de inicio del Task no se estableció correctamente.");
        assertEquals(endDate, task.getEndDate(), "La fecha de finalización del Task no se estableció correctamente.");
    }

    @Test
    void projectItemMethods_ShouldWorkCorrectly_ForResource() {
        Date startDate = new Date(2023, 1, 1);
        Date endDate = new Date(2023, 12, 31);
        Resource resource = new Resource("002", "Test Resource", startDate, endDate, "Resource Name");

        assertEquals("002", resource.getId(), "El ID del Resource no se estableció correctamente.");
        assertEquals("Test Resource", resource.getDescription(), "La descripción del Resource no se estableció correctamente.");
        assertEquals(startDate, resource.getStartDate(), "La fecha de inicio del Resource no se estableció correctamente.");
        assertEquals(endDate, resource.getEndDate(), "La fecha de finalización del Resource no se estableció correctamente.");
    }

    // No se puede probar directamente el método displayDetails() ya que es abstracto.
    // Las pruebas para este método deberían ir en las clases concretas que lo implementan (Task, Resource, etc.).
}
