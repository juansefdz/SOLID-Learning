package exercises.payment;

public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod, Double amount) {
        paymentMethod.processPayment(amount);
    }
}