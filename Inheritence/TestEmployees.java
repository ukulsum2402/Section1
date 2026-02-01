// Base class
class Employee {
    String name;
    double salary;

    void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Child class 1
class Developer extends Employee {
    void code() {
        System.out.println(name + " is coding.");
    }
}

// Child class 2
class Manager extends Employee {
    void manageTeam() {
        System.out.println(name + " is managing the team.");
    }
}

// Test class with main method
public class TestEmployees {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.name = "Alice";
        dev.salary = 70000;
        dev.displayEmployeeDetails();
        dev.code();

        System.out.println();

        Manager mgr = new Manager();
        mgr.name = "Bob";
        mgr.salary = 90000;
        mgr.displayEmployeeDetails();
        mgr.manageTeam();
    }
}
