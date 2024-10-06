import java.util.Date;

public abstract class MediaItem { // abstract class means i can`t create an instance from it

    public MediaItem(String title, String creator, Date releaseDate, String summary) {
        this.title = title;
        this.creator = creator;
        this.releaseDate = releaseDate;
        this.summary = summary;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    private String title;
    private String creator;
    private Date releaseDate;
    private String summary ;
    private boolean isBorrowed;

    public abstract void borrowItem();
    public abstract void returnItem();


    public  void displayStatus(){
        System.out.println("Title "+ title + "Creator "+ creator+ "Release Date"+ releaseDate
        + (isBorrowed ? "Borrowed" : "Available "));
    }
}
