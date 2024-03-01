package tarea7;

class Email {
    private String usuario;
    private String dominio;

    public Email(String usuario, String dominio) {
        this.usuario = usuario;
        this.dominio = dominio;
    }

    // Getters y setters para los atributos de la clase Email

    public String toString() {
        return "Email: " + usuario + "@" + dominio;
    }
}