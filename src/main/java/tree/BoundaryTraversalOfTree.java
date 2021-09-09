package main.java.tree;

public class BoundaryTraversalOfTree {
    public static void main(String[] args) {
        TNode root = new TNode(20);
        root.left = new TNode(8);
        root.left.left = new TNode(4);
        root.left.right = new TNode(12);
        root.left.right.left = new TNode(10);
        root.left.right.right = new TNode(14);
        root.right = new TNode(22);
        root.right.right = new TNode(25);

        BoundaryTraversalOfTree obj = new BoundaryTraversalOfTree();
        obj.printBoundary(root);
    }

    void printBoundary(TNode root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");

        printLeftBoundary(root.left);
        printLeaves(root.left);
        printLeaves(root.right);
        printRightBoundary(root.right);
    }

    void printLeftBoundary(TNode root) {
        if (root == null)
            return;

        if (root.left != null) {
            System.out.print(root.data + " ");
            printLeftBoundary(root.left);
        } else if (root.right != null) {
            System.out.print(root.data + " ");
            printLeftBoundary(root.right);
        }
    }

    void printRightBoundary(TNode root) {
        if (root == null)
            return;

        if (root.right != null) {
            printRightBoundary(root.right);
            System.out.print(root.data + " ");
        } else if (root.left != null) {
            printRightBoundary(root.left);
            System.out.print(root.data + " ");
        }
    }

    void printLeaves(TNode root) {
        if (root == null)
            return;

        printLeaves(root.left);

        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }

        printLeaves(root.right);
    }
}

// https://www.geeksforgeeks.org/boundary-traversal-of-binary-tree/
