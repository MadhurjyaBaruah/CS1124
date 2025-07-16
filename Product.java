public class Product {
    private String item;
    private String name;
    private double price;
    private int quantity;

    public Product(String item, String name, double price, int quantity) {
        this.item = item;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setItem(String item) {

        this.item = item;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Item: " + item + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity;
    }

    public static void main(String[] args) {

        Product[] products = new Product[5];

        products[0] = new Product("01", "Laptop", 1200.90, 10);
        products[1] = new Product("02", "Mouse", 25.50, 50);
        products[2] = new Product("03", "Keyboard", 75.99, 30);
        products[3] = new Product("04", "Monitor", 3999.99, 15);
        products[4] = new Product("05", "Webcam", 50.99, 20);

        System.out.println("Product Details:");
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
}
