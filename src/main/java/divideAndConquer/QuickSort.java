package main.java.divideAndConquer;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 10, 7, 8, 9, 1, 5 };
        QuickSort obj = new QuickSort();
        obj.printArray(arr);
        obj.quickSort(arr);
        obj.printArray(arr);
    }

    void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void quickSort(int arr[]) {
        int low = 0;
        int high = arr.length - 1;

        quickSortUtil(arr, low, high);
    }

    void quickSortUtil(int arr[], int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);

            quickSortUtil(arr, low, partition - 1);
            quickSortUtil(arr, partition + 1, high);
        }
    }

    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

// https://www.geeksforgeeks.org/quick-sort/

/*
Analysis of QuickSort-
Time taken by QuickSort, in general, can be written as following.

 T(n) = T(k) + T(n-k-1) + O(n)

The first two terms are for two recursive calls, the last term is for the partition process. k is the number of elements which are smaller than pivot.
The time taken by QuickSort depends upon the input array and partition strategy. Following are three cases.

Worst Case: The worst case occurs when the partition process always picks greatest or smallest element as pivot.
If we consider above partition strategy where last element is always picked as pivot, the worst case would occur when the array is already sorted in increasing or decreasing order.
Following is recurrence for worst case.

 T(n) = T(0) + T(n-1) + O(n)
which is equivalent to
T(n) = T(n-1) + O(n)
The solution of above recurrence is  O(n2).

Best Case: The best case occurs when the partition process always picks the middle element as pivot.
Following is recurrence for best case.

T(n) = 2T(n/2) + O(n)
The solution of above recurrence is O(nLogn).

Average Case:
To do average case analysis, we need to consider all possible permutation of array and calculate time taken by every permutation which doesn’t look easy.
We can get an idea of average case by considering the case when partition puts O(n/9) elements in one set and O(9n/10) elements in other set.
Following is recurrence for this case.

T(n) = T(n/9) + T(9n/10) + O(n)
Solution of above recurrence is also O(nLogn)
 */
