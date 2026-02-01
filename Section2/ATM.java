class ATM {
    private double balance;
    private int pin;

    // Constructor to set initial balance and PIN
    ATM(double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }

    // Method to validate PIN
    boolean validatePin(int enteredPin) {
        return this.pin == enteredPin;
    }

    // Method to withdraw money
    void withdraw(int enteredPin, double amount) {
        if (!validatePin(enteredPin)) {
            System.out.println("Incorrect PIN!");
            return;
        }

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Method to check balance (optional helper)
    double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Creating ATM object
        ATM atm = new ATM(10000, 1234);

        atm.withdraw(1111, 2000);  // wrong PIN
        atm.withdraw(1234, 3000);  // correct PIN
        System.out.println("Remaining Balance: " + atm.getBalance());
    }
}
