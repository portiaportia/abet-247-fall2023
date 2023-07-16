package iterator;

import java.util.Iterator;
/**
 * A class for an album iterator.
 * @Author Rhaynie Bongiorno
 */
public class AlbumIterator implements Iterator {
  private Song[] song;
  private int position = 0;

  /**
   * Creates an album iterator.
   * @param songs The array of songs for the iterator.
   */
  AlbumIterator(Song[] songs) {
    this.song = songs;
  }

  /** 
   * Checks if there is a next song in the iterator.
   * @return true of the song has a next song.
   */
  public boolean hasNext() {
    if(position >= song.length || song[position] == null) {
      return false;
    } else {
      return true;
    }
  }

  /** 
   * Gets the next song in the album.
   * @return A song.
   */
  public Song next() {
    Song songs = song[position];
    position = position + 1;
    return songs;
  }
}
