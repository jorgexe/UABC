package org.project_management;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task extends ProjectItem {
    // Atributos específicos de Task
    private String taskName; // Ejemplo de un atributo específico
    private String state; // Atributo para almacenar el estado de la tarea
    private List<Resource> assignedResources; // Lista para almacenar recursos asignados

    // Constructor
    public Task(String id, String description, Date startDate, Date endDate, String taskName) {
        super(id, description, startDate, endDate); // Llamada al constructor de ProjectItem
        this.taskName = taskName;
        this.assignedResources = new ArrayList<>(); // Inicializar la lista aquí
    }

    // getters y setters para los atributos específicos de Task
    public List<Resource> getAssignedResources() {
        return assignedResources;
    }

    public void setAssignedResources(List<Resource> assignedResources) {
        this.assignedResources = assignedResources;
    }



    // Implementación del método abstracto
    @Override
    public void displayDetails() {
        System.out.println("Task ID: " + getId());
        System.out.println("Description: " + getDescription());
        System.out.println("Start Date: " + getStartDate());
        System.out.println("End Date: " + getEndDate());
        // Imprimir atributos específicos de Task
        System.out.println("Task Name: " + taskName);
        // Otros detalles específicos de la tarea
    }

    // Métodos específicos de Task
    public void specificTaskMethod() {
        // Lógica específica de Task
    }

    // deleteAssignedResource
    public void deleteAssignedResource(Resource resource) {
        assignedResources.remove(resource);
    }

    // getState
    public String getState() {
        return state;
    }

    // setState
    public void setState(String state) {
        this.state = state;
    }

    // getName
    public String getName() {
        return taskName;
    }

    // setName
    public void setName(String name) {
        this.taskName = name;
    }

    // addAssignedResource
    public void addAssignedResource(Resource resource) {
        if (!assignedResources.contains(resource)) {
            assignedResources.add(resource);
        }
    }



}
