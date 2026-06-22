package AdapterPatternExample;

public class StripeGateway {
    public void chargeCard(double amount) {
        System.out.println("Stripe charging card for $" + amount);
    }
}
