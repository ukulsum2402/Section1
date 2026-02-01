// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Test class
public class TestAnimal {
    public static void main(String[] args) {
        // Parent reference pointing to child object
        Animal a;

        a = new Dog(); // Dog object
        a.sound();     // calls Dog's overridden method

        a = new Cat(); // Cat object
        a.sound();     // calls Cat's overridden method
    }
}
