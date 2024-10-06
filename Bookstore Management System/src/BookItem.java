import java.util.Date;

public abstract class BookItem { // abstract class means i can`t create an instance from it
    private String title;
    private String author;
    private Date publishDate;
    private String summary;
    private boolean isSold;

    public BookItem(String title, String auther, Date publishDate, String summary) {
        this.title = title;
        this.author = auther;
        this.publishDate = publishDate;
        this.summary = summary;
        this.isSold = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuther() {
        return author;
    }

    public void setAuther(String auther) {
        this.author = auther;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    public abstract void sellItem(); // abstract method means it has no body i can implement it in the subclass
    public abstract void returnItem();

    public void displayStatus() {
        System.out.println("Title: " + title + ", Author: " + author + ", Summary: " + summary + ", Date: " + publishDate +
                ", Status: " + (isSold ? "Sold" : "Available"));
    }
}
