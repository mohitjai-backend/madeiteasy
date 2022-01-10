package main.java.tree;

public class CheckIfBTisBST {

    TNode prev;

    public static void main(String[] args) {
        TNode root = new TNode(3);
        root.left = new TNode(2);
        root.right = new TNode(5);
        root.left.left = new TNode(1);
        root.left.right = new TNode(4);

        CheckIfBTisBST obj = new CheckIfBTisBST();
        System.out.println(obj.isBSTOrNot(root));
    }

    boolean isBSTOrNot(TNode root) {
        prev = null;
        return isBSTOrNotUtil(root);
    }

    boolean isBSTOrNotUtil(TNode node) {
        if (node != null) {
            if (!isBSTOrNotUtil(node.left)) {
                return false;
            }

            if (prev != null && prev.data >= node.data) {
                return false;
            }

            prev = node;

            if (!isBSTOrNotUtil(node.right)) {
                return false;
            }
        }

        return true;
    }
}

// https://www.geeksforgeeks.org/a-program-to-check-if-a-binary-tree-is-bst-or-not/
