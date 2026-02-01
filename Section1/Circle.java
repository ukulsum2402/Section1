class Circle {
    double radius;

    // Method to calculate area
    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {
        // Creating Circle object
        Circle c = new Circle();
        c.radius = 7;

        // Printing area
        c.calculateArea();
    }
}
