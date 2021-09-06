package main.java.heap;

public class MaxHeapExample {
    public static void main(String[] args) {
        MaxHeapExample obj = new MaxHeapExample();

        int arr[] = { 5, 3, 13, 10, 99, 19, 6, 51, 9 };
        System.out.println("Initial Array:-");
        obj.printArray(arr);

        int maxHeapArray[] = obj.buildHeap(arr);
        System.out.println("MaxHeap Array:-");
        obj.printArray(maxHeapArray);

        System.out.println("Maximum Element is: " + obj.maxElement(maxHeapArray));

        int maxHeapArrayAfterRemoving[] = obj.removeElementAtIndex(maxHeapArray, 0);
        System.out.println("MaxHeap Array after removing 0th index element:-");
        obj.printArray(maxHeapArrayAfterRemoving);

        System.out.println("Maximum Element after removing 0th index element:- " + obj.maxElement(maxHeapArrayAfterRemoving));
    }

    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    int[] removeElementAtIndex(int arr[], int i) {

        int temp = arr[i];
        arr[i] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        int maxHeapArrayAfterRemoving[] = new int[arr.length - 1];
        for (int j = 0; j < arr.length - 1; j++) {
            maxHeapArrayAfterRemoving[j] = arr[j];
        }
        for (int k = maxHeapArrayAfterRemoving.length / 2 - 1; k >= 0; k--) {
            maxHeapArrayAfterRemoving = maxHeapify(k, maxHeapArrayAfterRemoving);
        }
        return maxHeapArrayAfterRemoving;
    }

    int maxElement(int maxHeapArray[]) {
        return maxHeapArray[0];
    }

    int[] buildHeap(int arr[]) {

        int maxHeapArray[] = new int[arr.length];
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            maxHeapArray = maxHeapify(i, arr);
        }
        return maxHeapArray;
    }

    int[] maxHeapify(int i, int arr[]) {
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        int largest = i;

        if (leftChild < arr.length && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }
        if (rightChild < arr.length && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            arr = maxHeapify(largest, arr);
        }
        return arr;
    }
}

// https://codegym.cc/groups/posts/max-heap-in-java  -- code
// https://www.programiz.com/dsa/heap-data-structure -- understanding

/*
Time complexity -

heapify() - O(log(n))
BuildHeap() - O(n)
Complexity of insert operation is O(log N).
Complexity of delete operation is O(log N).
Complexity of getting minimum value is: O(1) (MinHeap)

https://www.geeksforgeeks.org/time-complexity-of-building-a-heap/
https://www.geeksforgeeks.org/complexity-analysis-of-various-operations-of-binary-min-heap/
 */

