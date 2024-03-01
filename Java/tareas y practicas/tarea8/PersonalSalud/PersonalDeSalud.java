package tarea8.PersonalSalud;

public abstract class PersonalDeSalud {
    private String nombre;
    private int edad;
    private String especialidad;

    public PersonalDeSalud(String nombre, int edad, String especialidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.especialidad = especialidad;
    }

    // Getters y setters para nombre, edad y especialidad
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Método toString para mostrar información del personal de salud
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Especialidad: " + especialidad;
    }
}

