//Ayush Patel 2023
package iterator;


import java.util.ArrayList;
import java.util.Iterator;

public class Album 
{
    private Song[] songs;
    private int count;
    private String name;

    public Album(String name)
    {
        name = getName();
    }

    public boolean addSong(String name, String artist, double length, Genre genre)
    {

    }

    public String getName()
    {
        return name;
    }

    public AlbumIterator createIterator()
    {

    }
}