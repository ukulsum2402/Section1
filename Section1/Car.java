class Car {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Creating Car object
        Car c = new Car();
        c.brand = "Toyota";
        c.model = "Innova";
        c.price = 2500000;

        // Display car details
        c.displayDetails();
    }
}
