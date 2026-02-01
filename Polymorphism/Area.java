class Area {

    // Area of square
    int area(int side) {
        return side * side;
    }

    // Area of rectangle
    int area(int length, int breadth) {
        return length * breadth;
    }

    // Area of circle
    double area(double radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Area a = new Area();

        int squareArea = a.area(5);           // square
        int rectangleArea = a.area(4, 6);     // rectangle
        double circleArea = a.area(3.5);      // circle

        System.out.println("Square Area: " + squareArea);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Circle Area: " + circleArea);
    }
}
