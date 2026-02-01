class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default Constructor called");
    }

    // Constructor with name
    Student(String name) {
        this.name = name;
        age = 0;
        System.out.println("Constructor with Name called");
    }

    // Constructor with name and age
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor with Name and Age called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Using default constructor
        Student s1 = new Student();
        s1.display();

        System.out.println();

        // Using constructor with name
        Student s2 = new Student("Ayesha");
        s2.display();

        System.out.println();

        // Using constructor with name and age
        Student s3 = new Student("Ali", 20);
        s3.display();
    }
}
