class Product {
    private int productId;
    private String name;
    private double price;

    // Setters
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Method to print product details
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
    }
}

class ProductMain {
    public static void main(String[] args) {
        Product p = new Product();
        p.setProductId(101);
        p.setName("Wireless Mouse");
        p.setPrice(599.99);
        p.displayDetails();
    }
}
