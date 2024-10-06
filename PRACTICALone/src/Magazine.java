import java.util.Date;

public class Magazine extends LibraryItem {
    private int edition;

    public Magazine(String title, String author, Date publishDate, String summary, int edition) {
        super(title, author, publishDate, summary);
        this.edition = edition;
    }
    @Override
    public void borrowItem() {
        if (!isBorrowed()) {
            System.out.println("Borrowing a Magazine: " + getTitle());
            setBorrowed(true); // Set as borrowed
        } else {
            System.out.println("The magazine is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (isBorrowed()) {
            System.out.println("Returning a Magazine: " + getTitle());
            setBorrowed(false); // Set as available
        } else {
            System.out.println("The magazine was not borrowed.");
        }
    }
}