// Abstract class
abstract class Vehicle {
    // Abstract method
    abstract void start();

    // Normal method
    void displayType() {
        System.out.println("This is a vehicle");
    }
}

// Child class 1: Car
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting with ignition key");
    }
}

// Child class 2: Bike
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting with kick start");
    }
}

// Test class
public class TestVehicles {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.displayType();
        v1.start();  // calls Car's start()

        System.out.println();

        v2.displayType();
        v2.start();  // calls Bike's start()
    }
}
