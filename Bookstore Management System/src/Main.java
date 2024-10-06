import java.util.Date;

public class Main {
    public static void main(String[] args)
    {
        Bookstore store =new Bookstore();

        Novel novel1= new Novel("Novel one","Yaman" ,new Date(),"AI","powerful book");
        Textbook notes=new Textbook("java notes","Y GH ",new Date(),"personal notes","just notes");

        store.addItem(novel1);
        store.addItem(notes);

         novel1.displayStatus();

         store.sellItem("Novel one");
         store.returnItem("Novel one");

     }
}