package iterator;
/**
 * A class for a song.
 * @Author Rhaynie Bongiorno
 */
public class Song {
  private String name;
  private String artist;
  private double length;
  private Genre genre;

  /**
   * Creates a song.
   * @param name name of the song.
   * @param artist artist of the song.
   * @param length length of the song.
   * @param genre genre of the song.
   */
  Song(String name, String artist, double length, Genre genre) {
    this.name = name;
    this.artist = artist;
    this.length = length;
    this.genre = genre;
  }

  @Override
  /**
   * Creates a string representation of the name, artist, genre, and length of a song
   * @return song name, artist, genre, and length
   */
  public String toString()
  {
    return this.name + " by " 
    + this.artist + " category: " 
    + this.genre + " length: "
    + this.length + " min";
  }
  
}
