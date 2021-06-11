package main.java.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalLineByLine {
    public static void main(String[] args) {
        TNode root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.left = new TNode(4);
        root.left.right = new TNode(5);
        root.right.left = new TNode(6);
        root.right.right = new TNode(7);

        LevelOrderTraversalLineByLine obj = new LevelOrderTraversalLineByLine();
        obj.levelOrderTraversalLineByLine(root);
    }

    void levelOrderTraversalLineByLine(TNode root) {
        if (root == null)
            return;

        Queue<TNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();
            while (n > 0) {
                n--;
                TNode temp = q.poll();
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            System.out.println();
        }
    }
}

// https://www.geeksforgeeks.org/print-level-order-traversal-line-line/
