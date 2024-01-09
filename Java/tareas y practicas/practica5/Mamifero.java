package practica5;

public class Mamifero extends Animal {
    public Mamifero(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " hace un sonido de mamífero.");
    }
}
