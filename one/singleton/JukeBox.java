package singleton;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/**
 *  A class for a Jukebox.
 * @Author Rhaynie Bongiorno
 */

public class JukeBox {
  private static JukeBox jukeBox;
  private ArrayList<Song> songs;
  private Queue<String> songQueue;

  /**
   * Creates a songlist using the data loader and creates a song queue.
   */
  private JukeBox() {
    songs = DataLoader.getSongs();
    songQueue = new LinkedList<String>();
  }

  
  /** 
   * Gets the instance of the Jukebox.
   * @return JukeBox If the Jukebox doesn't exist, creates a Jukebox.
   *         Otherwise, returns the Jukebox instance.
   */
  public static JukeBox getInstance() {
    if (jukeBox == null) {
      jukeBox = new JukeBox();
    }
    return jukeBox;
  }

  
  /** 
   * Plays the next song in the queue.
   * @return String If the queue has no songs, returns a message saying that
   *         songs need to be added. Otherwise, returns a message saying the 
   *         song is playing.
   */
  public String playNextSong() {
    if (!hasMoreSongs()) {
      return "You need to add songs to the list";
    }
    return "Let's jam to " + songQueue.poll();
    
  }

  
  /** 
   * Checks if a song is in the song list. If it is, the song is added to the queue.
   * @param title The title of the song requested.
   * @return String If the song is in the queue, returns a string representation
   *         of the song title and the number in the queue. If the song is not
   *         in the song list, returns a message saying the Jukebox does not have the song.
   */
  public String requestSong(String title) {
    for (Song song : songs) {
      if (song.getTitle().equals(title)) {
        songQueue.add(song.toString());
        return title + " is now number " + songQueue.size() + " on the list";
      }
    }
    return "Sorry we do not have the song " + title;
  }

  
  /** 
   * Checks if there are more songs in the queue.
   * @return boolean returns false if the queue is empty. Otherwise, returns true.
   */
  public boolean hasMoreSongs() {
    if (songQueue.isEmpty()) {
      return false;
    }
    return true;
  }
}
