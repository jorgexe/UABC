package tarea9;

public class Circulo {
    // Variables de instancia
    private double radio;
    private Punto centro; // El centro es un objeto de la clase Punto

    // Constructor por omisión
    public Circulo() {
        this.radio = 0.0;
        this.centro = new Punto(); // Usa el constructor por omisión de la clase Punto
    }

    // Constructor típico
    public Circulo(double radio, Punto centro) {
        this.radio = radio;
        this.centro = centro;
    }

    // Constructor de copia
    public Circulo(Circulo otroCirculo) {
        this.radio = otroCirculo.getRadio();
        this.centro = new Punto(otroCirculo.getCentro()); // Usa el constructor de copia de la clase Punto
    }

    // Getter para obtener el valor del radio
    public double getRadio() {
        return radio;
    }

    // Setter para establecer el valor del radio
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Getter para obtener el centro (objeto Punto)
    public Punto getCentro() {
        return centro;
    }

    // Setter para establecer el centro (objeto Punto)
    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    // Método toString para representar el círculo como una cadena
    @Override
    public String toString() {
        return "Círculo [radio=" + radio + ", centro=" + centro + "]";
    }

    public static void main(String[] args) {
        // Ejemplo de uso de la clase Circulo
        Punto puntoCentro = new Punto(2.0, 3.0);
        Circulo circulo1 = new Circulo(); // Usa el constructor por omisión
        System.out.println("Círculo 1: " + circulo1);

        Circulo circulo2 = new Circulo(5.0, puntoCentro); // Usa el constructor típico
        System.out.println("Círculo 2: " + circulo2);

        Circulo circulo3 = new Circulo(circulo2); // Usa el constructor de copia
        System.out.println("Círculo 3: " + circulo3);

        // Modifica el radio y el centro del círculo1 usando los setters
        circulo1.setRadio(4.0);
        circulo1.setCentro(new Punto(1.0, 1.0));
        System.out.println("Círculo 1 modificado: " + circulo1);
    }
}
