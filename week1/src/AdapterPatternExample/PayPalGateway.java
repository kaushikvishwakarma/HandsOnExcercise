package AdapterPatternExample;

public class PayPalGateway {
    public void sendMoney(double amount) {
        System.out.println("PayPal processing payment of $" + amount);
    }
}
