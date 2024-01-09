package practica5;

public class Ave extends Animal {
    public Ave(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " hace un sonido de ave.");
    }
}
