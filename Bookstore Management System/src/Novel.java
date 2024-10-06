import java.util.Date;

public class Novel extends BookItem{

    private String genre;

    public Novel(String title, String auther, Date publishDate, String summary,String genre) {
        super(title, auther, publishDate, summary);
        this.genre=genre;
    }

    @Override
    public void sellItem() {
if(!isSold()){
    System.out.println("The Novel book is exist and selled now" +getTitle());
    setSold(true);
}else {
    System.out.println("The Novel book is already sold: " + getTitle());
}
}

    @Override
    public void returnItem() {
        if(isSold()){
            System.out.println("Return the Novel Book " +getTitle());
            setSold(false); // Update the sold status

        }else{
            System.out.println("The book was not sold: " + getTitle());
        }
    }
}
