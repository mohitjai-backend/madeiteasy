package main.java.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        int k = 4;

        KthLargestElement obj = new KthLargestElement();
        System.out.println(obj.kthLargestElement(arr, k));
    }

    int kthLargestElement(int arr[], int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(arr[i]);
        }

        while (k != 1) {
            k--;
            maxHeap.poll();
        }

        return maxHeap.peek();
    }
}

// https://leetcode.com/problems/kth-largest-element-in-an-array/
