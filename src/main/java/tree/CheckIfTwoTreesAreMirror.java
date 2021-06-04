package main.java.tree;

public class CheckIfTwoTreesAreMirror {
    public static void main(String[] args) {
        TNode root1 = new TNode(1);
        root1.left = new TNode(2);
        root1.right = new TNode(3);
        root1.left.left = new TNode(4);
        root1.left.right = new TNode(5);

        TNode root2 = new TNode(1);
        root2.left = new TNode(3);
        root2.right = new TNode(2);
        root2.right.left = new TNode(5);
        root2.right.right = new TNode(4);

        CheckIfTwoTreesAreMirror obj = new CheckIfTwoTreesAreMirror();
        System.out.println(obj.checkIfTwoTreesMirror(root1, root2));
    }

    boolean checkIfTwoTreesMirror(TNode root1, TNode root2) {
        if (root1 == null && root2 == null)
            return true;

        if (root1 != null && root2 != null) {
            return (root1.data == root2.data) && checkIfTwoTreesMirror(root1.left, root2.right) && checkIfTwoTreesMirror(root1.right, root2.left);
        }

        return false;
    }
}

// https://www.geeksforgeeks.org/check-if-two-trees-are-mirror/
// https://www.geeksforgeeks.org/symmetric-tree-tree-which-is-mirror-image-of-itself/ (Try it yourself)
