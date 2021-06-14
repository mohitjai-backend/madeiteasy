package main.java.tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BottomViewBinaryTree {
    public static void main(String[] args) {
        TNodeVerticalOrder root = new TNodeVerticalOrder(1);
        root.left = new TNodeVerticalOrder(2);
        root.right = new TNodeVerticalOrder(3);
        root.left.left = new TNodeVerticalOrder(4);
        root.left.right = new TNodeVerticalOrder(5);
        root.right.left = new TNodeVerticalOrder(6);
        root.right.right = new TNodeVerticalOrder(7);
        root.right.left.right = new TNodeVerticalOrder(8);
        root.right.right.right = new TNodeVerticalOrder(9);

        BottomViewBinaryTree obj = new BottomViewBinaryTree();
        obj.printBottomView(root);
    }

    void printBottomView(TNodeVerticalOrder root) {
        if (root == null)
            return;

        Queue<TNodeVerticalOrder> q = new LinkedList<>();
        q.add(root);
        Map<Integer, Integer> map = new TreeMap<>();

        while (!q.isEmpty()) {
            TNodeVerticalOrder temp = q.poll();
            map.put(temp.hd, temp.data);
            if (temp.left != null) {
                TNodeVerticalOrder left_temp = temp.left;
                left_temp.hd = temp.hd - 1;
                q.add(left_temp);
            }
            if (temp.right != null) {
                TNodeVerticalOrder right_temp = temp.right;
                right_temp.hd = temp.hd + 1;
                q.add(right_temp);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
    }
}
