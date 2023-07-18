package adapter;

import java.util.ArrayList;

import javax.print.attribute.standard.Media;

public class MediaAdapter implements Media {
    private LittleMedia littleMedia;

    public MediaAdapter(LittleMedia littleMedia) {
        this.littleMedia = littleMedia;

    }

    public String getTitle() {
        return littleMedia.getTitle();

    }

    public Author getAuthor() {
        String authorName = littleMedia.getAuthor();

        String fn = authorName.substring(0, authorName.indexOf(" "));
        String ln = authorName.substring(authorName.indexOf(" "));
        Author lmAuthor = new Author(fn, ln);
        return lmAuthor;

    }

    public String getDescription() {
        return littleMedia.getDescription();
        
    }

    public void addReview(String firstName, String lastName, Date date, double rating, String comment) {
        littleMedia.addReview(firstName + " " + lastName, date, rating, comment);

    }

    public ArrayList<Review> getReviews() {
        ArrayList<String> littleReviews = littleMedia.getReviews();
        ArrayList<Review> reviews = new ArrayList();
        reviews = strToReviews(littleReviews);

        return reviews;

    }

    private ArrayList<Review> strToReviews(ArrayList<String> strReviewList) {
        ArrayList<Review> reviews = new ArrayList();
        for(String s : strReviewList) {
            String firstName = s.substring(0, s.indexOf(" "));
            String lastName = s.substring(s.indexOf(" "));
            String date = s.substring(s.indexOf(" "));
            String rating = s.substring(s.indexOf(" "));
            String comment = s.substring(s.length());
            Review review = new Review(firstName, lastName, date, rating, comment);
            reviews.add(review);
        }
        return reviews;

    }
}
