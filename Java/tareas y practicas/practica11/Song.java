package practica11;

public class Song {
    private final String title;
    private final String artist;
    private final String genre;
    private final int year;
    private final int timePlayed;

    public Song(String title, String artist, String genre, int year, int timePlayed) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.timePlayed = timePlayed;
    }

    //Getters

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public int getTimePlayed() {
        return timePlayed;
    }

    //Setters

    public Song setTitle(String title) {
        return new Song(title, artist, genre, year, timePlayed);
    }

    public Song setArtist(String artist) {
        return new Song(title, artist, genre, year, timePlayed);
    }

    public Song setGenre(String genre) {
        return new Song(title, artist, genre, year, timePlayed);
    }

    public Song setYear(int year) {
        return new Song(title, artist, genre, year, timePlayed);
    }

    public Song setTimePlayed(int timePlayed) {
        return new Song(title, artist, genre, year, timePlayed);
    }

    //toString

    @Override
    public String toString() {
        return String.format("%s - %s, %s", title, artist, genre);
    }
}
