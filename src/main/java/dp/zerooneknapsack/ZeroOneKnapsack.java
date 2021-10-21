package main.java.dp.zerooneknapsack;

public class ZeroOneKnapsack {
    public static void main(String[] args) {
        ZeroOneKnapsack obj = new ZeroOneKnapsack();
        int profits[] = { 1, 6, 10, 16 };
        int weights[] = { 1, 2, 3, 5 };

        int maxProfit = obj.solveKnapsack(profits, weights, 7);
        System.out.println(maxProfit);

        int maxProfit2 = obj.solveKnapsack(profits, weights, 6);
        System.out.println(maxProfit2);
    }

    int solveKnapsack(int profits[], int weights[], int capacity) {
        int n = profits.length;

        if (capacity <= 0 || profits.length == 0 || profits.length != weights.length)
            return 0;

        int dp[][] = new int[n][capacity + 1];

        // if capacity is 0 then profit is also 0
        for (int i = 0; i < n; i++) {
            dp[i][0] = 0;
        }

        // if we have only one weight, we will take it if it is not more than the capacity
        for (int c = 1; c <= capacity; c++) {
            if (weights[0] <= c) {
                dp[0][c] = profits[0];
            }
        }

        for (int i = 1; i < n; i++) {
            for (int c = 1; c <= capacity; c++) {
                int profit1 = dp[i - 1][c];
                int profit2 = 0;
                if (c - weights[i] >= 0) {
                    profit2 = profits[i] + dp[i - 1][c - weights[i]];
                }

                dp[i][c] = Math.max(profit1, profit2);
            }
        }

        //        for(int i=0;i<n;i++) {
        //            for(int c=0;c<=capacity;c++) {
        //                System.out.print(dp[i][c]+" ");
        //            }
        //            System.out.println();
        //        }

        return dp[n - 1][capacity];
    }
}

/*

Our dp[][] array would be->

0 1 1 1 1 1 1 1
0 1 6 7 7 7 7 7
0 1 6 10 11 16 17 17
0 1 6 10 11 16 17 22

Problem statement-
Given the weights and profits of ‘N’ items, we are asked to put these items in a knapsack that has a capacity ‘C’.
The goal is to get the maximum profit from the items in the knapsack.
Each item can only be selected once, as we don’t have multiple quantities of any item.

Given two integer arrays to represent weights and profits of ‘N’ items,
we need to find a subset of these items which will give us maximum profit such that their cumulative weight is not more than a given number ‘C’.
Write a function that returns the maximum profit.
Each item can only be selected once, which means either we put an item in the knapsack or skip it.

Bottom-up Dynamic Programming solution-

dp[i][c] will represent the maximum knapsack profit for capacity ‘c’ calculated from the first ‘i’ items.

So, for each item at index ‘i’ (0 <= i < items.length) and capacity ‘c’ (0 <= c <= capacity), we have two options:

1-> Exclude the item at index ‘i’. In this case, we will take whatever profit we get from the sub-array excluding this item => dp[i-1][c]
2-> Include the item at index ‘i’ if its weight is not more than the capacity. In this case, we include its profit plus whatever profit we get from the remaining capacity and from remaining items => profits[i] + dp[i-1][c-weights[i]]

Finally, our optimal solution will be maximum of the above two values:

-----------------------------------------------------------------
dp[i][c] = max (dp[i-1][c], profits[i] + dp[i-1][c-weights[i]])
----------------------------------------------------------------

The above solution has a time and space complexity of O(N*C), where ‘N’ represents total items, and ‘C’ is the maximum capacity.

 */