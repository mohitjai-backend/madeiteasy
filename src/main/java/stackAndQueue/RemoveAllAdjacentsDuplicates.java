package main.java.stackAndQueue;

import java.util.Stack;

public class RemoveAllAdjacentsDuplicates {
    public static void main(String[] args) {
        RemoveAllAdjacentsDuplicates obj = new RemoveAllAdjacentsDuplicates();
        String s = "deeedbbcccbdaa";
        int k = 3;
        System.out.println(obj.removeAllAdjacentDuplicates(s, k));
    }

    String removeAllAdjacentDuplicates(String s, int k) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        stack.push(1);\
        for (int i = 0; i < sb.length(); i++) {
            if (i == 0 || sb.charAt(i) != sb.charAt(i - 1)) {
                stack.push(1);
            } else {
                int val = stack.pop() + 1;
                if (val == k) {
                    sb.delete(i - k + 1, i + 1);
                    i = i - k;
                } else {
                    stack.push(val);
                }
            }
        }

        return sb.toString();
    }
}

// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
