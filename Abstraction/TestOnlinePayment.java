// Interface
interface OnlinePayment {
    void processPayment(double amount);
}

// Class Paytm implements OnlinePayment
class Paytm implements OnlinePayment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using Paytm");
    }
}

// Class GooglePay implements OnlinePayment
class GooglePay implements OnlinePayment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using Google Pay");
    }
}

// Test class
public class TestOnlinePayment {
    public static void main(String[] args) {
        // Parent reference pointing to child objects
        OnlinePayment payment1 = new Paytm();
        OnlinePayment payment2 = new GooglePay();

        payment1.processPayment(500);
        payment2.processPayment(1200);
    }
}
