package pl.matwa.mp3_repo.service;

import pl.matwa.mp3_repo.model.Album;
import pl.matwa.mp3_repo.model.Performer;

import java.time.Year;
import java.util.List;

public class AlbumServiceImpl implements AlbumService {


    @Override
    public AlbumCreationResult createNewAlbum(Album newAlbum) {
        return null;
    }

    @Override
    public boolean deleteAlbum(Album album) {
        return false;
    }

    @Override
    public Album updateAlbum(Album updated) {
        return null;
    }

    @Override
    public List<Album> findAllAlbums() {
        return null;
    }

    @Override
    public List<Album> findAlbumFromGenre(String genre) {
        return null;
    }

    @Override
    public List<Album> findAlbumsForGivenPerformer(Performer performer) {
        return null;
    }

    @Override
    public List<Album> findAlbumDromGivenYear(Year year) {
        return null;
    }

    @Override
    public List<Album> findFavoriteAlbums() {
        return null;
    }
}
