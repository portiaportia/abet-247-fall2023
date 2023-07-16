package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class AlbumIterator implements Iterator<Song> {
	private ArrayList<Song> songs;
	private int position;

	public AlbumIterator(ArrayList<Song> songs) {
		this.songs = songs;
		position = 0;
	}

	
	public boolean hasNext() {
		if (position >= songs.size() || songs.get(position) == null) {
			return false;
		} else {
			return true;
		}
	}

	
	public Song next() {
		Song song = songs.get(position);
		position++;
		return song;
	}
}

