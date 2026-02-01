// Base class
class Teacher {
    String name;

    void teach() {
        System.out.println(name + " is teaching.");
    }
}

// Child class 1
class MathTeacher extends Teacher {
    void solveEquation() {
        System.out.println(name + " is solving a math equation.");
    }
}

// Child class 2
class ScienceTeacher extends Teacher {
    void conductExperiment() {
        System.out.println(name + " is conducting a science experiment.");
    }
}

// Test class with main method
public class TestTeachers {
    public static void main(String[] args) {
        MathTeacher math = new MathTeacher();
        math.name = "Alice";
        math.teach();            // inherited method
        math.solveEquation();    // child-specific

        System.out.println();

        ScienceTeacher science = new ScienceTeacher();
        science.name = "Bob";
        science.teach();               // inherited method
        science.conductExperiment();   // child-specific
    }
}
