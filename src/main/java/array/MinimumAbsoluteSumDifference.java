package main.java.array;

import java.util.Arrays;

public class MinimumAbsoluteSumDifference {
    public static void main(String[] args) {

        int arr[] = { 4, 5, 7, 0, 1000, 10, 100, 1000, 10, 0, 0 };
        MinimumAbsoluteSumDifference obj = new MinimumAbsoluteSumDifference();

        int sum = obj.findSum(arr);
        System.out.println(sum);
    }

    int findSum(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                sum = sum + Math.abs(arr[0] - arr[1]);
            } else if (i == n - 1) {
                sum = sum + Math.abs(arr[n - 1] - arr[n - 2]);
            } else {
                sum = sum + Math.min(Math.abs(arr[i] - arr[i - 1]), Math.abs(arr[i] - arr[i + 1]));
            }
        }

        return sum;
    }
}

// https://www.geeksforgeeks.org/sum-minimum-absolute-difference-array-element/