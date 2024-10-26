import java.util.Date;

public class Book extends LibraryItem {
    private  String genre;
    public Book(String title, String author, Date publishDate, String summary, boolean isBorrowed,String genre ) {
        super(title, author, publishDate, summary, isBorrowed);
        this.genre=genre;
    }



    @Override
    public void borrowItem() {
        if(!isBorrowed()){
            System.out.println("Borrowing a Book:" +getTitle());
            setBorrowed(true);
        }
        else {
            System.out.println("This book is already borrowed");
        }
    }

    @Override
    public void returnItem() {
        if(isBorrowed()){
            System.out.println("Returning a Book:" +getTitle());
            setBorrowed(false);
        }
        else {
            System.out.println("This book is  not avilable");
        }
    }
}
