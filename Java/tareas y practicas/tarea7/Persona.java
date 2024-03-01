package tarea7;

class Persona {
    private Nombre nombre;
    private Direccion direccion;
    private Telefono telefono;
    private Email email;

    public Persona(Nombre nombre, Direccion direccion, Telefono telefono, Email email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    // Getters y setters para los atributos de la clase Persona

    public String toString() {
        return nombre.toString() + "\n" + direccion.toString() + "\n" + telefono.toString() + "\n" + email.toString();
    }
}