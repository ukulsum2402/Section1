// Parent class
class Person {
    String name;
    int age;

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class
class Student extends Person {
    int rollNumber;
    int marks;

    void displayStudentDetails() {
        // Display parent details
        displayPersonDetails();

        // Display child details
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        // Creating Student object
        Student s = new Student();
        s.name = "Ayesha";
        s.age = 20;
        s.rollNumber = 101;
        s.marks = 95;

        // Display all details
        s.displayStudentDetails();
    }
}
