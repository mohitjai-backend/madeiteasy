package main.java.linklist;

public class MergeSortInLinklist {
    public static void main(String[] args) {

        MergeSortInLinklist obj = new MergeSortInLinklist();

        Node head = new Node(10);
        head.next = new Node(12);
        head.next.next = new Node(8);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(1);

        Node newHead = obj.mergeSort(head);
        obj.printList(newHead);
    }

    Node mergeSort(Node head) {

        if (head == null || head.next == null)
            return head;

        Node midNode = getMiddleNode(head);
        Node left = head;
        Node right = midNode.next;
        midNode.next = null;

        Node sortedLeft = mergeSort(left);
        Node sortedRight = mergeSort(right);

        return sortedMerge(sortedLeft, sortedRight);

    }

    Node getMiddleNode(Node head) {
        Node slow = head;
        Node fast = head;
        Node prevSlow = null;

        while (fast != null && fast.next != null) {
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast == null)
            return prevSlow;

        return slow;
    }

    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    Node sortedMerge(Node a, Node b) {
        if (a == null)
            return b;
        if (b == null)
            return a;
        Node result;
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }

        return result;
    }
}

// https://www.geeksforgeeks.org/merge-sort-for-linked-list/
