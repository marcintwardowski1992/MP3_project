package pl.matwa.mp3_repo.service;

import pl.matwa.mp3_repo.model.Album;
import pl.matwa.mp3_repo.model.Performer;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;

public interface AlbumService {

    public AlbumCreationResult createNewAlbum(Album newAlbum);
    public boolean deleteAlbum(Album album);
    public Album updateAlbum(Album updated);

    public List<Album> findAllAlbums();
    public List<Album> findAlbumFromGenre(String genre);
    public List<Album> findAlbumsForGivenPerformer(Performer performer);
    public List<Album> findAlbumDromGivenYear(Year year);
    public List<Album> findFavoriteAlbums();



}


