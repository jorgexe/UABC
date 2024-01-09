package tarea7;

class Nombre {
    private String primerNombre;
    private String segundoNombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String apodo;

    public Nombre(String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String apodo) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.apodo = apodo;
    }

    public String toString() {
        return "Nombre: " + primerNombre + " " + segundoNombre + " " + apellidoPaterno + " " + apellidoMaterno + " (" + apodo + ")";
    }
}