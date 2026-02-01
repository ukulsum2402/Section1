// Parent class
class Shape {
    double area() {
        System.out.println("Calculating area of a generic shape");
        return 0;
    }
}

// Child class 1
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        double result = 3.14 * radius * radius;
        System.out.println("Circle area: " + result);
        return result;
    }
}

// Child class 2
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        double result = length * width;
        System.out.println("Rectangle area: " + result);
        return result;
    }
}

// Test class
public class TestShapes {
    public static void main(String[] args) {
        // Parent reference pointing to child objects
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        // Runtime polymorphism: correct method called based on actual object
        s1.area(); // calls Circle's area
        s2.area(); // calls Rectangle's area
    }
}
