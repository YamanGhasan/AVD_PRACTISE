import java.util.Date;

public class Magazine extends LibraryItem{
    private int edition;

    public Magazine(String title, String author, Date publishDate, String summary, boolean isBorrowed,int edition ) {
        super(title, author, publishDate, summary, isBorrowed);
        this.edition=edition;
    }

    @Override
    public void borrowItem() {
if(!isBorrowed()){
    System.out.println("Borrowing a Magazine:" +getTitle());
    setBorrowed(true);
}
else {
    System.out.println("This Magazine is already borrowed");
}
    }

    @Override
    public void returnItem() {
if(isBorrowed()){
    System.out.println("Returning a Magazine:" +getTitle());
    setBorrowed(false);
}
else {
    System.out.println("This Magazine is  not avilable");
}
    }
}
