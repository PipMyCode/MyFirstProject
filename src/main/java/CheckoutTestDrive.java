public class CheckoutTestDrive {
    public static void main (String[] args) {

        CheckoutService checkout = new CheckoutService();

        PaymentGateway userChoice1 = new PayStack();
        checkout.completeCheckout(userChoice1, 700.0);

        PaymentGateway userChoice2 = new Stripe();
        checkout.completeCheckout(userChoice2, 700.0);
    }
}
