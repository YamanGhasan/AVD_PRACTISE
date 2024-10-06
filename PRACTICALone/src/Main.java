import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Create instances of Book and Magazine
        Book book1 = new Book("Math", "Yaman ", new Date(), "Math Guide ", "Mathematics" );
        Magazine magazine1 = new Magazine("Programming", "Ali ", new Date(), "Programming Guide ", 2);

        // Add items to the library
        library.addLibraryItem(book1);
        library.addLibraryItem(magazine1);

        // Display all items in the library
        library.displayAllItems();

        // Borrow and return a book
        library.borrowLibraryItem("Math ");
        library.returnLibraryItem("Math ");

        // Search for a magazine by title
        library.searchTitle("Programming");
    }
}
