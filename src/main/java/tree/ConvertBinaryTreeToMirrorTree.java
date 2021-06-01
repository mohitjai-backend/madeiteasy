package main.java.tree;

import java.util.LinkedList;
import java.util.Queue;

public class ConvertBinaryTreeToMirrorTree {

    public static void main(String[] args) {
        TNode root = new TNode(1);
        root.left = new TNode(3);
        root.right = new TNode(2);
        root.right.left = new TNode(5);
        root.right.right = new TNode(4);

        ConvertBinaryTreeToMirrorTree obj = new ConvertBinaryTreeToMirrorTree();

        obj.printInorder(root);
        obj.convertBinaryTreeToMirrorTree(root);
        System.out.println();
        obj.printInorder(root);
    }

    // Mirror tree means -> what is left node of root, that will be in right and what is right of root, that will be in left.
    void convertBinaryTreeToMirrorTree(TNode root) {
        if (root == null)
            return;
        Queue<TNode> q = new LinkedList<TNode>();

        q.add(root);

        TNode temp = null;

        while (!q.isEmpty()) {
            TNode node = q.poll();
            temp = node.left;
            node.left = node.right;
            node.right = temp;

            if (node.left != null) {
                q.add(node.left);
            }

            if (node.right != null) {
                q.add(node.right);
            }
        }

    }

    void printInorder(TNode root) {
        if (root == null)
            return;

        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }
}

class TNode {
    int   data;
    TNode left;
    TNode right;

    TNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

//https://www.geeksforgeeks.org/write-an-efficient-c-function-to-convert-a-tree-into-its-mirror-tree/