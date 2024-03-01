package practica8;

import java.util.*;

public class JukeBox5 {
   public static void main(String[] args) {
      new JukeBox5().go();
   }

   public void go() {
      List<SongV3> songList = MockSongs.getSongsV3();
      System.out.println(songList);

      System.out.println("\nsorted by title:");
      TitleCompare titleCompare = new TitleCompare();
      songList.sort(titleCompare);
      System.out.println(songList);

      System.out.println("\nsorted by artist:");
      ArtistCompare artistCompare = new ArtistCompare();
      songList.sort(artistCompare);
      System.out.println(songList);

      System.out.println("\nsorted by bpm:");
      BpmCompare bpmCompare = new BpmCompare();
      songList.sort(bpmCompare);
      System.out.println(songList);
   }
}

class TitleCompare implements Comparator<SongV3> {
   public int compare(SongV3 one, SongV3 two) {
      return one.getTitle().compareTo(two.getTitle());
   }
}

class ArtistCompare implements Comparator<SongV3> {
   public int compare(SongV3 one, SongV3 two) {
      return one.getArtist().compareTo(two.getArtist());
   }
}

class BpmCompare implements Comparator<SongV3> {
   public int compare(SongV3 one, SongV3 two) {
      return one.getBpm() - two.getBpm();
   }
}
