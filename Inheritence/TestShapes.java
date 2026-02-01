// Parent class
class Shape {
    String color;

    void setColor(String color) {
        this.color = color;
    }

    void displayColor() {
        System.out.println("Color: " + color);
    }
}

// Child class 1
class Circle extends Shape {
    double radius;

    Circle(double radius, String color) {
        this.radius = radius;
        setColor(color); // inherited method
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

// Child class 2
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        setColor(color); // inherited method
    }

    double calculateArea() {
        return length * width;
    }
}

// Test class with main method
public class TestShapes {
    public static void main(String[] args) {
        Circle c = new Circle(5, "Red");
        Rectangle r = new Rectangle(4, 6, "Blue");

        System.out.println("Circle Details:");
        c.displayColor();
        System.out.println("Area: " + c.calculateArea());

        System.out.println("\nRectangle Details:");
        r.displayColor();
        System.out.println("Area: " + r.calculateArea());
    }
}
