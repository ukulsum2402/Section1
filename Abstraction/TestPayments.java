// Abstract class
abstract class Payment {
    // Abstract method
    abstract void pay(double amount);

    // Normal method
    void displayPaymentMethod() {
        System.out.println("Processing a payment...");
    }
}

// Child class 1: UPI
class UPI extends Payment {
    String upiId;

    UPI(String upiId) {
        this.upiId = upiId;
    }

    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI ID: " + upiId);
    }
}

// Child class 2: CreditCard
class CreditCard extends Payment {
    String cardNumber;

    CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
    }
}

// Test class
public class TestPayments {
    public static void main(String[] args) {
        Payment p1 = new UPI("alice@upi");
        Payment p2 = new CreditCard("1234-5678-9012-3456");

        p1.displayPaymentMethod();
        p1.pay(500);

        System.out.println();

        p2.displayPaymentMethod();
        p2.pay(1200);
    }
}
