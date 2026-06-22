package ObserverPatternExample;

public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        market.registerObserver(new MobileApp());
        market.registerObserver(new WebApp());
        market.setStockDetails("AAPL", 195.25);
    }
}
