package org.project_management;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProjectTest {

    private Project project;
    private Task task1;
    private Task task2;
    private Resource resource1;

    @BeforeEach
    void setUp() {
        // Inicializa el proyecto y algunos ProjectItems
        project = new Project("001", "Project Test");
        task1 = new Task("Task1", "Description 1", new Date(), new Date(), "Task 1");
        task2 = new Task("Task2", "Description 2", new Date(), new Date(), "Task 2");
        resource1 = new Resource("Resource1", "Resource 1 Description", new Date(), new Date(), "Resource 1");
    }

    @Test
    void addProjectItem_ShouldAddItemToProject() {
        project.addProjectItem(task1);
        assertTrue(project.getProjectItems().contains(task1), "task1 debería estar en la lista de projectItems.");
    }

    @Test
    void removeProjectItem_ShouldRemoveItemFromProject() {
        project.addProjectItem(task1);
        project.removeProjectItem(task1);
        assertFalse(project.getProjectItems().contains(task1), "task1 no debería estar en la lista de projectItems después de ser eliminado.");
    }

    @Test
    void setAndGetProjectId_ShouldSetAndGetProjectId() {
        project.setProjectId("002");
        assertEquals("002", project.getProjectId(), "El projectId no se estableció o recuperó correctamente.");
    }

    @Test
    void setAndGetProjectName_ShouldSetAndGetProjectName() {
        project.setProjectName("Nuevo Nombre");
        assertEquals("Nuevo Nombre", project.getProjectName(), "El projectName no se estableció o recuperó correctamente.");
    }

    @Test
    void getTasks_ShouldReturnOnlyTasks() {
        project.addProjectItem(task1);
        project.addProjectItem(resource1);
        project.addProjectItem(task2);

        List<Task> tasks = project.getTasks();
        assertTrue(tasks.containsAll(Arrays.asList(task1, task2)) && tasks.size() == 2, "getTasks debería devolver solo las instancias de Task.");
    }

    @Test
    void setTasks_ShouldReplaceExistingTasks() {
        project.addProjectItem(task1);
        project.addProjectItem(resource1);

        Task newTask = new Task("NewTask", "New Description", new Date(), new Date(), "New Task");
        project.setTasks(Arrays.asList(newTask));

        List<ProjectItem> projectItems = project.getProjectItems();
        assertTrue(projectItems.contains(newTask) && projectItems.size() == 2 && !projectItems.contains(task1),
                "setTasks debería reemplazar las tareas existentes con nuevas tareas.");
    }

    // Las pruebas para displayProjectDetails se mantienen igual que en la propuesta anterior

}
