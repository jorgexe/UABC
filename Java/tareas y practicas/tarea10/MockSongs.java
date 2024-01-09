package tarea10;

import java.util.ArrayList;
import java.util.List;

class MockSongs {

    public static List<SongV4> getSongsV4() {
        // Crear una copia mutable de la lista inmutable usando ArrayList
        List<SongV4> songs = new ArrayList<>(
            List.of(
                new SongV4("somersault", "zero 7", 147),
                new SongV4("cassidy", "grateful dead", 158),
                new SongV4("$10", "hitchhiker", 140),
                new SongV4("havana", "cabello", 105),
                new SongV4("Cassidy", "grateful dead", 158),
                new SongV4("50 ways", "simon", 102)
            )
        );
        return songs;
    }
}