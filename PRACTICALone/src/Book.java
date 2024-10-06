import java.util.Date;

public class Book extends LibraryItem {

    private String genre;

    public Book(String title, String author, Date publishDate, String summary, String genre) {
        super(title, author, publishDate, summary);
        this.genre = genre;
    }


    @Override
    public void borrowItem() {
        if (!isBorrowed()) {
            System.out.println("Borrowing a Book: " + getTitle());
            setBorrowed(true); // Set as borrowed
        } else {
            System.out.println("The book is already borrowed.");
        }
    }
    @Override
    public void returnItem() {
        if (isBorrowed()) {
            System.out.println("Returning a Book: " + getTitle());
            setBorrowed(false); // Set as available
        } else {
            System.out.println("The book was not borrowed.");
        }
    }
}

