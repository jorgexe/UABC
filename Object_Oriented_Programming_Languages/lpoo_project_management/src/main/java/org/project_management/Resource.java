package org.project_management;

import java.util.Date;

public class Resource extends ProjectItem {
    // Atributos específicos de Resource
    private String resourceName;

    // Constructor
    public Resource(String id, String description, Date startDate, Date endDate, String resourceName) {
        super(id, description, startDate, endDate); // Llamada al constructor de ProjectItem
        this.resourceName = resourceName;
    }

    // Métodos getters y setters según sea necesario
    public String getName() {
        return resourceName;
    }

    public void setName(String resourceName) {
        this.resourceName = resourceName;
    }

    // Implementación del método abstracto
    @Override
    public void displayDetails() {
        System.out.println("Resource ID: " + getId());
        System.out.println("Description: " + getDescription());
        System.out.println("Start Date: " + getStartDate());
        System.out.println("End Date: " + getEndDate());
        // Imprimir atributos específicos de Resource
        System.out.println("Resource Name: " + resourceName);
        // Otros detalles específicos del recurso
    }

    public boolean isAvailable(Date checkStartDate, Date checkEndDate) {
        // Verifica si las fechas proporcionadas no se superponen con las fechas de inicio y fin del recurso
        return (checkEndDate.before(getStartDate()) || checkStartDate.after(getEndDate()));
    }
}

