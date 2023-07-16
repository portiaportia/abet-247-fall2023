package iterator;
/**
 * A class for an album
 * @Author Rhaynie Bongiorno
 */
public class Album {
  private Song[] song;
  private int count;
  private String name;

 /**
 * Creates an album.
 * @param name The name of the album.
 */
public Album(String name) {
    this.name = name;
    song = new Song[20];
    count = 0;
  }

 /**
 * Adds a song to the album.
 * @param name The name of the song.
 * @param artist The name of the artist.
 * @param length The length of the song.
 * @param genre The genre of the song.
 * @return Returns true if the song is successfully added, false if not.
 */
public boolean addSong(String name, String artist, double length, Genre genre) {
    Song newSong = new Song(name,artist,length,genre);
    if(count > 20) {
      return false;
    } else {
      song[count] = newSong;
      count++;
      return true;
    }
  }

 /**
 * Creates an album interator.
 * @return the album iterator created.
 */
public AlbumIterator createIterator() {
    return new AlbumIterator(song);
  }

 /**
 * Retreives the name of the album.
 * @return the name of the album as a String.
 */
public String getName() {
    return this.name;
  }
}
