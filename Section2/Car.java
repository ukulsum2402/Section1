class Car {
    private int speed;

    // Setter with validation
    void setSpeed(int speed) {
        if (speed >= 0 && speed <= 200) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed! Speed must be between 0 and 200.");
        }
    }

    // Getter
    int getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        Car car = new Car();

        car.setSpeed(80);     // valid
        System.out.println("Speed: " + car.getSpeed());

        car.setSpeed(250);    // invalid
        System.out.println("Final Speed: " + car.getSpeed());
    }
}
