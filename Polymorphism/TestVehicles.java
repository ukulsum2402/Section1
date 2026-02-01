// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

// Child class 1
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting with ignition key");
    }
}

// Child class 2
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting with kick start");
    }
}

// Test class
public class TestVehicles {
    public static void main(String[] args) {
        // Polymorphic array
        Vehicle[] vehicles = { new Car(), new Bike() };

        // Loop through array and call start()
        for (Vehicle v : vehicles) {
            v.start(); // runtime polymorphism
        }
    }
}
