package main.java.heap;

public class HeapSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        HeapSort obj = new HeapSort();
        obj.printArray(arr);
        obj.heapSort(arr);
        obj.printArray(arr);
    }

    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void heapSort(int arr[]) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, arr.length, i);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            maxHeapify(arr, i, 0);
        }
    }

    void maxHeapify(int arr[], int n, int i) {
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        int largest = i;

        if (leftChild < n && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }
        if (rightChild < n && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr, n, largest);
        }
    }
}

// https://www.geeksforgeeks.org/heap-sort/
