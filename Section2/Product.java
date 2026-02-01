class Product {
    private double price;
    private int stock;

    // Setter for price with validation
    void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price! Price must be positive.");
        }
    }

    // Setter for stock with validation
    void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Invalid stock! Stock cannot be negative.");
        }
    }

    // Getter for price
    double getPrice() {
        return price;
    }

    // Getter for stock
    int getStock() {
        return stock;
    }

    public static void main(String[] args) {
        Product p = new Product();

        p.setPrice(1500);   // valid
        p.setStock(50);     // valid
        System.out.println("Price: " + p.getPrice());
        System.out.println("Stock: " + p.getStock());

        p.setPrice(-500);   // invalid
        p.setStock(-10);    // invalid
        System.out.println("Final Price: " + p.getPrice());
        System.out.println("Final Stock: " + p.getStock());
    }
}
