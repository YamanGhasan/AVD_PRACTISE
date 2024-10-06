import java.util.Date;

public class Album extends MediaItem{
    private String artist;

    public Album(String title, String creator, Date releaseDate, String summary) {
        super(title, creator, releaseDate, summary);
        this.artist = artist;
    }

    @Override
    public void borrowItem() {
        if(!isBorrowed()){
            System.out.println("The Album is Borrowed now " +getTitle());
            setBorrowed(true);
        }
        else {
            System.out.println("The Album is not available" +getTitle());

        }

    }

    @Override
    public void returnItem() {
        if (isBorrowed()) {
            System.out.println("return the Album " +getTitle());
            setBorrowed(false);
        }
        else {
            System.out.println("The Album is not not borrowed" +getTitle());
        }
    }
}
