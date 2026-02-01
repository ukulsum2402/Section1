// Abstract class
abstract class Animal {
    // Abstract method
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class 1: Dog
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2: Cat
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Test class
public class TestAnimals {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.eat();    // inherited normal method
        a1.sound();  // overridden method

        a2.eat();
        a2.sound();
    }
}
