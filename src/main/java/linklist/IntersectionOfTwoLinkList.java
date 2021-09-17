package main.java.linklist;

public class IntersectionOfTwoLinkList {
    public static void main(String[] args) {
        Node head1 = new Node(4);
        head1.next = new Node(1);
        head1.next.next = new Node(8);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);

        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(1);

        head2.next.next.next = head1.next.next;
        IntersectionOfTwoLinkList obj = new IntersectionOfTwoLinkList();

        Node intesectionNode = obj.intersectionPoint(head1, head2);
        if (intesectionNode == null) {
            System.out.println("No intersection point");
        } else {
            System.out.println(intesectionNode.data);
        }
    }

    Node intersectionPoint(Node head1, Node head2) {
        Node ptr1 = head1;
        Node ptr2 = head2;

        while (ptr1 != ptr2) {
            ptr1 = ptr1 != null ? ptr1.next : head2;
            ptr2 = ptr2 != null ? ptr2.next : head1;
        }

        return ptr1;
    }
}

// https://leetcode.com/problems/intersection-of-two-linked-lists/
/*
See attached pdf for detailed explanation.

Time complexity : O(N + M).
Space complexity : O(1).
 */
