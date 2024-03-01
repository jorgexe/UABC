package tarea8.PersonalSalud;

public class Médico extends PersonalDeSalud {
    private String hospital;

    public Médico(String nombre, int edad, String especialidad, String hospital) {
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

    // Método toString para mostrar información del médico
    @Override
    public String toString() {
        return super.toString() + ", Hospital: " + hospital;
    }
}

