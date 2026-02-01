// Base class
class Appliance {
    int powerRating; // in Watts

    void turnOn() {
        System.out.println("Appliance with power rating " + powerRating + "W is now ON.");
    }
}

// Child class
class WashingMachine extends Appliance {
    void washClothes() {
        System.out.println("Washing machine is washing clothes.");
    }
}

// Test class
public class TestAppliance {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.powerRating = 2000; // inherited property

        // Call parent method
        wm.turnOn();

        // Call child-specific method
        wm.washClothes();
    }
}
