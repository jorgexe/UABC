package tarea8.Vehiculo;

public abstract class VehiculoAereo extends Vehiculo {
    private int altitudMaxima;

    public VehiculoAereo(String modelo, int añoFabricacion, int altitudMaxima) {
        super(modelo, añoFabricacion);
        this.altitudMaxima = altitudMaxima;
    }

    // Getter y setter para altitudMaxima
    public int getAltitudMaxima() {
        return altitudMaxima;
    }

    public void setAltitudMaxima(int altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }
}
