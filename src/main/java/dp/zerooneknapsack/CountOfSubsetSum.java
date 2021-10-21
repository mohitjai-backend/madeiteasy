package main.java.dp.zerooneknapsack;

public class CountOfSubsetSum {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3 };
        CountOfSubsetSum obj = new CountOfSubsetSum();
        System.out.println(obj.countOfSubsetSum(nums, 4));

        nums = new int[] { 1, 2, 7, 1, 5 };
        System.out.println(obj.countOfSubsetSum(nums, 9));
    }

    int countOfSubsetSum(int nums[], int sum) {
        int n = nums.length;
        int dp[][] = new int[n][sum + 1];

        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }

        for (int s = 1; s <= sum; s++) {
            dp[0][s] = nums[0] == s ? 1 : 0;
        }

        for (int i = 1; i < n; i++) {
            for (int s = 1; s <= sum; s++) {
                int sum1 = 0;
                int sum2 = 0;

                sum1 = dp[i - 1][s];

                if (s - nums[i] >= 0) {
                    sum2 = dp[i - 1][s - nums[i]];
                }

                dp[i][s] = sum1 + sum2;
            }
        }

        return dp[n - 1][sum];
    }
}

/*
Problem Statement-
Given a set of positive numbers, find the total number of subsets whose sum is equal to a given number ‘S’.

Example1-
Input: {1, 1, 2, 3}, S=4
Output: 3
The given set has '3' subsets whose sum is '4': {1, 1, 2}, {1, 3}, {1, 3}
Note that we have two similar sets {1, 3}, because we have two '1' in our input.

Example2-
Input: {1, 2, 7, 1, 5}, S=9
Output: 3
The given set has '3' subsets whose sum is '9': {2, 7}, {1, 7, 1}, {1, 2, 1, 5}

Bottom-up Dynamic Programming solution-
We will try to find if we can make all possible sums with every subset to populate the array db[TotalNumbers][S+1].
So, at every step we have two options:

1- Exclude the number. Count all the subsets without the given number up to the given sum => dp[index-1][sum]
2- Include the number if its value is not more than the ‘sum’. In this case, we will count all the subsets to get the remaining sum => dp[index-1][sum-num[index]]

To find the total sets, we will add both of the above two values:
-----------------------------------------------------------------
dp[index][sum] = dp[index-1][sum] + dp[index-1][sum-num[index]])
----------------------------------------------------------------
*/
