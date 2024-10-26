public class Product {

    private String name;
    private Integer price;

    Product(String name , Integer price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public Integer getPrice(){
        return price;
    }
    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}
