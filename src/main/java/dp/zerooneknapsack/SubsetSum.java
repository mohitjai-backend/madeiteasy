package main.java.dp.zerooneknapsack;

public class SubsetSum {
    public static void main(String[] args) {

        int nums[] = { 1, 2, 3, 7 };
        SubsetSum obj = new SubsetSum();
        System.out.println(obj.isSubsetSum(nums, 6));

        nums = new int[] { 1, 2, 7, 1, 5 };
        System.out.println(obj.isSubsetSum(nums, 10));

        nums = new int[] { 1, 3, 4, 8 };
        System.out.println(obj.isSubsetSum(nums, 6));
    }

    boolean isSubsetSum(int nums[], int sum) {
        int n = nums.length;
        boolean dp[][] = new boolean[n][sum + 1];

        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

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

        return dp[n - 1][sum];
    }
}