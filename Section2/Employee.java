class Employee {
    private double salary;

    // Setter with validation
    void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary! Salary cannot be negative.");
        }
    }

    // Getter
    double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setSalary(25000);   // valid
        System.out.println("Salary: " + emp.getSalary());

        emp.setSalary(-5000);   // invalid
        System.out.println("Final Salary: " + emp.getSalary());
    }
}
