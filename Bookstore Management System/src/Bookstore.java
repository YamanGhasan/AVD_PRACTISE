import java.util.ArrayList;

public class Bookstore {
    ArrayList<BookItem> books;

    public Bookstore() {
        books = new ArrayList<>();
    }

    public void addItem(BookItem book) {
        books.add(book);
    }

    public void sellItem(String title) {
        boolean found = false;
        for (BookItem book : books) {
            if (book.getTitle().equals(title)) {
                found = true;
                if (!book.isSold()) {
                    book.sellItem(); // This will now update the sold status
                } else {
                    System.out.println("The item is already sold: " + book.getTitle());
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found: " + title);
        }
    }

    public void returnItem(String title) {
        boolean found = false;
        for (BookItem book : books) {
            if (book.getTitle().equals(title)) {
                found = true;
                if (book.isSold()) {
                    book.returnItem(); // This will now update the sold status
                } else {
                    System.out.println("The item was not sold: " + book.getTitle());
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found: " + title);
        }
    }
}