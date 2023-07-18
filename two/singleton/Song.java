package singleton;

public class Song {
    private String title;
    private String artist;

public Song(String title, String artist){
    this.title = title;
    this.artist = artist;
}

public String getTitle(){
    return title;
}

public String toString(){
    return title + " by " + artist;
}
}


