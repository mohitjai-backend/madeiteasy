package main.java.stack;

import java.util.Stack;

public class CelebrityProblem {

    static int matrix[][] = {
            { 0, 0, 1, 0 },
            { 0, 0, 1, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 1, 0 }
    };

    public static void main(String[] args) {

        CelebrityProblem obj = new CelebrityProblem();

        int persons = 4;
        int celebrity = obj.findCelebrity(persons);

        if (celebrity == -1) {
            System.out.println("No celebrity found");
        } else {
            System.out.println("Celebrity id is: " + celebrity);
        }
    }

    boolean knows(int a, int b) {
        return matrix[a][b] == 1 ? true : false;
    }

    int findCelebrity(int persons) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < persons; i++) {
            stack.push(i);
        }

        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();

            if (knows(a, b)) {
                stack.push(b);
            } else {
                stack.push(a);
            }
        }

        int c = stack.pop();

        // check if the c is celebrity or not (if c knows anyone or anyone doesn't know c, then c is not celebrity)

        for (int i = 0; i < persons; i++) {
            if (c != i && (knows(c, i) || !knows(i, c))) {
                return -1;
            }
        }

        return c;
    }
}

//https://www.geeksforgeeks.org/the-celebrity-problem/