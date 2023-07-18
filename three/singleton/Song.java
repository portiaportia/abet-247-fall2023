package singleton;

public class Song 
{
    private String title;
    private String artist;

    public Song(String title, String artist)
    {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String toString()
    {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
