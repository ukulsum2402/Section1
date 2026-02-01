class BankAccount {
    String accountHolderName;
    double balance;

    // Method to deposit amount
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw amount
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        // Creating BankAccount object
        BankAccount acc = new BankAccount();
        acc.accountHolderName = "Kulsum";
        acc.balance = 5000;

        System.out.println("Account Holder: " + acc.accountHolderName);

        // Performing operations
        acc.deposit(2000);
        acc.withdraw(1500);
        acc.displayBalance();
    }
}

