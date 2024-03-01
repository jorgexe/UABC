package org.project_management;

import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.util.Calendar;

// Esta clase es una clase EJEMPLO para mostrar cómo se puede usar la biblioteca
// de administración de proyectos. No es parte de la biblioteca.

public class ProjectManagementApp {

    private Project project;
    private JFrame frame;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ProjectManagementApp().createAndShowGUI());
    }

    private void createAndShowGUI() {
        // Configuración inicial de la ventana
        frame = new JFrame("Administración de Proyectos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear un proyecto de ejemplo
        JButton createProjectButton = new JButton("Crear Proyecto");
        createProjectButton.addActionListener(e -> createProject());

        JButton addTaskButton = new JButton("Añadir Tarea");
        addTaskButton.addActionListener(e -> addTaskToProject());

        JButton addResourceButton = new JButton("Añadir Recurso");
        addResourceButton.addActionListener(e -> addResourceToProject());

        JButton showDetailsButton = new JButton("Mostrar Detalles del Proyecto");
        showDetailsButton.addActionListener(e -> showProjectDetails());

        // Agregando botones al panel
        JPanel panel = new JPanel();
        panel.add(createProjectButton);
        panel.add(addTaskButton);
        panel.add(addResourceButton);
        panel.add(showDetailsButton);

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private void createProject() {
        // Mostrar un diálogo para que el usuario ingrese el ID y el nombre del proyecto
        JTextField projectIdField = new JTextField(5);
        JTextField projectNameField = new JTextField(20);
        JPanel projectPanel = new JPanel();
        projectPanel.add(new JLabel("ID del Proyecto:"));
        projectPanel.add(projectIdField);
        projectPanel.add(Box.createHorizontalStrut(15)); // Espacio
        projectPanel.add(new JLabel("Nombre del Proyecto:"));
        projectPanel.add(projectNameField);

        int result = JOptionPane.showConfirmDialog(frame, projectPanel,
                "Ingrese los detalles del proyecto", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            String projectId = projectIdField.getText().trim();
            String projectName = projectNameField.getText().trim();

            // Verificar que los campos no estén vacíos
            if (projectId.isEmpty() || projectName.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Por favor, complete todos los campos.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Crear el proyecto
            project = new Project(projectId, projectName);
            JOptionPane.showMessageDialog(frame, "Proyecto '" + projectName + "' creado con éxito!");
        }
    }

    private void addTaskToProject() {
        if (project == null) {
            JOptionPane.showMessageDialog(frame, "Primero crea un proyecto!");
            return;
        }

        JTextField taskIdField = new JTextField(5);
        JTextField taskNameField = new JTextField(20);
        JTextField taskDescriptionField = new JTextField(20);
        JTextField durationField = new JTextField(5); // Para la duración en días
        JPanel taskPanel = new JPanel(new GridLayout(0, 1));
        taskPanel.add(new JLabel("ID de la Tarea:"));
        taskPanel.add(taskIdField);
        taskPanel.add(new JLabel("Nombre de la Tarea:"));
        taskPanel.add(taskNameField);
        taskPanel.add(new JLabel("Descripción de la Tarea:"));
        taskPanel.add(taskDescriptionField);
        taskPanel.add(new JLabel("Duración (días):"));
        taskPanel.add(durationField);

        int result = JOptionPane.showConfirmDialog(frame, taskPanel,
                "Ingrese los detalles de la tarea", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            try {
                String taskId = taskIdField.getText().trim();
                String taskName = taskNameField.getText().trim();
                String taskDescription = taskDescriptionField.getText().trim();
                int duration = Integer.parseInt(durationField.getText().trim());

                if (taskId.isEmpty() || taskName.isEmpty() || taskDescription.isEmpty() || duration < 1) {
                    JOptionPane.showMessageDialog(frame, "Por favor, complete todos los campos correctamente.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Date startDate = new Date(); // Fecha de inicio es la actual
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(startDate);
                calendar.add(Calendar.DAY_OF_MONTH, duration); // Agregar duración en días para calcular la fecha de fin

                Task task = new Task(taskId, taskDescription, startDate, calendar.getTime(), taskName);
                project.addProjectItem(task);
                JOptionPane.showMessageDialog(frame, "Tarea '" + taskName + "' añadida al proyecto!");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame, "Por favor, ingrese un número válido para la duración.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void addResourceToProject() {
        if (project == null) {
            JOptionPane.showMessageDialog(frame, "Primero crea un proyecto!");
            return;
        }

        JTextField resourceIdField = new JTextField(5);
        JTextField resourceNameField = new JTextField(20);
        JTextField resourceDescriptionField = new JTextField(20);
        JTextField durationField = new JTextField(5); // Para la duración en días
        JPanel resourcePanel = new JPanel(new GridLayout(0, 1));
        resourcePanel.add(new JLabel("ID del Recurso:"));
        resourcePanel.add(resourceIdField);
        resourcePanel.add(new JLabel("Nombre del Recurso:"));
        resourcePanel.add(resourceNameField);
        resourcePanel.add(new JLabel("Descripción del Recurso:"));
        resourcePanel.add(resourceDescriptionField);
        resourcePanel.add(new JLabel("Duración (días):"));
        resourcePanel.add(durationField);

        int result = JOptionPane.showConfirmDialog(frame, resourcePanel,
                "Ingrese los detalles del recurso", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            try {
                String resourceId = resourceIdField.getText().trim();
                String resourceName = resourceNameField.getText().trim();
                String resourceDescription = resourceDescriptionField.getText().trim();
                int duration = Integer.parseInt(durationField.getText().trim());

                if (resourceId.isEmpty() || resourceName.isEmpty() || resourceDescription.isEmpty() || duration < 1) {
                    JOptionPane.showMessageDialog(frame, "Por favor, complete todos los campos correctamente.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Date startDate = new Date(); // Fecha de inicio es la actual
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(startDate);
                calendar.add(Calendar.DAY_OF_MONTH, duration); // Agregar duración en días para calcular la fecha de fin

                Resource resource = new Resource(resourceId, resourceDescription, startDate, calendar.getTime(), resourceName);
                project.addProjectItem(resource);
                JOptionPane.showMessageDialog(frame, "Recurso '" + resourceName + "' añadido al proyecto!");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame, "Por favor, ingrese un número válido para la duración.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    private void showProjectDetails() {
        if (project == null) {
            JOptionPane.showMessageDialog(frame, "Primero crea un proyecto!");
            return;
        }

        JTextArea textArea = new JTextArea(16, 58);
        textArea.setEditable(false);

        StringBuilder details = new StringBuilder();
        details.append("ID del Proyecto: ").append(project.getProjectId()).append("\n");
        details.append("Nombre del Proyecto: ").append(project.getProjectName()).append("\n\n");

        for (ProjectItem item : project.getProjectItems()) {
            if (item instanceof Task) {
                Task task = (Task) item;
                details.append("Tarea ID: ").append(task.getId()).append("\n");
                details.append("Nombre: ").append(task.getName()).append("\n");
                details.append("Descripción: ").append(task.getDescription()).append("\n");
                details.append("Fecha de Inicio: ").append(task.getStartDate().toString()).append("\n");
                details.append("Fecha de Finalización: ").append(task.getEndDate().toString()).append("\n");
                details.append("Estado: ").append(task.getState() != null ? task.getState() : "No especificado").append("\n\n");
            } else if (item instanceof Resource) {
                Resource resource = (Resource) item;
                details.append("Recurso ID: ").append(resource.getId()).append("\n");
                details.append("Nombre: ").append(resource.getName()).append("\n");
                details.append("Descripción: ").append(resource.getDescription()).append("\n");
                details.append("Fecha de Inicio: ").append(resource.getStartDate().toString()).append("\n");
                details.append("Fecha de Finalización: ").append(resource.getEndDate().toString()).append("\n\n");
            }
        }

        textArea.setText(details.toString());

        JScrollPane scrollPane = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(frame, scrollPane, "Detalles del Proyecto", JOptionPane.INFORMATION_MESSAGE);
    }


}

