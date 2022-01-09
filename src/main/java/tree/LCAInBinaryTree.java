package main.java.tree;

public class LCAInBinaryTree {

    static boolean v1 = false, v2 = false;

    public static void main(String[] args) {
        TNode root = new TNode(20);
        root.left = new TNode(8);
        root.right = new TNode(22);
        root.left.left = new TNode(4);
        root.left.right = new TNode(12);
        root.left.right.left = new TNode(10);
        root.left.right.right = new TNode(14);

        LCAInBinaryTree obj = new LCAInBinaryTree();

        TNode node = obj.findLCAInBT(root, 10, 14);
        if (node != null) {
            System.out.println(node.data);
        } else {
            System.out.println("keys not found");
        }

        node = obj.findLCAInBT(root, 8, 14);
        if (node != null) {
            System.out.println(node.data);
        } else {
            System.out.println("keys not found");
        }

        node = obj.findLCAInBT(root, 10, 22);
        if (node != null) {
            System.out.println(node.data);
        } else {
            System.out.println("keys not found");
        }
    }

    TNode findLCAInBT(TNode root, int a, int b) {
        v1 = false;
        v2 = false;

        TNode node = findLCAInBTUtil(root, a, b);

        if (v1 && v2)
            return node;
        else
            return null;

    }

    TNode findLCAInBTUtil(TNode root, int a, int b) {

        if (root == null)
            return null;

        TNode temp = null;

        if (root.data == a) {
            v1 = true;
            temp = root;
        }

        if (root.data == b) {
            v2 = true;
            temp = root;
        }

        TNode left_lca = findLCAInBTUtil(root.left, a, b);
        TNode right_lca = findLCAInBTUtil(root.right, a, b);

        // (imp) below condition must be after left_rca and right_rca, then only v1 or v2 can be true.

        if (temp != null)
            return temp;

        if (left_lca != null && right_lca != null)
            return root;

        return left_lca != null ? left_lca : right_lca;
    }
}

//https://www.geeksforgeeks.org/lowest-common-ancestor-binary-tree-set-1/

/*
If we assume that the keys n1 and n2 are present in Binary Tree,
we can find LCA using a single traversal of Binary Tree and without extra storage for path arrays.
The idea is to traverse the tree starting from the root.
If any of the given keys (n1 and n2) matches with the root,
then the root is LCA (assuming that both keys are present).
If the root doesn’t match with any of the keys, we recur for the left and right subtree.
The node which has one key present in its left subtree and the other key present in the right subtree is the LCA.
If both keys lie in the left subtree, then the left subtree has LCA also, otherwise, LCA lies in the right subtree.

Two boolean variables v1 and v2. v1 is set as true when n1 is present in the tree and v2 is set as true if n2 is present in the tree.
 */