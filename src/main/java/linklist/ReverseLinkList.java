package main.java.linklist;

public class ReverseLinkList {
    public static void main(String[] args) {
        ReverseLinkList obj = new ReverseLinkList();
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        obj.printList(head);
        Node newHead = obj.reverseList(head);
        obj.printList(newHead);
    }

    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    Node reverseList(Node head) {
        if (head == null)
            return head;
        Node prev = null;

        while (head != null) {
            Node temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }

        return prev;
    }
}

// https://www.geeksforgeeks.org/reverse-a-linked-list/
