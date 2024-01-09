package practica7;

import java.util.*;

public class JukeBox2 {
   public static void main(String[] args) {
      new JukeBox2().go();
   }

   public void go() {
      List<SongV3> songList = MockSongs.getSongsV3();
      System.out.println(songList);
      Collections.sort(songList);
      System.out.println(songList);
   }
}
