package main.java.array;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 7, 8, 10 };
        BinarySearch obj = new BinarySearch();
        int x = obj.search(arr, 7);
        if (x == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + x);
        }
    }

    int search(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x)
                return mid;
            else if (arr[mid] > x)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;
    }
}

// https://www.geeksforgeeks.org/binary-search/
