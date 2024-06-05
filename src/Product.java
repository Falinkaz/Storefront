public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice(){ return price;}
    public String getName() { return name;}

    @Override
    public String toString() {
        return "Article: " + this.getName() + "Price: " + getPrice();
    }

}
