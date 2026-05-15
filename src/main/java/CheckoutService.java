public class CheckoutService {

    public void completeCheckout(PaymentGateway gateway, double amount){
        gateway.processPayment(amount);

    }

}
