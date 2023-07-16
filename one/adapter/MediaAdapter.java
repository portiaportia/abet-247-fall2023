package adapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 * A class that converts a little book to a book
 * @author Rhaynie Bongiorno
 */
public class MediaAdapter implements Media {
    private LittleMedia littleMedia;

    MediaAdapter(LittleMedia littleMedia) {
        this.littleMedia = littleMedia;
    }

    public String getTitle() {
        return littleMedia.getTitle();
    }

    /**
     * Breaks the author string down to a first name and last name
     * then creates a new author object with them.
     */
    public Author getAuthor() {
        String author = littleMedia.getAuthor();
        String firstName = author.substring(0, author.indexOf(" "));
        String lastName = author.substring(author.indexOf(" "),author.length()-1);

        return new Author(firstName, lastName);
    }

    public String getDescription() {
        return littleMedia.getDescription();
    }

    /**
     * Adds the first and last name together to create the username.
     * Converts the double rating to an integer.
     * @param firstName The first name of the reviewer.
     * @param lastName The last name of the reviewer.
     * @param date Date the review was made.
     * @param rating The rating given from the review.
     * @param comment The review comment.
     */
    public void addReview(String firstName, String lastName, Date date, double rating, String comment) {
        String username = firstName + " " + lastName;
        int intRating = (int) rating;
        // A manual check for rounding because when java converts a double to an integer, it always rounds down.
        if((rating - intRating) >= 0.5)
            intRating += 1;
       littleMedia.addReview(username, date, intRating, comment);
    }

    // I will be honest, I don't like how this is written, but it works.
    // If I had time to refactor this, I would.
    public ArrayList<Review> getReviews() {
        ArrayList<String> sReviews = littleMedia.getReviews();
        ArrayList<Review> reviews = new ArrayList<Review>();
        
        for(String r : sReviews) {
           String copy = r;
           double rating = Double.parseDouble(copy.substring(0,2)); // Parse rating
           String comment = copy.substring(copy.indexOf('-')+2, copy.indexOf("by")-1); // Parse comment
           copy = copy.substring(copy.indexOf("by")+3);
           String firstName = copy.substring(0, copy.indexOf(" ")); // Parse first name
           copy = copy.substring(copy.indexOf(" ")+1);
           String lastName = copy.substring(0, copy.indexOf(" ")); // Parse last name
           copy = copy.substring(copy.indexOf('-')+2);
           Date date;
            try {
                date = new SimpleDateFormat("MM/dd/yyyy").parse(copy);
            } catch (ParseException e) {
                date = null;
            } // Parse date
            reviews.add(new Review(firstName, lastName, date, rating, comment));
        }
        return reviews;
    }
}
