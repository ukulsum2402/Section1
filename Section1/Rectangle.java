class Rectangle {
    int length;
    int width;

    // Method to calculate area
    int area() {
        return length * width;
    }

    // Method to calculate perimeter
    int perimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        // Creating Rectangle object
        Rectangle r = new Rectangle();
        r.length = 10;
        r.width = 5;

        // Printing results
        System.out.println("Area of Rectangle: " + r.area());
        System.out.println("Perimeter of Rectangle: " + r.perimeter());
    }
}

