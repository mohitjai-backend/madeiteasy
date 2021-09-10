package main.java.tree;

public class BinaryTreeMaxPathSum {
    public static void main(String[] args) {
        TNode root = new TNode(-15);
        root.left = new TNode(5);
        root.right = new TNode(6);
        root.left.left = new TNode(-8);
        root.left.right = new TNode(1);
        root.left.left.left = new TNode(2);
        root.left.left.right = new TNode(6);
        root.right.left = new TNode(3);
        root.right.right = new TNode(9);
        root.right.right.right = new TNode(0);
        root.right.right.right.left = new TNode(4);
        root.right.right.right.right = new TNode(-1);
        root.right.right.right.right.left = new TNode(10);

        BinaryTreeMaxPathSum obj = new BinaryTreeMaxPathSum();
        System.out.println(obj.maxSum(root));
    }

    int maxSum(TNode root) {
        Res res = new Res();
        res.val = Integer.MIN_VALUE;
        max_gain(root, res);
        return res.val;
    }

    int max_gain(TNode root, Res res) {
        if (root == null)
            return 0;

        int left_gain = Math.max(max_gain(root.left, res), 0);
        int right_gain = Math.max(max_gain(root.right, res), 0);

        int price_newpath = root.data + left_gain + right_gain;

        res.val = Math.max(res.val, price_newpath);

        return root.data + Math.max(left_gain, right_gain);
    }
}

class Res {
    int val;
}

// https://leetcode.com/problems/binary-tree-maximum-path-sum/solution/
// https://www.geeksforgeeks.org/find-maximum-path-sum-two-leaves-binary-tree/
