package main.java.dp.unboundedknapsack;

public class MinimumCoinChange {
    public static void main(String[] args) {
        int denominations[] = { 1, 2, 3 };
        MinimumCoinChange obj = new MinimumCoinChange();
        System.out.println(obj.minCoinChange(denominations, 5));
        System.out.println(obj.minCoinChange(denominations, 11));
        System.out.println(obj.minCoinChange(denominations, 7));
    }

    int minCoinChange(int denominations[], int totalAmount) {
        int n = denominations.length;
        int dp[][] = new int[n][totalAmount + 1];

        for (int i = 0; i < n; i++) {
            dp[i][0] = 0;
        }

        for (int c = 1; c <= totalAmount; c++) {
            if (denominations[0] <= c) {
                dp[0][c] = dp[0][c - denominations[0]] + 1;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int c = 1; c <= totalAmount; c++) {
                int profit1 = Integer.MAX_VALUE;
                int profit2 = Integer.MAX_VALUE;

                profit1 = dp[i - 1][c];
                if (c - denominations[i] >= 0) {
                    profit2 = dp[i][c - denominations[i]] + 1;
                }

                dp[i][c] = Math.min(profit1, profit2);
            }
        }

//        for (int i = 0; i < n; i++) {
//            for (int c = 0; c <= totalAmount; c++) {
//                System.out.print(dp[i][c] + " ");
//            }
//            System.out.println();
//        }

        return dp[n - 1][totalAmount];
    }
}
/*
Our dp[][] would be -
0 1 2 3 4 5
0 1 1 2 2 3
0 1 1 1 2 2

0 1 2 3 4 5 6 7 8 9 10 11
0 1 1 2 2 3 3 4 4 5 5 6
0 1 1 1 2 2 2 3 3 3 4 4

0 1 2 3 4 5 6 7
0 1 1 2 2 3 3 4
0 1 1 1 2 2 2 3

Introduction -
Given an infinite supply of ‘n’ coin denominations and a total money amount,
we are asked to find the minimum number of coins needed to make up that amount.

Example 1:-
Denominations: {1,2,3}
Total amount: 5
Output: 2
Explanation: We need a minimum of two coins {2,3} to make a total of '5'

Example 2:-
Denominations: {1,2,3}
Total amount: 11
Output: 4
Explanation: We need a minimum of four coins {2,3,3,3} to make a total of '11'

Problem Statement-
Given a number array to represent different coin denominations and a total amount ‘T’,
we need to find the minimum number of coins needed to make a change for ‘T’.
We can assume an infinite supply of coins, therefore, each coin can be chosen multiple times.

Bottom-up Dynamic Programming solution-
Let’s try to populate our array dp[TotalDenominations][Total+1] for every possible total with a minimum number of coins needed.

So for every possible total ‘t’ (0<= t <= Total) and for every possible coin index (0 <= index < denominations.length), we have two options:

1- Exclude the coin: In this case, we will take the minimum coin count from the previous set => dp[index-1][t]
2- Include the coin if its value is not more than ‘t’: In this case, we will take the minimum count needed to get the remaining total, plus include ‘1’ for the current coin => dp[index][t-denominations[index]] + 1

Finally, we will take the minimum of the above two values for our solution:
--------------------------------------------------------------------------
dp[index][t] = min(dp[index-1][t], dp[index][t-denominations[index]] + 1)
--------------------------------------------------------------------------

The above solution has time and space complexity of O(C*T), where ‘C’ represents total coin denominations and ‘T’ is the total amount that we want to make change.
 */
