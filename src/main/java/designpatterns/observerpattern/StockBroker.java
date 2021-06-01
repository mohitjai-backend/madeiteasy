package main.java.designpatterns.observerpattern;

import java.util.Map;

public interface StockBroker {
    void update(Map<String,Double> stocksMap);
}
