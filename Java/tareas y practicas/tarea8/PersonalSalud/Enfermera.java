package tarea8.PersonalSalud;

public class Enfermera extends PersonalDeSalud {
    private String hospital;

    public Enfermera(String nombre, int edad, String especialidad, String hospital) {
        super(nombre, edad, especialidad);
        this.hospital = hospital;
    }

    // Getter y setter para hospital
    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    // Método toString para mostrar información de la enfermera(o)
    @Override
    public String toString() {
        return super.toString() + ", Hospital: " + hospital;
    }
}

