package main.java.array;

import java.util.Arrays;

public class MinDiffBetweenLargestAndSmallestInThreeMoves {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 6, 13, 14, 15, 16, 17 };
        MinDiffBetweenLargestAndSmallestInThreeMoves obj = new MinDiffBetweenLargestAndSmallestInThreeMoves();
        System.out.println(obj.minDiff(arr));
    }

    int minDiff(int arr[]) {
        int n = arr.length;
        if (n < 5)
            return 0;

        Arrays.sort(arr);

        return Math.min(arr[n - 4] - arr[0], Math.min(arr[n - 3] - arr[1], Math.min(arr[n - 2] - arr[2], arr[n - 1] - arr[3])));
    }
}

// https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/
// https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/discuss/730567/JavaC%2B%2BPython-Straight-Forward
