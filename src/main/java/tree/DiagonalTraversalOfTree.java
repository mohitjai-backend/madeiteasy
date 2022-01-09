package main.java.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class DiagonalTraversalOfTree {
    public static void main(String[] args) {
        TNodeVerticalOrder root = new TNodeVerticalOrder(8);
        root.left = new TNodeVerticalOrder(3);
        root.right = new TNodeVerticalOrder(10);
        root.left.left = new TNodeVerticalOrder(1);
        root.right.left = new TNodeVerticalOrder(6);
        root.right.right = new TNodeVerticalOrder(14);
        root.right.left.left = new TNodeVerticalOrder(4);
        root.right.left.right = new TNodeVerticalOrder(7);
        root.right.right.left = new TNodeVerticalOrder(13);

        DiagonalTraversalOfTree obj = new DiagonalTraversalOfTree();
        obj.diagonalTraversal(root);
    }

    void diagonalTraversal(TNodeVerticalOrder root) {
        if (root == null)
            return;

        Queue<TNodeVerticalOrder> q = new LinkedList<>();
        q.add(root);

        Map<Integer, List<Integer>> mp = new TreeMap<>(Collections.reverseOrder());

        while (!q.isEmpty()) {
            TNodeVerticalOrder temp = q.poll();
            if (mp.containsKey(temp.hd)) {
                List<Integer> values = mp.get(temp.hd);
                values.add(temp.data);
                mp.put(temp.hd, values);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(temp.data);
                mp.put(temp.hd, list);
            }

            if (temp.left != null) {
                TNodeVerticalOrder temp_left = temp.left;
                temp_left.hd = temp.hd - 1;
                q.add(temp_left);
            }

            if (temp.right != null) {
                TNodeVerticalOrder temp_right = temp.right;
                temp_right.hd = temp.hd;
                q.add(temp_right);
            }
        }

        for (Map.Entry<Integer, List<Integer>> entry : mp.entrySet()) {
            List<Integer> values = entry.getValue();
            for (Integer i : values) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

// Same as vertical order, two changes only. collections.reverseOrder to store keys in reverse order and while putting right hd will be same.
// https://www.geeksforgeeks.org/diagonal-traversal-of-binary-tree/
