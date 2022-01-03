package main.java.array;

public class MaximumLengthOfSubarrayWithPositiveProduct {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, -5, 6, -7 };
        MaximumLengthOfSubarrayWithPositiveProduct obj = new MaximumLengthOfSubarrayWithPositiveProduct();
        System.out.println(obj.maxLen(arr));
    }

    int maxLen(int arr[]) {
        int positiveLength = 0;
        int negativeLength = 0;

        int ans = 0;

        for (int x : arr) {
            if (x == 0) {
                positiveLength = 0;
                negativeLength = 0;
            } else if (x > 0) {
                positiveLength++;
                negativeLength = negativeLength == 0 ? 0 : negativeLength + 1;
            } else {
                int temp = positiveLength;
                positiveLength = negativeLength == 0 ? 0 : negativeLength + 1;
                negativeLength = temp + 1;
            }

            ans = Math.max(ans, positiveLength);
        }

        return ans;
    }
}

// https://leetcode.com/problems/maximum-length-of-subarray-with-positive-product/

/*
https://leetcode.com/problems/maximum-length-of-subarray-with-positive-product/discuss/820072/EASY-soultion-with-DRY-RUN-JAVA

Intuition
At every iteration, tracking maximum length of positive multiplicative result and negative multiplicative result can help.
Multiplicative Result : result(+ve/-ve) of multiplication of bunch of numbers(some of which can be +ve/-ve)

Algorithm

1- If we see a 0, we gotta start off things again
2- If we see a positive number :
    2.1. Increase length of positive mutilpicative result till now.
    2.2. Increase length of negative mutilpicative result till now, unless we had not encountered any negative before.
3- If we see a negative number:
    3.1. It's time to swap positive and negative multiplicative results' lengths and do similar task as we did in above case.

4- In each iteration, use the length of positive mutilpicative result to compute answer.

Dry Run

elements      :   1    2    3    4    -5    6    -7
positive_len  :   1    2    3    4     0    1     7
negative_len  :   0    0    0    0     5    6     2

 */
