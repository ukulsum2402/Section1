// Abstract class
abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    // Abstract method
    abstract double calculateSalary();

    // Normal method
    void displayEmployee() {
        System.out.println("Employee Name: " + name);
    }
}

// Child class 1: Full-time employee
class FullTimeEmployee extends Employee {
    double basicSalary;
    double hra; // house rent allowance

    FullTimeEmployee(String name, double basicSalary, double hra) {
        super(name);
        this.basicSalary = basicSalary;
        this.hra = hra;
    }

    @Override
    double calculateSalary() {
        return basicSalary + hra; // simple full-time salary calculation
    }
}

// Child class 2: Part-time employee
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked; // simple part-time salary calculation
    }
}

// Test class
public class TestEmployees {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Alice", 50000, 10000);
        Employee e2 = new PartTimeEmployee("Bob", 500, 80);

        e1.displayEmployee();
        System.out.println("Full-time Salary: " + e1.calculateSalary());

        System.out.println();

        e2.displayEmployee();
        System.out.println("Part-time Salary: " + e2.calculateSalary());
    }
}
