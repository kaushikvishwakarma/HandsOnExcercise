package StrategyPatternExample;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new CreditCardPayment());
        paymentContext.executePayment(250.0);
        paymentContext.setStrategy(new PayPalPayment());
        paymentContext.executePayment(99.99);
    }
}
