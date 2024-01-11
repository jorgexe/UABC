# 2023-2-prototipo-de-proyecto-5-3-1-equipoc
2023-2-prototipo-de-proyecto-5-3-1-equipoc created by GitHub Classroom

# Biblioteca de Administración de Proyectos

Esta biblioteca de código proporciona un conjunto de herramientas y clases para la creación y gestión de proyectos, tareas, recursos y la generación de informes relacionados. Está diseñada para ser utilizada en aplicaciones de administración de proyectos, facilitando el manejo de tareas, recursos y seguimiento del progreso.

## Características

- Gestión de proyectos y tareas.
- Asignación y control de recursos.
- Generación de informes de progreso y tareas completadas.
- Funcionalidades de calendario para el manejo de días festivos y laborables.

## Instalación

Instrucciones para instalar la biblioteca en tu proyecto:

bash
# Si tu proyecto utiliza Maven, añade esta dependencia a tu pom.xml
<dependency>
    <groupId>org.project_management</groupId>
    <artifactId>project-management-lib</artifactId>
    <version>1.0.0</version>
</dependency>

# Si utilizas Gradle, añade esto a tu build.gradle
implementation 'org.project_management:project-management-lib:1.0.0'


## Uso Básico

Ejemplo de cómo utilizar la biblioteca en tu código:

```
import org.project_management.*;

public class Main {

    public static void main(String[] args) {
    
        // Crear un nuevo proyecto
        Project project = new Project("001", "Proyecto Ejemplo");

        // Añadir tareas al proyecto
        Task task1 = new Task("Task1", "Descripción de la tarea", new Date(), new Date(), "Nombre de la Tarea");
        project.addProjectItem(task1);

        // Añadir recursos
        Resource resource1 = new Resource("Res1", "Descripción del recurso", new Date(), new Date(), "Nombre del Recurso");
        project.addProjectItem(resource1);

        // Asignar recurso a la tarea
        ResourceManager resourceManager = new ResourceManager();
        resourceManager.assignResource(task1, resource1);

        // Imprimir detalles del proyecto
        project.displayProjectDetails();
    }
}
```

## Contribuir

Si deseas contribuir a este proyecto, por favor sigue estos pasos:

1. Haz un "Fork" del repositorio.
2. Crea una "Branch" para tus cambios (`git checkout -b feature/fooBar`).
3. Haz tus cambios y haz un "Commit" (`git commit -am 'Add some fooBar'`).
4. Haz "Push" a tu "Branch" (`git push origin feature/fooBar`).
5. Crea un nuevo "Pull Request".

## Contacto

Jorge Alejandro Sandoval Romo - jorge.sandoval.romo@uabc.edu.mx

Aaron Guadalupe Jimenez Carrillo - aaron.carrillo@uabc.edu.mx

Jonathan David Martinez Espinoza - david.martinez50@uabc.edu.mx


Link del Proyecto: https://github.com/LPOO-FCQI-UABC/2023-2-prototipo-de-proyecto-5-3-1-equipoc
