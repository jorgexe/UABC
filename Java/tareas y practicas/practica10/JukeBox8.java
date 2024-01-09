package practica10;

import java.util.*;

public class JukeBox8 {
   public static void main(String[] args) {
      new JukeBox8().go();
   }

   public void go() {
      List<SongV4> songList = MockSongs.getSongsV4();
      System.out.println("Original song list:");
      System.out.println(songList);

      // Ordenar las canciones por título, artista y bpm
      songList.sort(SongV4::compareTo);

      // Almacenar las canciones en un HashSet para eliminar duplicados
      Set<SongV4> uniqueSongs = new HashSet<>(songList);

      System.out.println("\nSorted and duplicates removed:");
      uniqueSongs.forEach(System.out::println);
   }
}
