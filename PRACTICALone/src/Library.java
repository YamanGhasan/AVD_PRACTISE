import java.util.ArrayList;

class Library {
    private ArrayList<LibraryItem> libraryItems;

    public Library() {
        this.libraryItems = new ArrayList<>();
    }

    public void addLibraryItem(LibraryItem item) {
        libraryItems.add(item);
    }
    public void borrowLibraryItem(String title) {
        for (LibraryItem item : libraryItems) {
            if (item.getTitle().equalsIgnoreCase(title) && !item.isBorrowed()) { // Ignore case and check status
                item.borrowItem();
                break;
            } else if (item.getTitle().equalsIgnoreCase(title)) {
                System.out.println("The item is already borrowed.");
                break;
            }
        }
    }
    public void returnLibraryItem(String title) {
        for (LibraryItem item : libraryItems) {
            if (item.getTitle().equalsIgnoreCase(title) && item.isBorrowed()) {
                item.returnItem();
                break;
            } else if (item.getTitle().equalsIgnoreCase(title)) {
                System.out.println("The item was not borrowed.");
                break;
            }
        }
    }

    public void displayAllItems() {
        for (LibraryItem item : libraryItems) {
            item.displayStatus(); // Polymorphic call
        }
    }

    public void searchTitle(String title) {
        for (LibraryItem item : libraryItems) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found: " + title);
                return;
            }
        }
        System.out.println("Not found: " + title);
    }
}
