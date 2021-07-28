package main.java.array;

public class SearchElementInSortedPivoted {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        SearchElementInSortedPivoted obj = new SearchElementInSortedPivoted();
        int x = obj.search(arr, 3);
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

            else if (arr[mid] >= arr[low]) {
                if (x >= arr[low] && x <= arr[mid - 1]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (x >= arr[mid + 1] && x <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
