package org.project_management;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Definición de la clase Project para representar proyectos
public class Project {
    private String projectId;
    private String projectName;
    private List<ProjectItem> projectItems; // Lista para almacenar tanto Task como Resource objetos

    // Constructor
    public Project(String projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectItems = new ArrayList<>();
    }

    // Añadir un ProjectItem (Task o Resource)
    public void addProjectItem(ProjectItem item) {
        projectItems.add(item);
    }

    // Eliminar un ProjectItem
    public void removeProjectItem(ProjectItem item) {
        projectItems.remove(item);
    }

    // Obtener detalles del proyecto
    public void displayProjectDetails() {
        System.out.println("Project ID: " + projectId);
        System.out.println("Project Name: " + projectName);
        for (ProjectItem item : projectItems) {
            item.displayDetails(); // Llamada polimórfica
        }
    }

    // Métodos getters y setters según sea necesario
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    // Métodos para obtener la lista de ProjectItems
    public List<ProjectItem> getProjectItems() {
        return projectItems;
    }

    public void setProjectItems(List<ProjectItem> projectItems) {
        this.projectItems = projectItems;
    }

    // Otros métodos específicos del proyecto

    // getTasks con lista
    public List<Task> getTasks() {
        // Filtra los projectItems para obtener solo las instancias de Task
        return projectItems.stream()
                           .filter(item -> item instanceof Task)
                           .map(item -> (Task) item)
                           .collect(Collectors.toList());
    }

    // setTasks
    public void setTasks(List<Task> tasks) {
        // Primero, elimina todas las tareas existentes de projectItems
        projectItems.removeIf(item -> item instanceof Task);

        // Ahora agrega todas las tareas de la lista proporcionada
        projectItems.addAll(tasks);
    }

}
