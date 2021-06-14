package main.java.tree;

import java.util.LinkedList;
import java.util.Queue;

public class DetermineIfBTisHeightBalanced {
    public static void main(String[] args) {
        TNode root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.left = new TNode(4);
        root.left.right = new TNode(5);
        root.left.left.left = new TNode(8);

        DetermineIfBTisHeightBalanced obj = new DetermineIfBTisHeightBalanced();
        System.out.println(obj.determineIfBinaryTreeIsHeightBalanced(root));
    }

    boolean determineIfBinaryTreeIsHeightBalanced(TNode root) {
        if (root == null)
            return true;

        return determineIfBinaryTreeIsHeightBalanced(root.left) &&
                determineIfBinaryTreeIsHeightBalanced(root.right) &&
                (Math.abs(heightOfTree(root.left) - heightOfTree(root.right)) <= 1);
    }

    int heightOfTree(TNode root) {
        if (root == null)
            return 0;
        Queue<TNode> q = new LinkedList<>();
        q.add(root);

        int height = 0;

        while (!q.isEmpty()) {
            int n = q.size();
            height++;
            while (n > 0) {
                n--;
                TNode temp = q.poll();
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
        }
        return height;
    }
}

// https://www.geeksforgeeks.org/how-to-determine-if-a-binary-tree-is-balanced/
