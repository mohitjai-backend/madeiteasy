package main.java.string.slidingwindow;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
        int k = 3;

        MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
        System.out.println(obj.maxConsecutiveOne(arr, k));
    }

    int maxConsecutiveOne(int arr[], int k) {
        int left = 0;
        int right = 0;

        for (right = 0; right < arr.length; right++) {
            if (arr[right] == 0) {
                k--;
            }

            if (k < 0) {
                k = k + (1 - arr[left]);
                left++;
            }
        }

        return right - left;
    }
}

// https://leetcode.com/problems/max-consecutive-ones-iii/
