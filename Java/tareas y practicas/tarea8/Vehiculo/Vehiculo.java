package tarea8.Vehiculo;

public abstract class Vehiculo {
    private String modelo;
    private int añoFabricacion;

    public Vehiculo(String modelo, int añoFabricacion) {
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
    }

    // Getters y setters para modelo y añoFabricacion
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    // Método toString para mostrar información del vehículo
    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Año de Fabricación: " + añoFabricacion;
    }
}
