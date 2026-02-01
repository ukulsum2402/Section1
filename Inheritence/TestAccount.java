// Base class
class Account {
    String accountNumber;

    void displayAccountNumber() {
        System.out.println("Account Number: " + accountNumber);
    }
}

// Child class
class LoanAccount extends Account {
    double loanAmount;

    // Method to calculate EMI
    double calculateEMI(double interestRate, int months) {
        // Simple EMI formula: EMI = (P + P*r*months/100)/months
        double emi = (loanAmount + (loanAmount * interestRate * months / 100)) / months;
        return emi;
    }

    void displayLoanDetails() {
        System.out.println("Loan Amount: " + loanAmount);
    }
}

// Test class
public class TestAccount {
    public static void main(String[] args) {
        LoanAccount la = new LoanAccount();
        la.accountNumber = "ACC12345";
        la.loanAmount = 50000;

        la.displayAccountNumber();
        la.displayLoanDetails();

        double emi = la.calculateEMI(10, 12); // 10% interest, 12 months
        System.out.println("Monthly EMI: " + emi);
    }
}
