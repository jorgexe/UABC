package practica13;

/*Un programa que muestre un círculo relleno y muestre una animación
moviendo ese círculo diagonalmente dentro del marco (Frame). */

import javax.swing.*;
import java.awt.*;

public class CirculoAnimado extends JPanel {
    private int x = 0;
    private int y = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Círculo Animado");
        CirculoAnimado circuloAnimado = new CirculoAnimado();
        frame.add(circuloAnimado);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        // Animación del círculo moviéndose diagonalmente
        while (true) {
            circuloAnimado.moveCircle();
            circuloAnimado.repaint();
            try {
                Thread.sleep(10); // Pausa de 10 milisegundos para la animación
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 50, 50); // Dibuja un círculo relleno en la posición (x, y)
    }

    public void moveCircle() {
        x++; // Incrementa la posición x
        y++; // Incrementa la posición y
        // Si el círculo alcanza el final del marco, reinicia su posición
        if (x > getWidth()) {
            x = 0;
        }
        if (y > getHeight()) {
            y = 0;
        }
    }
}

