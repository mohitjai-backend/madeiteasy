package main.java.designpatterns.observerpattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockMarket {

    List<StockBroker> brokers = new ArrayList<StockBroker>();

    HashMap<String, Double> hm = new HashMap<String, Double>();

    void addBroker(StockBroker broker) {
        brokers.add(broker);
    }

    void addStock(String stockName, Double stockPrice) {
        hm.put(stockName, stockPrice);
    }

    void update(String stockName, Double stockPrice) {
        hm.put(stockName, stockPrice);
        notifyBrokers(hm);
    }

    void notifyBrokers(Map<String, Double> stocksMap) {
        for(StockBroker stockBroker : brokers) {
            stockBroker.update(stocksMap);
        }
    }

}
