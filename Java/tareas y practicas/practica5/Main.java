package practica5;

public class Main {
    public static void main(String[] args) {
        // Crear un arreglo de animales
        Animal[] animales = new Animal[3];

        // Crear objetos de diferentes tipos de animales
        animales[0] = new Mamifero("Vaca", 5);
        animales[1] = new Ave("Paloma", 10);
        animales[2] = new Reptil("Cocodrilo", 2);

        // Invocar métodos en la superclase Animal y en las clases derivadas
        for (Animal animal : animales) {
            System.out.println(animal.toString());
            animal.emitirSonido();
            animal.comer();
            animal.dormir();
            System.out.println();
        }
    }
}
