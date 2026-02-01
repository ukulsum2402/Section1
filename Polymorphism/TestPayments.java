// Parent class
class Payment {
    void processPayment() {
        System.out.println("Processing generic payment");
    }
}

// Child class 1
class UPI extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing payment via UPI");
    }
}

// Child class 2
class CreditCard extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing payment via Credit Card");
    }
}

// Test class
public class TestPayments {
    public static void main(String[] args) {
        // Polymorphic array of parent type
        Payment[] payments = { new UPI(), new CreditCard() };

        // Loop through array and call overridden method
        for (Payment p : payments) {
            p.processPayment(); // runtime polymorphism
        }
    }
}
