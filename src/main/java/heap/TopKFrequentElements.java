package main.java.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 5, 5 };
        int k = 3;

        TopKFrequentElements obj = new TopKFrequentElements();
        obj.printArray(arr);
        int res[] = obj.topKFrequentElements(arr, k);
        obj.printArray(res);
    }

    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    int[] topKFrequentElements(int arr[], int k) {
        if (arr.length == k)
            return arr;

        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((n1, n2) -> mp.get(n2) - mp.get(n1));
        for (Integer i : mp.keySet()) {
            maxHeap.add(i);
        }

        int res[] = new int[k];

        for (int i = 0; i < k; i++)
            res[i] = maxHeap.poll();

        return res;
    }
}

// https://leetcode.com/problems/top-k-frequent-elements/
