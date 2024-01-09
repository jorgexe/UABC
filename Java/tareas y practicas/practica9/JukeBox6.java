package practica9;

import java.util.*;

public class JukeBox6 {
   public static void main(String[] args) {
      new JukeBox6().go();
   }

   public void go() {
      List<SongV3> songList = MockSongs.getSongsV3();
      System.out.println(songList);

      System.out.println("\nsorted by title:");
      songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
      System.out.println(songList);

      System.out.println("\nsorted by artist:");
      songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
      System.out.println(songList);

      System.out.println("\nsorted by bpm:");
      songList.sort(Comparator.comparingInt(SongV3::getBpm));
      System.out.println(songList);
   }
}

