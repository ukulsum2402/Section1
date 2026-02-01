class Employee {
    String name;
    double basicSalary;

    // Method to calculate and display gross salary
    void calculateGrossSalary() {
        double hra = basicSalary * 0.20; // 20% HRA
        double da = basicSalary * 0.10;  // 10% DA
        double grossSalary = basicSalary + hra + da;

        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + grossSalary);
    }

    public static void main(String[] args) {
        // Creating Employee object
        Employee emp = new Employee();
        emp.name = "Ayesha";
        emp.basicSalary = 20000;

        // Display final salary
        emp.calculateGrossSalary();
    }
}
