package main.java.dp.unboundedknapsack;

public class CoinChange {
    public static void main(String[] args) {
        int denominations[] = { 1, 2, 3 };
        int totalAmount = 5;

        CoinChange obj = new CoinChange();
        System.out.println(obj.numberOfWays(denominations, totalAmount));
    }

    int numberOfWays(int denominations[], int totalAmount) {
        int n = denominations.length;
        int dp[][] = new int[n][totalAmount + 1];

        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }

        for (int c = 1; c <= totalAmount; c++) {
            if(denominations[0] <= c) {
                dp[0][c] = dp[0][c-denominations[0]];
            }
        }

        for (int i = 1; i < n; i++) {
            for (int c = 1; c <= totalAmount; c++) {
                int profit1 = 0;
                int profit2 = 0;

                profit1 = dp[i - 1][c];

                if (c - denominations[i] >= 0) {
                    profit2 = dp[i][c - denominations[i]];
                }

                dp[i][c] = profit1 + profit2;
            }
        }

//        for(int i=0;i<n;i++) {
//            for(int c=0;c<=totalAmount;c++) {
//                System.out.print(dp[i][c]+" ");
//            }
//            System.out.println();
//        }

        return dp[n - 1][totalAmount];
    }
}

/*
Our dp[][] array would be -

1 1 1 1 1 1
1 1 2 2 3 3
1 1 2 3 4 5

Introduction-
Given an infinite supply of ‘n’ coin denominations and a total money amount,
we are asked to find the total number of distinct ways to make up that amount.

Example:-

Denominations: {1,2,3}
Total amount: 5
Output: 5
Explanation: There are five ways to make the change for '5', here are those ways:
  1. {1,1,1,1,1}
  2. {1,1,1,2}
  3. {1,2,2}
  4. {1,1,3}
  5. {2,3}


Problem Statement-
Given a number array to represent different coin denominations and a total amount ‘T’,
we need to find all the different ways to make a change for ‘T’ with the given coin denominations.
We can assume an infinite supply of coins, therefore, each coin can be chosen multiple times.

Bottom-up Dynamic Programming solution-
We will try to find if we can make all possible sums, with every combination of coins, to populate the array dp[TotalDenominations][Total+1].

So for every possible total ‘t’ (0<= t <= Total) and for every possible coin index (0 <= index < denominations.length), we have two options:

1- Exclude the coin. Count all the coin combinations without the given coin up to the total ‘t’ => dp[index-1][t]
2- Include the coin if its value is not more than ‘t’. In this case, we will count all the coin combinations to get the remaining total: dp[index][t-denominations[index]]

Finally, to find the total combinations, we will add both the above two values:
-------------------------------------------------------------------
dp[index][t] = dp[index-1][t] + dp[index][t-denominations[index]]
-------------------------------------------------------------------
 */
