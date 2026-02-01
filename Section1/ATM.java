class ATM {
    double balance;

    // Method to deposit money
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Method to check balance
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        // Creating ATM object
        ATM atm = new ATM();
        atm.balance = 10000;

        // Simulating ATM operations
        atm.checkBalance();
        atm.deposit(2000);
        atm.withdraw(3000);
        atm.checkBalance();
    }
}
