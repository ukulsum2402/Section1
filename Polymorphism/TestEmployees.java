// Parent class
class Employee {
    double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    // Method to calculate bonus
    double calculateBonus() {
        // Generic bonus
        return salary * 0.05; // 5% of salary
    }
}

// Child class 1
class Developer extends Employee {

    Developer(double salary) {
        super(salary);
    }

    @Override
    double calculateBonus() {
        // Developer bonus logic: 10% of salary
        return salary * 0.10;
    }
}

// Child class 2
class Manager extends Employee {

    Manager(double salary) {
        super(salary);
    }

    @Override
    double calculateBonus() {
        // Manager bonus logic: 15% of salary
        return salary * 0.15;
    }
}

// Test class
public class TestEmployees {
    public static void main(String[] args) {
        // Parent reference pointing to child objects
        Employee e1 = new Developer(50000);
        Employee e2 = new Manager(80000);

        System.out.println("Developer bonus: " + e1.calculateBonus());
        System.out.println("Manager bonus: " + e2.calculateBonus());
    }
}
