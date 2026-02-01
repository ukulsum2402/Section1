class Student {
    String name;
    int age;
    int marks;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating first student object
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 20;
        s1.marks = 85;

        // Creating second student object
        Student s2 = new Student();
        s2.name = "Anita";
        s2.age = 22;
        s2.marks = 90;

        // Displaying student details
        s1.displayDetails();
        s2.displayDetails();
    }
}
