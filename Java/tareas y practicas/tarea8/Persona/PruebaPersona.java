package tarea8.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        // Crear un objeto Estudiante
        Estudiante estudiante = new Estudiante("Jorge", 23, "1288599");
        
        // Crear un objeto Profesor
        Profesor profesor = new Profesor("Guillermo", 40, "Ing. Sistemas");
        
        // Mostrar información de los objetos utilizando toString()
        System.out.println("Información del Estudiante:");
        System.out.println(estudiante.toString());

        System.out.println("\nInformación del Profesor:");
        System.out.println(profesor.toString());
    }
}

