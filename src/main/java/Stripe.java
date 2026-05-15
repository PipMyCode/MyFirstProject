public class Stripe extends PaymentGateway{

    void processPayment(double amount) {
        System.out.println("Processing payment with Stripe " + amount);
    }
}
