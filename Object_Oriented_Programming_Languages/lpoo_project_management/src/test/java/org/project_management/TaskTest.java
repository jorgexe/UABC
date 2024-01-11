package org.project_management;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    private Task task;
    private Resource resource1;
    private Resource resource2;

    @BeforeEach
    void setUp() {
        task = new Task("001", "Task Description", new Date(), new Date(), "Task Name");
        resource1 = new Resource("Res1", "Resource 1 Description", new Date(), new Date(), "Resource 1");
        resource2 = new Resource("Res2", "Resource 2 Description", new Date(), new Date(), "Resource 2");
    }

    @Test
    void addAssignedResource_ShouldAddResourceToList() {
        task.addAssignedResource(resource1);
        assertTrue(task.getAssignedResources().contains(resource1), "resource1 debería estar en la lista de recursos asignados a la tarea.");
    }

    @Test
    void deleteAssignedResource_ShouldRemoveResourceFromList() {
        task.addAssignedResource(resource1);
        task.deleteAssignedResource(resource1);
        assertFalse(task.getAssignedResources().contains(resource1), "resource1 no debería estar en la lista de recursos asignados a la tarea después de ser eliminado.");
    }

    @Test
    void setAndGetTaskName_ShouldSetAndGetTaskName() {
        task.setName("Nuevo Nombre");
        assertEquals("Nuevo Nombre", task.getName(), "El nombre de la tarea no se estableció o recuperó correctamente.");
    }

    @Test
    void setAndGetState_ShouldSetAndGetState() {
        task.setState("COMPLETADA");
        assertEquals("COMPLETADA", task.getState(), "El estado de la tarea no se estableció o recuperó correctamente.");
    }

}
