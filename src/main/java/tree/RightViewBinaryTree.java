package main.java.tree;

import java.util.LinkedList;
import java.util.Queue;

public class RightViewBinaryTree {
    public static void main(String[] args) {
        TNode root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.left = new TNode(4);
        root.left.right = new TNode(5);
        root.right.left = new TNode(6);
        root.right.right = new TNode(7);
        RightViewBinaryTree obj = new RightViewBinaryTree();
        obj.rightViewInBinaryTree(root);
    }

    void rightViewInBinaryTree(TNode root) {
        if (root == null)
            return;

        Queue<TNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int count = 0;
            int n = q.size();
            while (n > 0) {
                n--;
                count++;
                TNode temp = q.poll();
                if (count == 1)
                    System.out.print(temp.data + " ");
                if (temp.right != null)
                    q.add(temp.right);
                if (temp.left != null)
                    q.add(temp.left);
            }
            System.out.println();
        }
    }
}
