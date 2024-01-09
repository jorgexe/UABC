package practica11;

import java.util.List;
import java.util.stream.Collectors;

public class JukeboxStreams {
    public static void main(String[] args) {
        List<Song> songs = new Songs().getSongs();

        System.out.println("\nRock songs:\n");
        //Ejemplo de uso de streams, caciones de rock
        List<Song> rockSongs = songs.stream()
            .filter(song -> song.getGenre().equals("Rock"))
            .collect(Collectors.toList());
        
        System.out.println(rockSongs);

        System.out.println("\nGenres:\n");
        //Ejemplo de uso steeams, generos de las canciones
        List<String> genres = songs.stream()
            .map(song -> song.getGenre())
            .distinct()
            .collect(Collectors.toList());
        
        System.out.println(genres);
    }
}
