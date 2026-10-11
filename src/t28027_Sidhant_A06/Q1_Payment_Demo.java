
interface Payment {
    void processPayment(double amount);
    void displayPaymentDetails();
}

class UPIPayment implements Payment {
    String transactionId;
    String upiId;

    UPIPayment(String transactionId, String upiId) {
        this.transactionId = transactionId;
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("UPI Payment Amount: Rs. " + amount);
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("UPI ID: " + upiId);
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println("Payment Method: UPI");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("UPI ID: " + upiId);
    }
}

class CardPayment implements Payment {
    String transactionId;
    String cardNumber;

    CardPayment(String transactionId, String cardNumber) {
        this.transactionId = transactionId;
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Card Payment Amount: Rs. " + amount);
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Card Number: " + cardNumber);
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println("Payment Method: Card");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Card Number: " + cardNumber);
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment upi = new UPIPayment("UPI101", "student@upi");
        Payment card = new CardPayment("CARD101", "1234-5678-9012-3456");

        System.out.println("UPI PAYMENT");
        upi.processPayment(1500);
        upi.displayPaymentDetails();

        System.out.println("\nCARD PAYMENT");
        card.processPayment(2500);
        card.displayPaymentDetails();
    }
}
