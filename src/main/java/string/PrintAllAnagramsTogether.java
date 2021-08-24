package main.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintAllAnagramsTogether {
    public static void main(String[] args) {
        String words[] = { "cat", "dog", "tac", "god", "act", "anku" };
        PrintAllAnagramsTogether obj = new PrintAllAnagramsTogether();
        obj.printAllAnagramsTogether(words);
    }

    void printAllAnagramsTogether(String words[]) {
        Map<String, List<String>> hm = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String newWord = new String(charArray);
            if (hm.containsKey(newWord)) {
                hm.get(newWord).add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                hm.put(newWord, list);
            }
        }

        for (String s : hm.keySet()) {
            List<String> list = hm.get(s);
            for (String str : list) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}

// https://www.geeksforgeeks.org/given-a-sequence-of-words-print-all-anagrams-together/
// Let there be N words and each word has maximum M characters. Time complexity will be O(NMLogM)