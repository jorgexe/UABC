package tarea8.Vehiculo;

public abstract class VehiculoTerrestre extends Vehiculo {
    private int velocidadMaxima;

    public VehiculoTerrestre(String modelo, int añoFabricacion, int velocidadMaxima) {
        super(modelo, añoFabricacion);
        this.velocidadMaxima = velocidadMaxima;
    }

    // Getter y setter para velocidadMaxima
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}
