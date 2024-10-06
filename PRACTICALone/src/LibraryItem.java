import java.util.ArrayList;
import java.util.Date;

abstract class LibraryItem {
    private  String title;
    private String auther;
    private Date publishdate;
    private String summary;
    private boolean isBorrowed;

    public LibraryItem(String title, String auther, Date publishdate, String summary) {
        this.title = title;
        this.auther = auther;
        this.publishdate = publishdate;
        this.summary = summary;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuther() {
        return auther;
    }

    public Date getPublishdate() {
        return publishdate;
    }

    public String getSummary() {
        return summary;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
    protected void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed; // Update borrowed status
    }
    public abstract void borrowItem();
    public abstract void returnItem();


    public void displayStatus() {
        System.out.println("Title "+ title + ", Auther " + auther +
                ", Status " +(isBorrowed ? "Borrowed " : "Available "));
    }
}

