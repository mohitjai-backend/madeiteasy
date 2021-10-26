package main.java.dp.unboundedknapsack;

public class RodCutting {
    public static void main(String[] args) {
        int rodLength[] = { 1, 2, 3, 4, 5 };
        int prices[] = { 2, 6, 7, 10, 13 };
        int maxRodLength = 5;

        RodCutting obj = new RodCutting();

        System.out.println(obj.maxProfit(rodLength, prices, maxRodLength));
    }

    int maxProfit(int rodLength[], int prices[], int maxRodLength) {
        if (rodLength.length == 0 || prices.length != rodLength.length || maxRodLength <= 0)
            return -1;

        int n = rodLength.length;

        int dp[][] = new int[n][maxRodLength + 1];

        for (int i = 0; i < n; i++) {
            dp[i][0] = 0;
        }

        for (int c = 1; c <= maxRodLength; c++) {
            if (rodLength[0] <= c) {
                dp[0][c] = prices[0] + dp[0][c-rodLength[0]];
            }
        }

        for (int i = 1; i < n; i++) {
            for (int c = 1; c <= maxRodLength; c++) {
                int profit1 = 0;
                int profit2 = 0;

                profit1 = dp[i - 1][c];
                if (c - rodLength[i] >= 0) {
                    profit2 = prices[i] + dp[i][c - rodLength[i]];
                }

                dp[i][c] = Math.max(profit1, profit2);
            }
        }

//                for(int i=0;i<n;i++) {
//                    for(int c=0;c<=maxRodLength;c++) {
//                        System.out.print(dp[i][c]+" ");
//                    }
//                    System.out.println();
//                }

        return dp[n - 1][maxRodLength];
    }
}

/*
Our dp[][] array would be -
0 2 4 6 8 10
0 2 6 8 12 14
0 2 6 8 12 14
0 2 6 8 12 14
0 2 6 8 12 14

Problem Statement-
Given a rod of length ‘n’, we are asked to cut the rod and sell the pieces in a way that will maximize the profit.
We are also given the price of every piece of length ‘i’ where ‘1 <= i <= n’.

Example:

Lengths: [1, 2, 3, 4, 5]
Prices: [2, 6, 7, 10, 13]
Rod Length: 5

Let’s try different combinations of cutting the rod:

Five pieces of length 1 => 10 price
Two pieces of length 2 and one piece of length 1 => 14 price
One piece of length 3 and two pieces of length 1 => 11 price
One piece of length 3 and one piece of length 2 => 13 price
One piece of length 4 and one piece of length 1 => 12 price
One piece of length 5 => 13 price

This shows that we get the maximum price (14) by cutting the rod into two pieces of length ‘2’ and one piece of length ‘1’.

Bottom-up Dynamic Programming solution-

Let’s try to populate our dp[][] array in a bottom-up fashion.
Essentially, what we want to achieve is: “Find the maximum sales price for every rod length and for every possible sales price”.

So for every possible rod length ‘len’ (0<= len <= n), we have two options:

1- Exclude the piece. In this case, we will take whatever price we get from the rod length excluding this piece => dp[index-1][len]
2- Include the piece if its length is not more than ‘len’. In this case, we include its price plus whatever price we get from the remaining rod length => prices[index] + dp[index][len-lengths[index]]

Finally, we have to take the maximum of the above two values:
----------------------------------------------------------------------------------------
dp[index][len] = max (dp[index-1][len], prices[index] + dp[index][len-lengths[index]])
----------------------------------------------------------------------------------------
 */
