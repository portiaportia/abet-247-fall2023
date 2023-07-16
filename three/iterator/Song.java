//Ayush Patel 2023
package iterator;

public class Song
{
    String name;
    String artist;
    double lenght;
    Genre genre;

    public void Song(String name, String artist, double length, Genre genre)
    {

    }

    public String toString()
    {
        return "Song{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", lenght=" + lenght +
                ", genre=" + genre +
                '}';
    }
}
