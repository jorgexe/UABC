package practica5;

public class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    public void emitirSonido() {
        System.out.println(nombre + " emite un sonido genérico.");
    }

    public String getNombre() {
        return nombre;
    }
    
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}
