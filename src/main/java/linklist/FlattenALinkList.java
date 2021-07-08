package main.java.linklist;

public class FlattenALinkList {
    public static void main(String[] args) {
        FlattenNode node = new FlattenNode(5);
        node.right = new FlattenNode(10);
        node.right.right = new FlattenNode(19);
        node.right.right.right = new FlattenNode(28);

        node.down = new FlattenNode(7);
        node.down.down = new FlattenNode(8);
        node.down.down.down = new FlattenNode(30);

        node.right.down = new FlattenNode(20);
        node.right.right.down = new FlattenNode(22);
        node.right.right.down.down = new FlattenNode(50);

        node.right.right.right.down = new FlattenNode(35);
        node.right.right.right.down.down = new FlattenNode(40);
        node.right.right.right.down.down.down = new FlattenNode(45);

        FlattenALinkList obj = new FlattenALinkList();
        FlattenNode newHead = obj.flattenList(node);
        obj.printList(newHead);

    }

    void printList(FlattenNode head) {
        while (head.down != null) {
            System.out.print(head.data + " ");
            head = head.down;
        }
        System.out.println();
    }

    FlattenNode flattenList(FlattenNode node) {
        if (node == null || node.right == null)
            return node;

        node.right = flattenList(node.right);
        node = mergeTwoSortedList(node, node.right);

        return node;
    }

    FlattenNode mergeTwoSortedList(FlattenNode a, FlattenNode b) {
        if (a == null)
            return b;
        if (b == null)
            return a;

        FlattenNode result;
        if (a.data <= b.data) {
            result = a;
            result.down = mergeTwoSortedList(a.down, b);
        } else {
            result = b;
            result.down = mergeTwoSortedList(a, b.down);
        }

        return result;
    }
}

class FlattenNode {
    FlattenNode right;
    FlattenNode down;
    int         data;

    public FlattenNode(int data) {
        this.data = data;
        this.down = null;
        this.right = null;
    }
}

// https://www.geeksforgeeks.org/flattening-a-linked-list/
