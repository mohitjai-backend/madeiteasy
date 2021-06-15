package main.java.stackAndQueue;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = { 11, 13, 21, 3 };
        NextGreaterElement obj = new NextGreaterElement();
        obj.nextGreaterElement(arr);
    }

    void nextGreaterElement(int arr[]) {
        int nge[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!s.isEmpty()) {
                while (!s.isEmpty() && s.peek() <= arr[i]) {
                    s.pop();
                }
            }

            nge[i] = s.isEmpty() ? -1 : s.peek();
            s.push(arr[i]);
        }

        for (int i = 0; i < nge.length; i++)
            System.out.println(arr[i] + " --> " + nge[i]);
    }
}

// https://www.geeksforgeeks.org/next-greater-element/
