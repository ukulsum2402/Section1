// Abstract class
abstract class Shape {
    // Abstract method
    abstract double area();

    // Normal method
    void display() {
        System.out.println("Displaying shape details...");
    }
}

// Child class 1: Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}

// Child class 2: Rectangle
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

// Test class
public class TestShape {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        c.display();
        System.out.println("Circle Area: " + c.area());

        r.display();
        System.out.println("Rectangle Area: " + r.area());
    }
}
