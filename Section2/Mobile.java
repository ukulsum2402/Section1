class Mobile {
    private int batteryLevel;

    // Method to charge battery
    void charge(int amount) {
        if (amount > 0) {
            batteryLevel = batteryLevel + amount;
            if (batteryLevel > 100) {
                batteryLevel = 100;
            }
        }
    }

    // Method to use battery
    void use(int amount) {
        if (amount > 0) {
            batteryLevel = batteryLevel - amount;
            if (batteryLevel < 0) {
                batteryLevel = 0;
            }
        }
    }

    // Getter
    int getBatteryLevel() {
        return batteryLevel;
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();

        m.charge(50);
        System.out.println("Battery: " + m.getBatteryLevel() + "%");

        m.use(30);
        System.out.println("Battery: " + m.getBatteryLevel() + "%");

        m.use(50);    // goes to 0, not below
        m.charge(200); // goes to 100, not above

        System.out.println("Final Battery: " + m.getBatteryLevel() + "%");
    }
}
