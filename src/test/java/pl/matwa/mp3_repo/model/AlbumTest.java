package pl.matwa.mp3_repo.model;

//metoda testowa musi byc publiczna i nic nie zwracac


import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class AlbumTest {

    @Test
    public void creationAlbum_success(){
        Album newAlbum = new Album("Piosenki ludowe",Collections.emptyList(), new Performer());
        Assert.assertNotNull("Problem occured during creation new album", newAlbum);

    }

    @Test
    public void creationAlbum_nullSongList(){
        try {
            Album newAlbum = new Album(" Piosenik ludowe",null, new Performer() );
            Assert.fail("Shouldn't reach here");
        }catch (NullPointerException ex){
            Assert.assertTrue(true);
        }
    }

    @Test(expected = NullPointerException.class) // wyrzuci na blad tej klasy
    public void creationAlbum_nullSongList_withExpected(){
            Album newAlbum = new Album(" Piosenik ludowe",null, new Performer() );
    }


    @Test(expected = IllegalArgumentException.class)
    public void creationAlbum_emptyTitle(){
        Album newAlbum = new Album(null, Collections.emptyList(),new Performer());

    }
    @Test(expected = NullPointerException.class)
    public void creationAlbum_nullPerformert(){

        Album newAlbum = new Album("Piosenik ludowe", Collections.emptyList(), null);
    }

}
