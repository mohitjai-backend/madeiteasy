package main.java.array;

import java.util.HashSet;
import java.util.Set;

public class PairSumInArray {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 16;
        PairSumInArray obj = new PairSumInArray();
        obj.pairSumInArray(arr, sum);
    }

    void pairSumInArray(int arr[], int sum) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(sum - arr[i])) {
                System.out.println(arr[i] + " and " + (sum - arr[i]));
                break;
            } else {
                set.add(arr[i]);
            }
        }
    }
}

// https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/
