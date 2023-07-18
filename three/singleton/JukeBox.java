package singleton;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class JukeBox
{

    private ArrayList<Song> songs = new ArrayList<Song>();
    private Queue<String> songQueue = new Queue<String>();
    private static JukeBox jukeBox;

    private JukeBox() {}

    public static JukeBox getInstance()
    {
        if (jukeBox == null) {
            System.out.println("Creating a juke box");
            jukeBox = new JukeBox();
        }
        return jukeBox;
    }

    public String playNextSong()
    {
        String final = "Let's jam to ";
        return final;
    }

    public String requestSong(String title)
    {
        songQueue.add(title);


    }

    public boolean hasMoreSongs()
    {
        return true;
    }
}
