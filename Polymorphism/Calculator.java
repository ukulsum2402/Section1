class Calculator {

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum1 = calc.add(10, 20);
        double sum2 = calc.add(5.5, 4.5);
        int sum3 = calc.add(1, 2, 3);

        System.out.println("Sum of 2 integers: " + sum1);
        System.out.println("Sum of 2 doubles: " + sum2);
        System.out.println("Sum of 3 integers: " + sum3);
    }
}
