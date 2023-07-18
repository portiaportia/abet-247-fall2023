package Adapter;
import java.util.ArrayList;
import java.util.Date;

public class MediaAdapter 
{
    private LittleMedia littleMedia;

    public MediaAdapter(LittleMedia littleMedia)
    {
        this.littleMedia = littleMedia;
    }

    public String getTitle()
    {
        String title = littleMedia.getTitle();
        return title;
    }

    public Author getAuthor()
    {
        String author = littleMedia.getAuthor();

    }

    public String getDescription()
    {
        String description = littleMedia.getDescription();
        return description;
    }

    public void addReview(String firstName, String lastName, Date date, double rating, String comment)
    {

    }

    public ArrayList<Review> getReviews()
    {

    }

}
