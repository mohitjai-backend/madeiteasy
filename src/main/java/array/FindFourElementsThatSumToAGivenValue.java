package main.java.array;

import java.util.HashMap;
import java.util.Map;

public class FindFourElementsThatSumToAGivenValue {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 1, 2 };
        int sum = 91;

        FindFourElementsThatSumToAGivenValue obj = new FindFourElementsThatSumToAGivenValue();
        obj.printFourValues(arr, sum);
    }

    void printFourValues(int arr[], int x) {
        Map<Integer, MyPair> hm = new HashMap<>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                hm.put(arr[i] + arr[j], new MyPair(i, j));
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];

                if (hm.containsKey(x - sum)) {
                    MyPair myPair = hm.get(x - sum);
                    if (myPair.first != i && myPair.second != i && myPair.first != j && myPair.second != j) {
                        System.out.println(arr[i] + ", " + arr[j] + ", " + arr[myPair.first] + ", " + arr[myPair.second]);
                        return;
                    }
                }
            }
        }
    }
}

class MyPair {
    int first;
    int second;

    public MyPair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

// https://www.geeksforgeeks.org/find-four-elements-that-sum-to-a-given-value-set-2/