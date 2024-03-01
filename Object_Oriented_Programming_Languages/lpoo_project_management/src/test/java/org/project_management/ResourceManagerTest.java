package org.project_management;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ResourceManagerTest {

    private ResourceManager resourceManager;
    private Resource resource1;
    private Resource resource2;
    private Task task;

    @BeforeEach
    void setUp() {
        resourceManager = new ResourceManager();

        // Inicializa los recursos
        resource1 = new Resource("Res1", "Resource 1 Description", new Date(), new Date(), "Resource 1");
        resource2 = new Resource("Res2", "Resource 2 Description", new Date(), new Date(), "Resource 2");

        // Inicializa una tarea
        task = new Task("Task1", "Task Description", new Date(), new Date(), "Task 1");
    }

    @Test
    void addAssignedResource_ShouldAddResourceToList() {
        resourceManager.addAsignedResource(resource1);
        assertTrue(resourceManager.getResources().contains(resource1), "resource1 debería estar en la lista de recursos.");
    }

    @Test
    void deleteAssignedResource_ShouldRemoveResourceFromList() {
        resourceManager.addAsignedResource(resource1);
        resourceManager.deleteAssignedResource(resource1);
        assertFalse(resourceManager.getResources().contains(resource1), "resource1 no debería estar en la lista de recursos después de ser eliminado.");
    }

    @Test
    void assignResource_ShouldAssignResourceToTask() {
        resourceManager.assignResource(task, resource1);
        assertTrue(task.getAssignedResources().contains(resource1), "resource1 debería estar asignado a la tarea.");
    }

    @Test
    void unassignResource_ShouldRemoveResourceFromTask() {
        resourceManager.assignResource(task, resource1);
        resourceManager.unassignResource(task, resource1);
        assertFalse(task.getAssignedResources().contains(resource1), "resource1 no debería estar asignado a la tarea después de ser desasignado.");
    }

}
