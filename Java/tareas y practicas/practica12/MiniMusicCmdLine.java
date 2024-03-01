package practica12;

import javax.sound.midi.*;

public class MiniMusicCmdLine {
    public static void main(String[] args) {
        MiniMusicCmdLine mini = new MiniMusicCmdLine();
        if (args.length < 2) {
            System.out.println("Don't forget the instrument and note args");
        } else {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            mini.play(instrument, note);
        }
    }

    public void play(int instrument, int note){
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            ShortMessage msg1 = new ShortMessage();
            msg1.setMessage(192, 1, instrument, 0);
            MidiEvent event1 = new MidiEvent(msg1, 1);
            track.add(event1);

            ShortMessage msg2 = new ShortMessage();
            msg2.setMessage(144, 1, note, 100);
            MidiEvent event2 = new MidiEvent(msg2, 1);
            track.add(event2);

            ShortMessage msg3 = new ShortMessage();
            msg3.setMessage(128, 1, note, 100);
            MidiEvent event3 = new MidiEvent(msg3, 16);
            track.add(event3);

            player.setSequence(seq);
            player.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
