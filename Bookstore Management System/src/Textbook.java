import java.util.Date;

public class Textbook extends BookItem{
private String subject;
    public Textbook(String title, String auther, Date publishDate, String summary,String subject) {
        super(title, auther, publishDate, summary);
        this.subject=subject;
    }

    @Override
    public void sellItem() {
        if(!isSold()){
            System.out.println("The Textbook is exist and selled now" +getTitle());
        }else{
            System.out.println("The Textbook is does not exist " +getTitle());
        }
    }

    @Override
    public void returnItem() {
        if(isSold()){
            System.out.println("Return the Textbook " +getTitle());
        }else{
            System.out.println("The Textbook is sold " +getTitle());
        }
    }
}
