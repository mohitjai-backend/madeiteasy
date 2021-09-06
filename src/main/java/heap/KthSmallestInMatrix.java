package main.java.heap;

import java.util.PriorityQueue;

public class KthSmallestInMatrix {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 5, 9 },
                { 10, 11, 13 },
                { 12, 13, 15 }
        };

        int k = 8;

        KthSmallestInMatrix obj = new KthSmallestInMatrix();
        System.out.println(obj.kthSmallestInMatrxi(matrix, k));
    }

    int kthSmallestInMatrxi(int arr[][], int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                minHeap.add(arr[i][j]);
            }
        }

        while (k != 1) {
            k--;
            minHeap.poll();
        }

        return minHeap.peek();
    }
}

// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
