package main.java.tree;

public class ConvertBinaryTreeToDLL {

    static TNode prev;
    TNode head;

    public static void main(String[] args) {
        TNode root = new TNode(10);
        root.left = new TNode(12);
        root.right = new TNode(15);
        root.left.left = new TNode(25);
        root.left.right = new TNode(30);
        root.right.left = new TNode(36);

        ConvertBinaryTreeToDLL obj = new ConvertBinaryTreeToDLL();
        obj.convertBinaryTreeToDLL(root);

        obj.printDoublyLinkList(obj.head);
    }

    void convertBinaryTreeToDLL(TNode root) {
        if (root == null)
            return;

        convertBinaryTreeToDLL(root.left);

        if (prev == null)
            head = root;
        else {
            prev.right = root;
            root.left = prev;
        }

        prev = root;

        convertBinaryTreeToDLL(root.right);

    }

    void printDoublyLinkList(TNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.right;
        }
        System.out.println();
    }
}

//https://www.geeksforgeeks.org/convert-given-binary-tree-doubly-linked-list-set-3/
