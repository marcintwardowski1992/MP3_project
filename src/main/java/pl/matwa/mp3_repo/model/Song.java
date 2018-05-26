package pl.matwa.mp3_repo.model;

public class Song {

    double lenghtOfTheSong;
    String title;
    Album album;
    Rating ratingSong;

    public Song(String title) {
        this.title = title;
    }

    public Song(double lenghtOfTheSong, String title, Album album, Rating ratingSong) {
        this.lenghtOfTheSong = lenghtOfTheSong;
        this.title = title;
        this.album = album;
        this.ratingSong = ratingSong;
    }
}
