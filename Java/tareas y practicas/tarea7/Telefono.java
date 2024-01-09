package tarea7;

class Telefono {
    private String codigoPais;
    private String codigoArea;
    private String numeroTelefono;

    public Telefono(String codigoPais, String codigoArea, String numeroTelefono) {
        this.codigoPais = codigoPais;
        this.codigoArea = codigoArea;
        this.numeroTelefono = numeroTelefono;
    }

    // Getters y setters para los atributos de la clase Telefono

    public String toString() {
        return "Teléfono: +" + codigoPais + " " + codigoArea + " " + numeroTelefono;
    }
}