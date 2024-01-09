package tarea9;

public class Punto {
    // Variables de instancia
    private double x;
    private double y;

    // Constructor por omisión
    public Punto() {
        this.x = 0.0;
        this.y = 0.0;
    }

    // Constructor típico
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Constructor de copia
    public Punto(Punto otroPunto) {
        this.x = otroPunto.getX();
        this.y = otroPunto.getY();
    }

    // Getter para obtener el valor de x
    public double getX() {
        return x;
    }

    // Setter para establecer el valor de x
    public void setX(double x) {
        this.x = x;
    }

    // Getter para obtener el valor de y
    public double getY() {
        return y;
    }

    // Setter para establecer el valor de y
    public void setY(double y) {
        this.y = y;
    }

    // Método toString para representar el punto como una cadena
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        // Ejemplo de uso de la clase Punto
        Punto punto1 = new Punto(); // Usa el constructor por omisión
        System.out.println("Punto 1: " + punto1);

        Punto punto2 = new Punto(3.0, 4.0); // Usa el constructor típico
        System.out.println("Punto 2: " + punto2);

        Punto punto3 = new Punto(punto2); // Usa el constructor de copia
        System.out.println("Punto 3: " + punto3);

        // Modifica las coordenadas de punto1 usando los setters
        punto1.setX(1.0);
        punto1.setY(2.0);
        System.out.println("Punto 1 modificado: " + punto1);
    }
}
