// Parent class
class Vehicle {
    String brand;
    int speed;

    // Constructor
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

// Child class
class Car extends Vehicle {
    String fuelType;

    // Constructor with super
    Car(String brand, int speed, String fuelType) {
        super(brand, speed); // call parent constructor
        this.fuelType = fuelType;
    }

    // Method to display full details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }

    public static void main(String[] args) {
        // Creating Car object
        Car c = new Car("Toyota", 180, "Petrol");

        // Display details
        c.displayDetails();
    }
}
