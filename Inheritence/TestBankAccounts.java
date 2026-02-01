// Base class
class Bank {
    double balance;

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

// Child class 1: SavingsAccount
class SavingsAccount extends Bank {
    void addInterest(double rate) {
        balance = balance + (balance * rate / 100);
        System.out.println("Interest added at " + rate + "%");
    }
}

// Child class 2: CurrentAccount
class CurrentAccount extends Bank {
    void deductCharges(double charge) {
        if (charge <= balance) {
            balance = balance - charge;
            System.out.println("Charges deducted: " + charge);
        } else {
            System.out.println("Insufficient balance to deduct charges");
        }
    }
}

// Test class with main method
public class TestBankAccounts {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.balance = 10000;
        System.out.println("Savings Account:");
        sa.displayBalance();
        sa.addInterest(5); // 5% interest
        sa.displayBalance();

        System.out.println();

        CurrentAccount ca = new CurrentAccount();
        ca.balance = 8000;
        System.out.println("Current Account:");
        ca.displayBalance();
        ca.deductCharges(500); // deduct charges
        ca.displayBalance();
    }
}
