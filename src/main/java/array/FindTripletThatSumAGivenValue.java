package main.java.array;

import java.util.Arrays;

public class FindTripletThatSumAGivenValue {
    public static void main(String[] args) {
        int arr[] = { 12, 3, 4, 1, 6, 9 };
        int sum = 24;
        FindTripletThatSumAGivenValue obj = new FindTripletThatSumAGivenValue();
        obj.findTriplet(arr, sum);
    }

    void findTriplet(int arr[], int sum) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int low = i + 1;
            int high = arr.length - 1;

            while (low < high) {
                if (arr[i] + arr[low] + arr[high] == sum) {
                    System.out.println("Triplet is : " + arr[i] + ", " + arr[low] + ", " + arr[high]);
                    return;
                } else if (arr[i] + arr[low] + arr[high] < sum) {
                    low++;
                } else {
                    high--;
                }
            }
        }
    }
}

// https://www.geeksforgeeks.org/find-a-triplet-that-sum-to-a-given-value/
