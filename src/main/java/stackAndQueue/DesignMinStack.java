package main.java.stackAndQueue;

import java.util.Stack;

public class DesignMinStack {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(10);
        obj.push(20);
        obj.push(7);
        obj.push(15);
        obj.push(60);

        System.out.println(obj.getMin());
        System.out.println(obj.peek());
        obj.pop();
        System.out.println(obj.getMin());
        System.out.println(obj.peek());
    }
}

class MyStack {

    Stack<int[]> s = new Stack<>();

    void push(int x) {
        if (s.isEmpty()) {
            s.push(new int[] { x, x });
            return;
        }

        int minElement = Math.min(s.peek()[1], x);
        s.push(new int[] { x, minElement });
    }

    int peek() {
        return s.peek()[0];
    }

    void pop() {
        s.pop();
    }

    int getMin() {
        return s.peek()[1];
    }
}

// https://leetcode.com/problems/min-stack/

/*
Let n be the total number of operations performed.

Time Complexity : O(1) for all operations.

push(...): Checking the top of a Stack, comparing numbers, and pushing to the top of a Stack (or adding to the end of an Array or List) are all O(1) operations.
Therefore, this overall is an O(1) operation.

pop(...): Popping from a Stack (or removing from the end of an Array, or List) is an O(1)O(1) operation.

top(...): Looking at the top of a Stack is an O(1) operation.

getMin(...): Same as above. This operation is O(1) because we do not need to compare values to find it. If we had not kept track of it on the Stack, and instead had to search for it each time, the overall time complexity would have been O(n).

Space Complexity : O(n).

Worst case is that all the operations are push. In this case, there will be O(2*n) = O(n) space used.
 */
