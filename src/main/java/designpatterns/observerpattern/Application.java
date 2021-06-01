package main.java.designpatterns.observerpattern;

public class Application {

    public static void main(String[] args) {
        StockMarket sm = new StockMarket();

        StockBroker stockViewer = new StockViewer();
        StockBroker stockBuyer = new StockBuyer();

        sm.addBroker(stockBuyer);
        sm.addBroker(stockViewer);

        sm.addStock("Airtel", 531.56);
        sm.addStock("InfoEdge", 4345.23);

        // when updating a stock value, stock market will notify each of its brokers
        sm.update("Airtel", 532.43);
        sm.update("InfoEdge", 4302.23);

    }

}
