package main.java.array;

import java.util.Stack;

public class AestroidCollision {
    public static void main(String[] args) {
        int arr[] = { 5, 10, -15 };
        AestroidCollision obj = new AestroidCollision();
        int res[] = obj.aestroidCollision(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }

    int[] aestroidCollision(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                stack.push(arr[i]);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(arr[i])) {
                    stack.pop();
                }

                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(arr[i]);
                } else if (arr[i] + stack.peek() == 0) {
                    stack.pop();
                }
            }
        }

        int res[] = new int[stack.size()];
        int i = stack.size() - 1;
        while (!stack.isEmpty()) {
            res[i] = stack.pop();
            i--;
        }
        return res;
    }
}

// https://leetcode.com/problems/asteroid-collision/