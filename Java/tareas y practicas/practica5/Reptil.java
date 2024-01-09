package practica5;

public class Reptil extends Animal {
    public Reptil(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " hace un sonido de reptil.");
    }
}
