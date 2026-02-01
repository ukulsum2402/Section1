class Student {
    private String name;
    private int marks;

    // Setter for marks with validation
    void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Marks must be between 0 and 100.");
        }
    }

    // Getter for marks
    int getMarks() {
        return marks;
    }

    // Setter for name (optional but useful)
    void setName(String name) {
        this.name = name;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Kulsum");
        s.setMarks(85);     // valid
        s.displayDetails();

        s.setMarks(120);    // invalid
        System.out.println("Final Marks: " + s.getMarks());
    }
}
