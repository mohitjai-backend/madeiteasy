package main.java.linklist;

public class RemoveDuplicatesFromSorted {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(3);
        head.next.next.next.next.next.next = new Node(3);
        head.next.next.next.next.next.next.next = new Node(4);

        RemoveDuplicatesFromSorted obj = new RemoveDuplicatesFromSorted();
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
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
