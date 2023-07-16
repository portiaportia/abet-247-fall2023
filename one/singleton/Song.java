package singleton;

/**
 *  A class for a Song.
 * @Author Rhaynie Bongiorno
 */

public class Song {
  private String title;
  private String artist;

  /**
   * Creates a song.
   * @param title Title of the song.
   * @param artist Artist of the song.
   */
  public Song(String title, String artist) {
    this.title = title;
    this.artist = artist;
  }

  
  /** 
   * Gets the title of the song.
   * @return String the title.
   */
  public String getTitle() {
    return title;
  }

  
  /** 
   * Creates a string representation of the song.
   * @return String The song title and artist.
   */
  public String toString() {
    return title + " by " + artist;
  }
}
