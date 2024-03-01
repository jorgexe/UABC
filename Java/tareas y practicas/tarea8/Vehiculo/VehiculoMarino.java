package tarea8.Vehiculo;

public abstract class VehiculoMarino extends Vehiculo {
    private int eslora;

    public VehiculoMarino(String modelo, int añoFabricacion, int eslora) {
        super(modelo, añoFabricacion);
        this.eslora = eslora;
    }

    // Getter y setter para eslora
    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }
}
