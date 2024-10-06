import java.util.ArrayList;

public class MediaLibrary {
    private ArrayList<MediaItem> items = new ArrayList<>();

     public MediaLibrary(){
         items = new ArrayList<>(); // Initialize the list
     }

     public void addMediaItem(MediaItem item){ // applying polymorphism here so item can be a movie or album
         items.add(item);
     }
    public void searchByTitle(String title) {
        boolean found = false;
        for (MediaItem item : items) {
            if (item.getTitle().equals(title)) {
                found = true;
                System.out.println("Found: " + item.getTitle());
                break; // Exit loop after finding
            }
        }
        if (!found) {
            System.out.println("Not Found: " + title);
        }
    }

    public void borrowMediaItem(String title) {
        boolean found = false; // Flag to check if the item was found
        for (MediaItem item : items) {
            if (item.getTitle().equals(title)) {
                found = true; // Item found
                if (!item.isBorrowed()) {
                    item.borrowItem(); // Borrow the item
                } else {
                    System.out.println("The item is not available: " + item.getTitle());
                }
                break; // Exit loop after processing
            }
        }
        if (!found) {
            System.out.println("The item was not found: " + title);
        }
    }

    public void returnMediaItem(String title) {
        boolean found = false; // Flag to check if the item was found
        for (MediaItem item : items) {
            if (item.getTitle().equals(title)) {
                found = true; // Item found
                if (item.isBorrowed()) {
                    item.returnItem(); // Return the item
                } else {
                    System.out.println("The item was not borrowed: " + item.getTitle());
                }
                break; // Exit loop after processing
            }
        }
        if (!found) {
            System.out.println("The item was not found: " + title);
        }
    }
}
