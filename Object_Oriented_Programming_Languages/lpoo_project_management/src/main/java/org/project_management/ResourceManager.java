package org.project_management;

import java.util.ArrayList;
import java.util.List;

class ResourceManager {
    private List<Resource> resources;

    public ResourceManager() {
        this.resources = new ArrayList<>();
    }

    // Método para agregar un nuevo recurso
    public void addAsignedResource(Resource resource) {
        resources.add(resource);
    }

    // Método para eliminar un recurso
    public void deleteAssignedResource(Resource resource) {
        resources.remove(resource);
    }

    // Método para obtener la lista de recursos
    public List<Resource> getResources() {
        return resources;
    }

    // Método para asignar un recurso a una tarea
    public void assignResource(Task task, Resource resource) {
        task.addAssignedResource(resource);
    }

    // Método para desasignar un recurso de una tarea
    public void unassignResource(Task task, Resource resource) {
        task.deleteAssignedResource(resource);
    }
}

