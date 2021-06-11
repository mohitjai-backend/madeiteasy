package main.java.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrderTraversal {
    public static void main(String[] args) {
        TNode root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.left = new TNode(4);
        root.left.right = new TNode(5);
        root.right.left = new TNode(6);
        root.right.right = new TNode(7);

        ReverseLevelOrderTraversal obj = new ReverseLevelOrderTraversal();
        obj.reverseLevelOrderTraversal(root);
    }

    void reverseLevelOrderTraversal(TNode root) {
        if (root == null)
            return;

        Queue<TNode> q = new LinkedList<>();
        Stack<TNode> s = new Stack<>();

        q.add(root);

        while (!q.isEmpty()) {
            TNode temp = q.poll();
            s.push(temp);

            if (temp.right != null) {
                q.add(temp.right);
            }
            if (temp.left != null) {
                q.add(temp.left);
            }
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop().data + " ");
        }
    }
}

// https://www.geeksforgeeks.org/reverse-level-order-traversal/
