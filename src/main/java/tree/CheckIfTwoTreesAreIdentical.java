package main.java.tree;

public class CheckIfTwoTreesAreIdentical {
    public static void main(String[] args) {
        TNode root1 = new TNode(1);
        root1.left = new TNode(2);
        root1.right = new TNode(3);
        root1.left.left = new TNode(4);
        root1.left.right = new TNode(5);

        TNode root2 = new TNode(1);
        root2.left = new TNode(2);
        root2.right = new TNode(3);
        root2.left.left = new TNode(4);
        root2.left.right = new TNode(5);

        CheckIfTwoTreesAreIdentical obj = new CheckIfTwoTreesAreIdentical();
        System.out.println(obj.checkIfTwoTreesIdentical(root1, root2));
    }

    boolean checkIfTwoTreesIdentical(TNode root1, TNode root2) {
        if (root1 == null && root2 == null)
            return true;

        if (root1 != null && root2 != null) {
            return (root1.data == root2.data) && checkIfTwoTreesIdentical(root1.left, root2.left) && checkIfTwoTreesIdentical(root1.right, root2.right);
        }

        return false;
    }
}

// https://www.geeksforgeeks.org/write-c-code-to-determine-if-two-trees-are-identical/
