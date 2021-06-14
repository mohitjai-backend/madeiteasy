package main.java.stackAndQueue;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses obj = new ValidParentheses();
        String s = "(){}[]";
        boolean valid = obj.validParentheses(s);
        System.out.println(valid);
    }

    boolean validParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty())
                    return false;
                Character ch = stack.pop();
                if (s.charAt(i) == ')') {
                    if (ch == '{' || ch == '[')
                        return false;
                }
                if (s.charAt(i) == '}') {
                    if (ch == '(' || ch == '[')
                        return false;
                }
                if (s.charAt(i) == ']') {
                    if (ch == '(' || ch == '{')
                        return false;
                }
            }
        }

        return stack.isEmpty() ? true : false;
    }
}

// https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
