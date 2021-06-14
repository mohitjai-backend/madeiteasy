package main.java.stackAndQueue;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        MinimumRemoveToMakeValidParentheses obj = new MinimumRemoveToMakeValidParentheses();
        System.out.println(obj.minimumRemoveToMakeValidParentheses(s));
    }

    String minimumRemoveToMakeValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                stack.push(i);
            else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    set.add(i);
                } else {
                    stack.pop();
                }
            }
        }

        while (!stack.isEmpty()) {
            set.add(stack.pop());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(i))
                sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}

// https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
