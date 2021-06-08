package main.java.linklist;

public class CheckIfLLisCircular {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(12);
        head.next.next = new Node(14);
        head.next.next.next = new Node(16);
        head.next.next.next.next = new Node(18);
        head.next.next.next.next.next = head;

        CheckIfLLisCircular obj = new CheckIfLLisCircular();
        System.out.println(obj.checkCircular(head));
    }

    boolean checkCircular(Node head) {
        Node temp = head;
        while (head != null) {
            if (head.next == temp)
                return true;
            else
                head = head.next;
        }

        return false;
    }
}

class Node {
    int  data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// https://www.geeksforgeeks.org/check-if-a-linked-list-is-circular-linked-list/