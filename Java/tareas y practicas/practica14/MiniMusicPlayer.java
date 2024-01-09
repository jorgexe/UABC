package practica14;

/*Escriba un programa que reproduzca una secuencia de sonidos y muestre un rectángulo 
relleno aleatorio en un marco (frame) por cada sonido reproducido. */

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MiniMusicPlayer {
    private MyDrawPanel panel;
    private Random random = new Random();

    public static void main(String[] args) {
        MiniMusicPlayer mini = new MiniMusicPlayer();
        mini.go();
    }

    public void setUpGui() {
        JFrame frame = new JFrame("My First Music Video");
        panel = new MyDrawPanel();
        frame.setContentPane(panel);
        frame.setBounds(30, 30, 300, 300);
        frame.setVisible(true);
    }

    public void go() {
        setUpGui();

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addControllerEventListener(panel, new int[]{127});
            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            int note = 0;
            for (int i = 0; i < 60; i += 4) {
                note = random.nextInt(50) + 1;
                track.add(makeEvent(144, 1, note, 100, i));
                track.add(makeEvent(176, 1, 127, 0, i));
                track.add(makeEvent(128, 1, note, 100, i + 2));
            }

            sequencer.setSequence(sequence);
            sequencer.setTempoInBPM(120);
            sequencer.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
    MidiEvent event = null;
    try {
        ShortMessage a = new ShortMessage();
        a.setMessage(comd, chan, one, two);
        event = new MidiEvent(a, tick);
    } catch (Exception e) {
    }
    return event;
    }
}


class MyDrawPanel extends JPanel implements ControllerEventListener {
    boolean msg = false;

    public void controlChange(ShortMessage event) {
        msg = true;
        repaint();
    }

    public void paintComponent(Graphics g) {
        if (msg) {

            int r = (int) (Math.random() * 250);
            int gr = (int) (Math.random() * 250);
            int b = (int) (Math.random() * 250);

            g.setColor(new Color(r, gr, b));

            int ht = (int) ((Math.random() * 120) + 10);
            int width = (int) ((Math.random() * 120) + 10);

            int x = (int) ((Math.random() * 40) + 10);
            int y = (int) ((Math.random() * 40) + 10);

            g.fillRect(x, y, ht, width);
            msg = false;
        }
    }
}