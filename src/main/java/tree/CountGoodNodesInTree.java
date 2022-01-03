package main.java.tree;

import java.util.LinkedList;
import java.util.Queue;

public class CountGoodNodesInTree {
    public static void main(String[] args) {
        TNode root = new TNode(3);
        root.left = new TNode(1);
        root.right = new TNode(4);
        root.left.left = new TNode(3);
        root.right.left = new TNode(1);
        root.right.right = new TNode(5);

        CountGoodNodesInTree obj = new CountGoodNodesInTree();
        System.out.println(obj.countGoodNodes(root));
    }

    int countGoodNodes(TNode root) {
        if (root == null)
            return 0;
        Queue<MyPair> queue = new LinkedList<>();
        int goodNodes = 0;

        queue.add(new MyPair(root, Integer.MIN_VALUE));
        while (!queue.isEmpty()) {
            MyPair curr = queue.poll();
            if (curr.node.data >= curr.maxSoFar) {
                goodNodes++;
            }

            if (curr.node.left != null) {
                queue.add(new MyPair(curr.node.left, Math.max(curr.maxSoFar, curr.node.data)));
            }

            if (curr.node.right != null) {
                queue.add(new MyPair(curr.node.right, Math.max(curr.maxSoFar, curr.node.data)));
            }
        }

        return goodNodes;
    }
}

class MyPair {
    TNode node;
    int   maxSoFar;

    public MyPair(TNode node, int maxSoFar) {
        this.node = node;
        this.maxSoFar = maxSoFar;
    }
}

// https://leetcode.com/problems/count-good-nodes-in-binary-tree/
