package main.java.dp.zerooneknapsack;

public class EqualSubsetSumPartition {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        EqualSubsetSumPartition obj = new EqualSubsetSumPartition();
        System.out.println(obj.isEqualSubsetSumPartition(nums));

        nums = new int[] { 1, 1, 3, 4, 7 };
        System.out.println(obj.isEqualSubsetSumPartition(nums));

        nums = new int[] { 2, 3, 4, 6 };
        System.out.println(obj.isEqualSubsetSumPartition(nums));

    }

    boolean isEqualSubsetSumPartition(int nums[]) {
        int total = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            total += nums[i];
        }

        if (total % 2 != 0)
            return false;

        int sum = total / 2;

        boolean dp[][] = new boolean[n][sum + 1];

        // we can always have '0' sum without including any element
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

        // with only one number, we can form a subset only when the required sum is equal to its value
        for (int s = 1; s <= sum; s++) {
            dp[0][s] = nums[0] == s ? true : false;
        }

        for (int i = 1; i < n; i++) {
            for (int s = 1; s <= sum; s++) {
                boolean t1 = false;
                boolean t2 = false;

                t1 = dp[i - 1][s];
                if (s - nums[i] >= 0) {
                    t2 = dp[i - 1][s - nums[i]];
                }

                dp[i][s] = (t1 || t2);
            }
        }

//        for (int i = 0; i < n; i++) {
//            for (int s = 0; s <= sum; s++) {
//                System.out.print(dp[i][s] + " ");
//            }
//            System.out.println();
//        }

        return dp[n - 1][sum];
    }
}

/*

true true false false false false
true true true true false false
true true true true true true
true true true true true true

Problem Statement-
Given a set of positive numbers, find if we can partition it into two subsets such that the sum of elements in both the subsets is equal.

Assume if S represents the total sum of all the given numbers, then the two equal subsets must have a sum equal to S/2.
This essentially transforms our problem to:
"Find a subset of the given numbers that has a total sum of S/2"


Bottom-up Dynamic Programming solution-
dp[i][s] will be ‘true’ if we can make sum ‘s’ from the first ‘i’ numbers.

So, for each number at index ‘i’ (0 <= i < num.length) and sum ‘s’ (0 <= s <= S/2), we have two options:

1- Exclude the number. In this case, we will see if we can get ‘s’ from the subset excluding this number: dp[i-1][s]
2- Include the number if its value is not more than ‘s’. In this case, we will see if we can find a subset to get the remaining sum: dp[i-1][s-num[i]]

If either of the two above scenarios is true, we can find a subset of numbers with a sum equal to ‘s’.

The above solution has time and space complexity of O(N*S), where ‘N’ represents total numbers and ‘S’ is the total sum of all the numbers.
 */
