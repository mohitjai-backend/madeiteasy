package main.java.array;

public class FindMinLengthUnsortedArrayToMakeCompleteArraySorted {
    public static void main(String[] args) {
        FindMinLengthUnsortedArrayToMakeCompleteArraySorted obj = new FindMinLengthUnsortedArrayToMakeCompleteArraySorted();
        int arr[] = { 10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60 };
        System.out.println(obj.findMinLength(arr));
    }

    int findMinLength(int arr[]) {
        int start = -1;
        int end = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                start = i - 1;
                break;
            }
        }

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                end = i;
                break;
            }
        }

        if (start == -1 || end == -1)
            return 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = start; i <= end; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        for (int i = 0; i <= start - 1; i++) {
            if (arr[i] > min) {
                start = i;
                break;
            }
        }

        for (int i = arr.length - 1; i >= end + 1; i--) {
            if (arr[i] < max) {
                end = i;
                break;
            }
        }

        return end - start + 1;
    }
}

//https://www.geeksforgeeks.org/minimum-length-unsorted-subarray-sorting-which-makes-the-complete-array-sorted/
/*
Solution:
1) Find the candidate unsorted subarray

a) Scan from left to right and find the first element which is greater than the next element.
Let s be the index of such an element. In the above example 1, s is 3 (index of 30).
b) Scan from right to left and find the first element (first in right to left order) which is smaller than the next element (next in right to left order).
Let e be the index of such an element. In the above example 1, e is 7 (index of 31).

2) Check whether sorting the candidate unsorted subarray makes the complete array sorted or not. If not, then include more elements in the subarray.

a) Find the minimum and maximum values in arr[s..e]. Let minimum and maximum values be min and max. min and max for [30, 25, 40, 32, 31] are 25 and 40 respectively.
b) Find the first element (if there is any) in arr[0..s-1] which is greater than min, change s to index of this element. There is no such element in above example 1.
c) Find the last element (if there is any) in arr[e+1..n-1] which is smaller than max, change e to index of this element. In the above example 1, e is changed to 8 (index of 35).

3) Print s and e.
*/