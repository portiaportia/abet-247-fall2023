package iterator;

public class Song {
	private String name;
	private String artist;
	private double length;
	private Genre genre;

	public Song(String name, String artist, double length, Genre genre) {
		this.name = name;
		this.artist = artist;
		this.length = length;
		this.genre = genre;
	}

  //toString that calls name, artist, genre, and length when printing.
	public String toString() {
		return name + " by " + artist + " category: " + genre + " length: " + length + " min";
	}
}
