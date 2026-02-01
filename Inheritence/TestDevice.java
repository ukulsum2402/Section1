// Parent class
class ElectronicDevice {
    String brand;

    void powerOn() {
        System.out.println(brand + " device is now powered on.");
    }
}

// Child class
class Laptop extends ElectronicDevice {
    int ramSize; // in GB

    void displaySpecs() {
        System.out.println("Laptop RAM: " + ramSize + " GB");
    }
}

// Test class with main method
public class TestDevice {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();
        myLaptop.brand = "Dell"; // inherited property
        myLaptop.ramSize = 16;   // child property

        // Call parent method
        myLaptop.powerOn();

        // Call child method
        myLaptop.displaySpecs();
    }
}
