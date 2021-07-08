package main.java.linklist;

public class SortLL012ByChangingLinks {
    public static void main(String[] args) {
        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(0);
        head.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next.next.next.next = new Node(0);

        SortLL012ByChangingLinks obj = new SortLL012ByChangingLinks();
        Node newHead = obj.sort012(head);
        obj.printList(newHead);
    }

    Node sort012(Node head) {
        if (head == null || head.next == null)
            return head;

        Node zeroD = new Node(0);
        Node oneD = new Node(0);
        Node twoD = new Node(0);

        Node zero = zeroD;
        Node one = oneD;
        Node two = twoD;

        while (head != null) {
            if (head.data == 0) {
                zero.next = head;
                zero = zero.next;
                head = head.next;
            } else if (head.data == 1) {
                one.next = head;
                one = one.next;
                head = head.next;
            } else {
                two.next = head;
                two = two.next;
                head = head.next;
            }
        }

        zero.next = oneD.next != null ? oneD.next : twoD.next;
        one.next = twoD.next;
        two.next = null;

        return zeroD.next;
    }

    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}

// https://www.geeksforgeeks.org/sort-linked-list-0s-1s-2s-changing-links/
