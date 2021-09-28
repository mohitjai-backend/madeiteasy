package main.java.array;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        BestTimeToBuySellStock obj = new BestTimeToBuySellStock();
        System.out.println(obj.maxProfit(prices));
    }

    int maxProfit(int prices[]) {
        int maxProfit = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - min);
            min = Math.min(min, prices[i]);
        }

        return maxProfit;
    }
}

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
