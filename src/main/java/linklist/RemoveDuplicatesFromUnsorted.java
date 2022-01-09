package main.java.linklist;

import java.util.HashSet;

public class RemoveDuplicatesFromUnsorted {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(3);
        head.next.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next.next = new Node(2);

        RemoveDuplicatesFromUnsorted obj = new RemoveDuplicatesFromUnsorted();
        obj.printList(head);

        head = obj.removeDuplicates(head);
        obj.printList(head);
    }

    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    Node removeDuplicates(Node head) {
        HashSet<Integer> hs = new HashSet<>();

        Node current = head;
        Node prev = null;

        while (current != null) {
            int currVal = current.data;
            if (hs.contains(currVal)) {
                prev.next = current.next;
            } else {
                hs.add(currVal);
                prev = current;
            }

            current = current.next;
        }

        return head;
    }
}

// https://www.geeksforgeeks.org/remove-duplicates-from-an-unsorted-linked-list/
