package main.java.string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MobileKeypadLetterCombinations {
    public static void main(String[] args) {
        int num[] = { 2, 3 };
        MobileKeypadLetterCombinations obj = new MobileKeypadLetterCombinations();
        List<String> result = new ArrayList<>();
        obj.letterCombinations(num, num.length, result);
        for (String s : result) {
            System.out.print(s + " ");
        }
    }

    void letterCombinations(int num[], int n, List<String> result) {
        String table[] = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        letterCombinationsUtil(num, n, result, table);
    }

    void letterCombinationsUtil(int num[], int n, List<String> result, String[] table) {
        Queue<String> q = new LinkedList<>();
        q.add("");

        while (!q.isEmpty()) {
            String s = q.remove();

            if (s.length() == n) {
                result.add(s);
            } else {
                String val = table[num[s.length()]];
                for (int i = 0; i < val.length(); i++) {
                    q.add(s + val.charAt(i));
                }
            }
        }
    }
}

// https://www.geeksforgeeks.org/iterative-letter-combinations-of-a-phone-number/
