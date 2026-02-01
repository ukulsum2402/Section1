class Temperature {
    private double celsius;

    // Setter with validation
    void setCelsius(double value) {
        if (value >= -273.15) {
            this.celsius = value;
        } else {
            System.out.println("Invalid temperature! Cannot go below -273.15°C.");
        }
    }

    // Getter
    double getCelsius() {
        return celsius;
    }

    public static void main(String[] args) {
        Temperature temp = new Temperature();

        temp.setCelsius(25.5);    // valid
        System.out.println("Temperature: " + temp.getCelsius() + "°C");

        temp.setCelsius(-300);    // invalid
        System.out.println("Final Temperature: " + temp.getCelsius() + "°C");
    }
}
