package main.java.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalOrderInTree {
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

        VerticalOrderInTree obj = new VerticalOrderInTree();
        obj.verticalOrder(root);

    }

    void verticalOrder(TNodeVerticalOrder root) {
        if (root == null)
            return;

        Queue<TNodeVerticalOrder> q = new LinkedList<>();
        Map<Integer, List<Integer>> mp = new TreeMap<>();
        root.hd = 0;
        q.add(root);

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
                temp_right.hd = temp.hd + 1;
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

class TNodeVerticalOrder {
    int                data;
    int                hd; // horizontal distance
    TNodeVerticalOrder left;
    TNodeVerticalOrder right;

    public TNodeVerticalOrder(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// https://www.geeksforgeeks.org/print-a-binary-tree-in-vertical-order-set-3-using-level-order-traversal/
// https://www.geeksforgeeks.org/vertical-sum-in-a-given-binary-tree/ (do it yourself)
