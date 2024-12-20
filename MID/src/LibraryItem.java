import java.util.Date;

public abstract class  LibraryItem {
    public LibraryItem(String title, String author, Date publishDate, String summary, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.summary = summary;
        this.isBorrowed = isBorrowed;
    }

    private String   title ;
 private String author;
private Date publishDate ;
private String summary  ;
private boolean isBorrowed  ;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
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

    public abstract void borrowItem();
  public abstract void returnItem();
    public void displayStatus(){
        System.out.println("Title " + getTitle() + " The auther " + getAuthor()+ (!isBorrowed ? " available " : " borrowed "));
    };
}
