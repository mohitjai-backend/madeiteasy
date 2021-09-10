package main.java.tree;

public class RootToLeafPathSum {
    public static void main(String[] args) {
        TNode root = new TNode(10);
        root.left = new TNode(8);
        root.right = new TNode(2);
        root.left.left = new TNode(3);
        root.left.right = new TNode(5);
        root.right.left = new TNode(2);

        RootToLeafPathSum obj = new RootToLeafPathSum();
        System.out.println(obj.rootToLeafPathSumEqualToGivenNumber(root, 21));
    }

    boolean rootToLeafPathSumEqualToGivenNumber(TNode root, int sum) {

        if (root == null)
            return false;

        int subsum = sum - root.data;

        if (subsum == 0 && root.left == null && root.right == null) {
            return true;
        }

        return rootToLeafPathSumEqualToGivenNumber(root.left, subsum) || rootToLeafPathSumEqualToGivenNumber(root.right, subsum);
    }
}

// https://leetcode.com/problems/path-sum/
