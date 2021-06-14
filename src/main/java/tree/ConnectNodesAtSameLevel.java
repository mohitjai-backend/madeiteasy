package main.java.tree;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectNodesAtSameLevel {
    public static void main(String[] args) {
        TNodeWithRightPointer root = new TNodeWithRightPointer(10);
        root.left = new TNodeWithRightPointer(8);
        root.right = new TNodeWithRightPointer(2);
        root.left.left = new TNodeWithRightPointer(3);
        root.right.right = new TNodeWithRightPointer(90);

        ConnectNodesAtSameLevel obj = new ConnectNodesAtSameLevel();
        obj.connectNodesAtSameLevel(root);

        System.out.println("nextRight of " + root.data + " is " +
                ((root.nextRight != null) ? root.nextRight.data : -1));
        System.out.println("nextRight of " + root.left.data + " is " +
                ((root.left.nextRight != null) ? root.left.nextRight.data : -1));
        System.out.println("nextRight of " + root.right.data + " is " +
                ((root.right.nextRight != null) ? root.right.nextRight.data : -1));
        System.out.println("nextRight of " + root.left.left.data + " is " +
                ((root.left.left.nextRight != null) ? root.left.left.nextRight.data : -1));
        System.out.println("nextRight of " + root.right.right.data + " is " +
                ((root.right.right.nextRight != null) ? root.right.right.nextRight.data : -1));
    }

    void connectNodesAtSameLevel(TNodeWithRightPointer root) {
        if (root == null)
            return;

        Queue<TNodeWithRightPointer> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();

            while (n > 0) {
                n--;
                TNodeWithRightPointer temp = q.poll();

                if (n == 0) {
                    temp.nextRight = null;
                } else {
                    temp.nextRight = q.peek();
                }

                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
        }
    }
}

class TNodeWithRightPointer {
    int                   data;
    TNodeWithRightPointer left;
    TNodeWithRightPointer right;
    TNodeWithRightPointer nextRight;

    public TNodeWithRightPointer(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.nextRight = null;
    }
}
