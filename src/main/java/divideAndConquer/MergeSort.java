package main.java.divideAndConquer;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 5, 2, 7, 6, 8 };
        MergeSort obj = new MergeSort();
        obj.printArray(arr, 0, arr.length - 1);
        obj.mergeSort(arr, 0, arr.length - 1);
        obj.printArray(arr, 0, arr.length - 1);
    }

    void mergeSort(int arr[], int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            sortedMerge(arr, low, mid, high);
        }
    }

    void sortedMerge(int arr[], int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int L1[] = new int[n1];
        int L2[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L1[i] = arr[low + i];
        }

        for (int i = 0; i < n2; i++) {
            L2[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {
            if (L1[i] <= L2[j]) {
                arr[k++] = L1[i++];
            } else {
                arr[k++] = L2[j++];
            }
        }

        while (i < n1) {
            arr[k++] = L1[i++];
        }

        while (j < n2) {
            arr[k++] = L2[j++];
        }
    }

    void printArray(int arr[], int low, int high) {
        for (int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// https://www.geeksforgeeks.org/merge-sort/
// https://www.geeksforgeeks.org/merge-two-sorted-arrays/ (Do it yourself)
