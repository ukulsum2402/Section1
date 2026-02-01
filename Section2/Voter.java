class Voter {
    private int age;

    // Setter with validation
    void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Age must be positive.");
        }
    }

    // Method to check eligibility
    boolean isEligible() {
        return age >= 18;
    }

    public static void main(String[] args) {
        Voter v = new Voter();

        v.setAge(20);  // valid age
        System.out.println("Age: 20 | Eligible to vote? " + v.isEligible());

        v.setAge(15);  // valid but not eligible
        System.out.println("Age: 15 | Eligible to vote? " + v.isEligible());

        v.setAge(-5);  // invalid age
        System.out.println("Final Age: " + v.age); // cannot access private directly, just for demonstration
    }
}
