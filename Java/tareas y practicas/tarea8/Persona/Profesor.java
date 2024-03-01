package tarea8.Persona;

public class Profesor extends Persona {
    private String titulo;

    public Profesor(String nombre, int edad, String titulo) {
        super(nombre, edad);
        this.titulo = titulo;
    }

    // Getter y setter para titulo
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Método toString para mostrar información del profesor
    @Override
    public String toString() {
        return super.toString() + ", Título: " + titulo;
    }
}

