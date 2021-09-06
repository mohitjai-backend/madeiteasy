package main.java.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentWords {
    public static void main(String[] args) {
        String words[] = { "i", "love", "leetcode", "i", "love", "coding" };
        int k = 2;
        TopKFrequentWords obj = new TopKFrequentWords();
        obj.printArray(words);
        String res[] = obj.topKFrequentWords(words, k);
        obj.printArray(res);
    }

    void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    String[] topKFrequentWords(String words[], int k) {
        if (k == words.length) {
            return words;
        }

        Map<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (mp.containsKey(words[i])) {
                mp.put(words[i], mp.get(words[i]) + 1);
            } else {
                mp.put(words[i], 1);
            }
        }

        PriorityQueue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>(
                (n1, n2) -> n1.getValue() == n2.getValue() ? n1.getKey().compareTo(n2.getKey()) : n2.getValue() - n1.getValue());

        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            maxHeap.add(entry);
        }

        String res[] = new String[k];
        for (int i = 0; i < k; i++) {
            res[i] = maxHeap.poll().getKey();
        }

        return res;
    }
}

// https://leetcode.com/problems/top-k-frequent-words/
