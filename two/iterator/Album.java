package iterator;

import java.util.ArrayList;

public class Album {
	private String album;
	private ArrayList<Song> songs;

	public Album(String name) {
		this.album = name;
		songs = new ArrayList<Song>();
	}

  public boolean addSong(String name, String artist, double length, Genre genre) {
    if (songs.size() < 20) {
      songs.add(new Song(name, artist, length, genre));
      return true;
    } else
    return false;
  }

	public String getName() {
		return album;
	}

	public AlbumIterator createIterator() {
		return new AlbumIterator(songs);
	}
}