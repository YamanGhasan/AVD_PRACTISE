import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        MediaLibrary library = new MediaLibrary();
        
        Movie movie1 =new Movie("it ends with us","Yaman" ,new Date(),"sad movie","+18");
        Album album1 =new Album("Childhood","laila",new Date(),"the love of my life");
         
        library.addMediaItem(movie1);
        library.addMediaItem(album1);

        movie1.displayStatus();

        library.borrowMediaItem("it ends with us");
        library.returnMediaItem("it ends with us");

        library.searchByTitle("Childhood");


    }
}