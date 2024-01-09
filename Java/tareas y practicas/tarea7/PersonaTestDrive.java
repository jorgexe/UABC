package tarea7;

public class PersonaTestDrive {
    public static void main(String[] args) {

        // Crear objetos de las clases Nombre, Direccion, Telefono y Email
        Nombre nombrePersona = new Nombre("Jorge", "Alejandro", "Sandoval", "Romo", "Sando");
        Direccion direccionPersona = new Direccion("Calle Matadero", "5745", "13", "Otay", "12345", "Tijuana", "Baja California", "Mexico");
        Telefono telefonoPersona = new Telefono("1", "664", "1234567");
        Email emailPersona = new Email("jorge.sandoval", "uabc.edu.mx");

        // Crear objeto Persona
        Persona persona = new Persona(nombrePersona, direccionPersona, telefonoPersona, emailPersona);

        // Imprimir la información de la persona
        System.out.println("**********************************************************************************************");
        System.out.println(persona.toString());
    }
}


