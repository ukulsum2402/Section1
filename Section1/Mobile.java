class Mobile {
    String brand;
    int batteryPercentage;

    // Method to charge battery
    void charge(int percent) {
        batteryPercentage = batteryPercentage + percent;
        if (batteryPercentage > 100) {
            batteryPercentage = 100;
        }
        System.out.println("Battery after charging: " + batteryPercentage + "%");
    }

    // Method to use battery
    void useBattery(int percent) {
        batteryPercentage = batteryPercentage - percent;
        if (batteryPercentage < 0) {
            batteryPercentage = 0;
        }
        System.out.println("Battery after use: " + batteryPercentage + "%");
    }

    public static void main(String[] args) {
        // Creating Mobile object
        Mobile m = new Mobile();
        m.brand = "Samsung";
        m.batteryPercentage = 50;

        System.out.println("Mobile Brand: " + m.brand);
        System.out.println("Initial Battery: " + m.batteryPercentage + "%");

        // Using methods
        m.charge(40);
        m.useBattery(30);
        m.useBattery(80);
        m.charge(100);
    }
}
