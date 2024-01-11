package org.project_management;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ReportGeneratorTest {

    private ReportGenerator reportGenerator;
    private Project project;
    private Task completedTask;
    private Task ongoingTask;

    @BeforeEach
    void setUp() {
        reportGenerator = new ReportGenerator();
        project = new Project("001", "Project Test");

        completedTask = new Task("Task1", "Completed Task", new Date(), new Date(), "Task 1");
        completedTask.setState("COMPLETADA");

        ongoingTask = new Task("Task2", "Ongoing Task", new Date(), new Date(), "Task 2");
        ongoingTask.setState("EN_PROGRESO");

        project.setTasks(Arrays.asList(completedTask, ongoingTask));
    }

    @Test
    void generateProjectProgressChart_ShouldExecuteWithoutException() {
        assertDoesNotThrow(() -> reportGenerator.generateProjectProgressChart(project),
                "generateProjectProgressChart debería ejecutarse sin lanzar una excepción.");
    }

    @Test
    void generateCompletedTasksReport_ShouldExecuteWithoutException() {
        assertDoesNotThrow(() -> reportGenerator.generateCompletedTasksReport(Arrays.asList(completedTask, ongoingTask)),
                "generateCompletedTasksReport debería ejecutarse sin lanzar una excepción.");
    }

}
