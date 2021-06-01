package main.java.designpatterns.observerpattern;

import java.util.Map;

public class StockViewer implements StockBroker {

    @Override
    public void update(Map<String, Double> stocksMap) {
        System.out.println("Getting updates to Stock Viewer");
        for(Map.Entry<String,Double> stock : stocksMap.entrySet()) {
            System.out.println(stock.getKey()+" : "+stock.getValue());
        }
    }
}
