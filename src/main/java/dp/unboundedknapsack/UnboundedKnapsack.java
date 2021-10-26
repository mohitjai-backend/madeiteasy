package main.java.dp.unboundedknapsack;

public class UnboundedKnapsack {
    public static void main(String[] args) {
        int profits[] = { 15, 50, 60, 90 };
        int weights[] = { 1, 3, 4, 5 };
        UnboundedKnapsack obj = new UnboundedKnapsack();
        System.out.println(obj.maxProfit(profits, weights, 8));
        System.out.println(obj.maxProfit(profits, weights, 6));
    }

    int maxProfit(int profits[], int weights[], int capacity) {
        if (profits.length == 0 || profits.length != weights.length || capacity <= 0)
            return -1;

        int n = weights.length;

        int dp[][] = new int[n][capacity + 1];
        for (int i = 0; i < n; i++) {
            dp[i][0] = 0;
        }

        for (int c = 1; c <= capacity; c++) {
            if (weights[0] <= c) {
                dp[0][c] = profits[0] + dp[0][c-weights[0]];
            }
        }

        for (int i = 1; i < n; i++) {
            for (int c = 1; c <= capacity; c++) {
                int profit1 = 0;
                int profit2 = 0;

                profit1 = dp[i - 1][c];
                if (c - weights[i] >= 0) {
                    profit2 = profits[i] + dp[i][c - weights[i]];
                }

                dp[i][c] = Math.max(profit1, profit2);
            }
        }

        return dp[n - 1][capacity];
    }
}

/*
our dp[][] array would be for above 2 cases respectively-

0 15 30 45 60 75 90 105 120
0 15 30 50 65 80 100 115 130
0 15 30 50 65 80 100 115 130
0 15 30 50 65 90 105 120 140

0 15 30 45 60 75 90
0 15 30 50 65 80 100
0 15 30 50 65 80 100
0 15 30 50 65 90 105

Given the weights and profits of ‘N’ items, we are asked to put these items in a knapsack that has a capacity ‘C’.
The goal is to get the maximum profit from the items in the knapsack.
The only difference between the 0/1 Knapsack problem and this problem is that we are allowed to use an unlimited quantity of an item.

Problem Statement-
Given two integer arrays to represent weights and profits of ‘N’ items, we need to find a subset of these items which will give us maximum profit such that their cumulative weight is not more than a given number ‘C’.
We can assume an infinite supply of item quantities; therefore, each item can be selected multiple times.

Bottom-up Dynamic Programming solution-
Let’s try to populate our dp[][] array from the above solution, working in a bottom-up fashion.
Essentially, what we want to achieve is: “Find the maximum profit for every sub-array and for every possible capacity”.

So for every possible capacity ‘c’ (0 <= c <= capacity), we have two options:

1- Exclude the item. In this case, we will take whatever profit we get from the sub-array excluding this item: dp[index-1][c]
2- Include the item if its weight is not more than the ‘c’. In this case, we include its profit plus whatever profit we get from the remaining capacity: profit[index] + dp[index][c-weight[index]]

Finally, we have to take the maximum of the above two values:
--------------------------------------------------------------------------------
dp[index][c] = max (dp[index-1][c], profit[index] + dp[index][c-weight[index]])
--------------------------------------------------------------------------------

The above solution has time and space complexity of O(N*C), where ‘N’ represents total items and ‘C’ is the maximum capacity.
 */
