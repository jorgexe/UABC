package tarea8.Persona;

public class Estudiante extends Persona {
    private String numeroEstudiante;

    public Estudiante(String nombre, int edad, String numeroEstudiante) {
        super(nombre, edad);
        this.numeroEstudiante = numeroEstudiante;
    }

    // Getter y setter para numeroEstudiante
    public String getNumeroEstudiante() {
        return numeroEstudiante;
    }

    public void setNumeroEstudiante(String numeroEstudiante) {
        this.numeroEstudiante = numeroEstudiante;
    }

    // Método toString para mostrar información del estudiante
    @Override
    public String toString() {
        return super.toString() + ", Número de Estudiante: " + numeroEstudiante;
    }
}

