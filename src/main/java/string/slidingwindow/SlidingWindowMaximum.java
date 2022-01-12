package main.java.string.slidingwindow;

import java.util.LinkedList;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int nums[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;

        SlidingWindowMaximum obj = new SlidingWindowMaximum();
        int res[] = obj.slidingWindowMaximum(nums, k);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    int[] slidingWindowMaximum(int arr[], int k) {
        int res[] = new int[arr.length - k + 1];
        LinkedList<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!dq.isEmpty() && dq.peek() < (i - k + 1)) {
                dq.poll();
            }

            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.pollLast();
            }

            dq.add(i); // dq.offer(i) --> Adds the specified element as the tail (last element) of this list
            //dq.push(i) => Pushes an element onto the stack represented by this list.  In other words, inserts the element at the front of this list.

            if ((i - k + 1) >= 0) {
                res[i - k + 1] = arr[dq.peek()];
            }
        }

        return res;
    }
}

// https://leetcode.com/problems/sliding-window-maximum/
// https://leetcode.com/problems/sliding-window-maximum/discuss/65884/Java-O(n)-solution-using-deque-with-explanation
