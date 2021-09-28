package main.java.array;

public class BestTimeToBuySellStock2 {
    public static void main(String[] args) {
        BestTimeToBuySellStock2 obj = new BestTimeToBuySellStock2();
        int prices[] = { 1, 7, 2, 3, 6, 7, 6, 7 };
        System.out.println(obj.maxProfit(prices));
    }

    int maxProfit(int prices[]) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit = maxProfit + (prices[i] - prices[i - 1]);
            }
        }

        return maxProfit;
    }
}

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
