// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Intermediate class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Derived class
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

// Test class with main method
public class TestInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();    // from Animal
        p.bark();   // from Dog
        p.weep();   // from Puppy
    }
}
