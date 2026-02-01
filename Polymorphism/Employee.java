class Employee {

    // Calculate salary with basic only
    double calculateSalary(double basic) {
        return basic; // no bonus
    }

    // Calculate salary with basic + bonus
    double calculateSalary(double basic, double bonus) {
        return basic + bonus;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        double salary1 = emp.calculateSalary(50000);           // only basic
        double salary2 = emp.calculateSalary(50000, 10000);   // basic + bonus

        System.out.println("Salary with basic only: " + salary1);
        System.out.println("Salary with basic + bonus: " + salary2);
    }
}
