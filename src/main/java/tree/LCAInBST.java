package main.java.tree;

public class LCAInBST {
    public static void main(String[] args) {
        TNode root = new TNode(20);
        root.left = new TNode(8);
        root.right = new TNode(22);
        root.left.left = new TNode(4);
        root.left.right = new TNode(12);
        root.left.right.left = new TNode(10);
        root.left.right.right = new TNode(14);

        LCAInBST obj = new LCAInBST();
        System.out.println(obj.findLCAInBST(root, 10, 14));
        System.out.println(obj.findLCAInBST(root, 8, 14));
        System.out.println(obj.findLCAInBST(root, 10, 22));
    }

    int findLCAInBST(TNode root, int a, int b) {
        while (root != null) {
            if (root.data > a && root.data > b)
                root = root.left;
            else if (root.data < a && root.data < b)
                root = root.right;
            else
                break;
        }

        return root.data;
    }
}

//https://www.geeksforgeeks.org/lowest-common-ancestor-in-a-binary-search-tree/