package pl.matwa.mp3_repo.model;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Album {

    private String title;
    private List<Song> songList;
    private Performer performer;
    LocalDate publicationDate;
    String phonographicPublisher;
    String publisher;
    String genre;
    File cover;
    double price;
    Rating ratingAlbum;
    String opinion;
    TypeOfMedia typeOfMedia;

    // TODO fix initialization of fields not null

    public Album(String title, List<Song> songList, Performer performer) {

        if (Strings.isNullOrEmpty(title)) {
            throw new IllegalArgumentException("title can't be null");
        }
        this.title = title;
        this.songList = Preconditions.checkNotNull(songList, "list of songs can't be null");
        this.performer = Preconditions.checkNotNull(performer, "performer can't be null");
    }

    public Album() {
    }

    public Album(String title, List<Song> songList, Performer performer, LocalDate publicationDate, String phonographicPublisher, String publisher, String genre, File cover, double price, Rating ratingAlbum, String opinion, TypeOfMedia typeOfMedia) {
        this(title,songList,performer);
        this.publicationDate = publicationDate;
        this.phonographicPublisher = phonographicPublisher;
        this.publisher = publisher;
        this.genre = genre;
        this.cover = cover;
        this.price = price;
        this.ratingAlbum = ratingAlbum;
        this.opinion = opinion;
        this.typeOfMedia = typeOfMedia;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }

    public Performer getPerformer() {
        return performer;
    }

    public void setPerformer(Performer performer) {
        this.performer = performer;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getPhonographicPublisher() {
        return phonographicPublisher;
    }

    public void setPhonographicPublisher(String phonographicPublisher) {
        this.phonographicPublisher = phonographicPublisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public File getCover() {
        return cover;
    }

    public void setCover(File cover) {
        this.cover = cover;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Rating getRatingAlbum() {
        return ratingAlbum;
    }

    public void setRatingAlbum(Rating ratingAlbum) {
        this.ratingAlbum = ratingAlbum;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public TypeOfMedia getTypeOfMedia() {
        return typeOfMedia;
    }

    public void setTypeOfMedia(TypeOfMedia typeOfMedia) {
        this.typeOfMedia = typeOfMedia;
    }

    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                ", songList=" + songList +
                ", performer=" + performer +
                ", publicationDate=" + publicationDate +
                ", phonographicPublisher='" + phonographicPublisher + '\'' +
                ", publisher='" + publisher + '\'' +
                ", genre='" + genre + '\'' +
                ", cover=" + cover +
                ", price=" + price +
                ", ratingAlbum=" + ratingAlbum +
                ", opinion='" + opinion + '\'' +
                ", typeOfMedia=" + typeOfMedia +
                '}';
    }
}

