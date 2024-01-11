package org.project_management;

import java.util.Date;

public abstract class ProjectItem {
    // Atributos comunes
    private String id;
    private String description;
    private Date startDate;
    private Date endDate;

    // Constructor
    public ProjectItem(String id, String description, Date startDate, Date endDate) {
        this.id = id;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Métodos comunes
    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    // Método abstracto que las clases hijas deben implementar
    public abstract void displayDetails();
}

