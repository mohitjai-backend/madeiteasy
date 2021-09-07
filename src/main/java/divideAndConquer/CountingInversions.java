package main.java.divideAndConquer;

public class CountingInversions {
    public static void main(String[] args) {
        int arr[] = { 1, 20, 6, 4, 5 };
        CountingInversions obj = new CountingInversions();
        System.out.println(obj.countInversions(arr, 0, arr.length - 1));
    }

    int countInversions(int arr[], int low, int high) {
        int count = 0;
        if (low < high) {
            int mid = low + (high - low) / 2;
            count = count + countInversions(arr, low, mid);
            count = count + countInversions(arr, mid + 1, high);
            count = count + merge(arr, low, mid, high);
        }

        return count;
    }

    int merge(int arr[], int low, int mid, int high) {
        int left[] = new int[mid - low + 1];
        int right[] = new int[high - mid];

        for (int i = 0; i < mid - low + 1; i++) {
            left[i] = arr[low + i];
        }

        for (int i = 0; i < high - mid; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = low;

        int count = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                count = count + (mid + 1) - (low + i);
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }

        return count;
    }
}

// https://www.geeksforgeeks.org/counting-inversions/
