// Interface
interface BankService {
    void deposit(double amount);
    void withdraw(double amount);
}

// Class SavingsAccount implements BankService
class SavingsAccount implements BankService {
    double balance;

    SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to SavingsAccount. Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from SavingsAccount. Balance: " + balance);
        } else {
            System.out.println("Insufficient balance in SavingsAccount");
        }
    }
}

// Class CurrentAccount implements BankService
class CurrentAccount implements BankService {
    double balance;

    CurrentAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to CurrentAccount. Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from CurrentAccount. Balance: " + balance);
        } else {
            System.out.println("Insufficient balance in CurrentAccount");
        }
    }
}

// Test class
public class TestBankService {
    public static void main(String[] args) {
        BankService sa = new SavingsAccount(10000);
        BankService ca = new CurrentAccount(5000);

        sa.deposit(2000);
        sa.withdraw(5000);

        System.out.println();

        ca.deposit(3000);
        ca.withdraw(10000); // insufficient balance
    }
}
