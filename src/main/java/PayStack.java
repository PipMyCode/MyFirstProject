public class PayStack extends PaymentGateway{

    void processPayment(double amount) {
        System.out.println("Processing payment with PayStack " + amount);
    }
}
