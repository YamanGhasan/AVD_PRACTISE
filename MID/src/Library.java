import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library {

    ArrayList<LibraryItem> libraries= new ArrayList<>(); //store books and magazines.

  public void  addLibraryItem(LibraryItem item){
      libraries.add(item);
  };
    public void borrowLibraryItem(String title) {
        for (LibraryItem item : libraries) {
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
        for (LibraryItem item : libraries) {
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
        for (LibraryItem item : libraries) {
            item.displayStatus(); // Polymorphic call
        }
    }

 public void searchItem(String title){
     for(LibraryItem library : libraries){
         if(library.getTitle().equals(title)){
             System.out.println("The item found" +title);
     }
     else{
         System.out.println("The item not found" +title);         }

 }
 }
}
