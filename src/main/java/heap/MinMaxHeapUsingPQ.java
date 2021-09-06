package main.java.heap;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MinMaxHeapUsingPQ {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 13, 10, 99, 19, 6, 51, 9 };
        MinMaxHeapUsingPQ obj = new MinMaxHeapUsingPQ();
        obj.printArray(arr);
        obj.minHeap(arr);
        System.out.println("----------------*******************----------------");
        obj.maxHeap(arr);
    }

    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    void minHeap(int arr[]) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            minHeap.add(arr[i]);
        }

        Iterator it = minHeap.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        System.out.println("Min element: " + minHeap.peek());

        System.out.println("After removing element:-");
        minHeap.poll();
        it = minHeap.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();
    }

    void maxHeap(int arr[]) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(arr[i]);
        }

        Iterator it = maxHeap.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        System.out.println("Max element: " + maxHeap.peek());

        System.out.println("After removing element:-");
        maxHeap.poll();
        it = maxHeap.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

    }
}
