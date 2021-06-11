package main.java.tree;

import java.util.Stack;

public class LevelOrderInSpiralForm {
    public static void main(String[] args) {
        TNode root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.left = new TNode(4);
        root.left.right = new TNode(5);
        root.right.left = new TNode(6);
        root.right.right = new TNode(7);

        LevelOrderInSpiralForm obj = new LevelOrderInSpiralForm();
        obj.levelOrderInSpiralForm(root);
    }

    void levelOrderInSpiralForm(TNode root) {
        if (root == null)
            return;

        Stack<TNode> s1 = new Stack<>();
        Stack<TNode> s2 = new Stack<>();

        s1.push(root);

        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.isEmpty()) {
                TNode temp = s1.pop();
                System.out.print(temp.data + " ");
                if (temp.right != null) {
                    s2.push(temp.right);
                }
                if (temp.left != null) {
                    s2.push(temp.left);
                }
            }
            while (!s2.isEmpty()) {
                TNode temp = s2.pop();
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    s1.push(temp.left);
                }
                if (temp.right != null) {
                    s1.push(temp.right);
                }
            }
        }
    }
}

// https://www.geeksforgeeks.org/level-order-traversal-in-spiral-form/
