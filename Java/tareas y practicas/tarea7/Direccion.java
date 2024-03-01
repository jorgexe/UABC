package tarea7;

class Direccion {
    private String calle;
    private String numeroExterior;
    private String numeroInterior;
    private String colonia;
    private String codigoPostal;
    private String ciudad;
    private String estado;
    private String pais;

    public Direccion(String calle, String numeroExterior, String numeroInterior, String colonia, String codigoPostal, String ciudad, String estado, String pais) {
        this.calle = calle;
        this.numeroExterior = numeroExterior;
        this.numeroInterior = numeroInterior;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.estado = estado;
        this.pais = pais;
    }
    public String toString() {
        return "Dirección: " + calle + " " + numeroExterior + " " + numeroInterior + ", " + colonia + ", " + codigoPostal + ", " + ciudad + ", " + estado + ", " + pais;
    }
}