package singleton;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class JukeBox {
    private static JukeBox jukeBox;
    private ArrayList<Song> songs;
    private Queue<String> songQueue;

    private JukeBox() {
        songs = DataLoader.getSongs();
        songQueue = new LinkedList<>();
    }

    public static JukeBox getInstance() {
        if (jukeBox == null) {
            jukeBox = new JukeBox();
        }
        return jukeBox;
    }

    public String playNextSong() {
        Song song = null;
        if (songQueue.isEmpty()) {
            if (songs.isEmpty()) {
                return "You need to add songs to the list";
            }
            song = songs.remove(0);
        } else {
            String nextSongTitle = songQueue.poll();
            for (Song s : songs) {
                if (s.getTitle().equals(nextSongTitle)) {
                    song = s;
                    songs.remove(s);
                    break;
                }
            }
            if (song == null) {
                return "Sorry we do not have the song " + nextSongTitle;
            }
        }
        return "Let's jam to " + song.getTitle();
    }

    public String requestSong(String title) {
        for (Song s : songs) {
            if (s.getTitle().equals(title)) {
                songQueue.offer(title);
                return title + " is now number " + songQueue.size() + " on the list";
            }
        }
        return "Sorry we do not have the song " + title;
    }

    public boolean hasMoreSongs() {
        return !songQueue.isEmpty() || !songs.isEmpty();
    }
}
