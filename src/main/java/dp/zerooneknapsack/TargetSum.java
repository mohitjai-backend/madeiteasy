package main.java.dp.zerooneknapsack;

public class TargetSum {
    public static void main(String[] args) {
        TargetSum obj = new TargetSum();
        int[] nums = { 1, 1, 2, 3 };
        System.out.println(obj.targetSum(nums, 1));

        nums = new int[] { 1, 2, 7, 1 };
        System.out.println(obj.targetSum(nums, 9));
    }

    int targetSum(int nums[], int targetSum) {
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        if (totalSum < targetSum || (targetSum + totalSum) % 2 == 1)
            return -1;

        int sum = (targetSum + totalSum) / 2; // imp
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
Given a set of positive numbers (non zero) and a target sum ‘S’. Each number should be assigned either a ‘+’ or ‘-’ sign. We need to find out total ways to assign symbols to make the sum of numbers equal to target ‘S’.

Example 1:-

Input: {1, 1, 2, 3}, S=1
Output: 3
Explanation: The given set has '3' ways to make a sum of '1': {+1-1-2+3} & {-1+1-2+3} & {+1+1+2-3}

Example 2:-

Input: {1, 2, 7, 1}, S=9
Output: 2
Explanation: The given set has '2' ways to make a sum of '9': {+1+2+7-1} & {-1+2+7+1}

This problem follows the 0/1 Knapsack pattern and can be converted into Count of Subset Sum. Let’s dig into this.

We are asked to find two subsets of the given numbers whose difference is equal to the given target ‘S’. Take the first example above.
As we saw, one solution is {+1-1-2+3}.
So, the two subsets we are asked to find are {1, 3} & {1, 2} because,

-----------------------
(1 + 3) - (1 + 2 ) = 1
-----------------------

Now, let’s say ‘Sum(s1)’ denotes the total sum of set ‘s1’, and ‘Sum(s2)’ denotes the total sum of set ‘s2’. So the required equation is:
-----------------------
Sum(s1) - Sum(s2) = S
-----------------------

This equation can be reduced to the subset sum problem. Let’s assume that ‘Sum(num)’ denotes the total sum of all the numbers, therefore:
-----------------------------
Sum(s1) + Sum(s2) = Sum(num)
-----------------------------

Let’s add the above two equations:
-------------------------------------------------------
=> Sum(s1) - Sum(s2) + Sum(s1) + Sum(s2) = S + Sum(num)
=> 2 * Sum(s1) =  S + Sum(num)
=> Sum(s1) = (S + Sum(num)) / 2
-----------------------------------------------------

This essentially converts our problem to: “Find count of subsets of the given numbers whose sum is equal to”
-----------------------
=> (S + Sum(num)) / 2
-----------------------
 */
