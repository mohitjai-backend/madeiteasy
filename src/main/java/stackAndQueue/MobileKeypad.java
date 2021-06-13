package main.java.stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class MobileKeypad {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4 };
        MobileKeypad obj = new MobileKeypad();
        obj.printAllCombinations(arr);
    }

    void printAllCombinations(int arr[]) {
        String keys[] = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        Queue<String> q = new LinkedList<>();
        q.add("");

        while (!q.isEmpty()) {
            String s = q.poll();

            if (s.length() == arr.length) {
                System.out.print(s + " ");
            } else {
                String val = keys[arr[s.length()]];
                for (int i = 0; i < val.length(); i++) {
                    String val1 = "";
                    val1 = s + val.charAt(i);
                    q.add(val1);
                }
            }
        }
    }
}

// https://www.geeksforgeeks.org/iterative-letter-combinations-of-a-phone-number/