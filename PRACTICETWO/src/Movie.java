import java.util.Date;

public class Movie extends MediaItem {
    private String genre;

    public  Movie(String title, String creator, Date releaseDate, String summary,String genre){
        super(title,creator,releaseDate,summary);
        this.genre=genre;
        }


    @Override
    public void borrowItem() {
        if(!isBorrowed()){
            System.out.println("The Movie is Borrowed now " +getTitle());
            setBorrowed(true);
        }
        else {
            System.out.println("The Movie is not available" +getTitle());

        }

    }

    @Override
    public void returnItem() {
        if (isBorrowed()) {
            System.out.println("return the Movie " +getTitle());
            setBorrowed(false);
        }
        else {
            System.out.println("The Movie is not not borrowed" +getTitle());
        }
    }
}
