// Interface
interface Drawable {
    void draw();
}

// Class Circle implements Drawable
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Class Triangle implements Drawable
class Triangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

// Test class
public class TestDrawable {
    public static void main(String[] args) {
        Drawable d1 = new Circle();
        Drawable d2 = new Triangle();

        d1.draw();
        d2.draw();
    }
}
