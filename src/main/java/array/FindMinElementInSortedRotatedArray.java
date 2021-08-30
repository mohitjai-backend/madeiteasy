package main.java.array;

public class FindMinElementInSortedRotatedArray {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 1, 2, 3, 4 };
        FindMinElementInSortedRotatedArray obj = new FindMinElementInSortedRotatedArray();
        System.out.println(obj.minElementInSortedRotatedArray(arr, 0, arr.length - 1));
    }

    int minElementInSortedRotatedArray(int arr[], int low, int high) {

        while (low <= high) {
            if (low == high) // terminating condition
                return arr[low];
            int mid = low + (high - low) / 2;
            if (arr[mid] == arr[high]) {
                high--; // duplicate values case
            } else if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return -1;
    }
}

// https://www.geeksforgeeks.org/find-minimum-element-in-a-sorted-and-rotated-array/
