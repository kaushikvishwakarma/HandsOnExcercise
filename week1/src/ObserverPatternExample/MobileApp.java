package ObserverPatternExample;

public class MobileApp implements Observer {
    @Override
    public void update(String stockName, double price) {
        System.out.println("Mobile app: " + stockName + " price is $" + price);
    }
}
