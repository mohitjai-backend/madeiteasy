package main.java.linklist;

public class ReverseInGroupSizeK {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        int k = 3;

        ReverseInGroupSizeK obj = new ReverseInGroupSizeK();
        Node reversedNode = obj.reverseListInGroupSizeK(head, k);
        obj.printList(reversedNode);
    }

    Node reverseListInGroupSizeK(Node head, int k) {

        if (head == null)
            return null;

        Node prev = null;
        Node next = null;

        Node curr = head;
        int count = 0;

        while (count < k && curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        if (next != null) {
            head.next = reverseListInGroupSizeK(next, k);
        }

        return prev;
    }

    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}

// https://www.geeksforgeeks.org/reverse-a-list-in-groups-of-given-size/
/*

1 2 3 (In 1st call prev will be 3 and head will be 1)
4 5 6 (In this function call prev will be 6 and head will be 4),
So we will return prev from each function call.

Time Complexity: O(n).
Traversal of list is done only once and it has ‘n’ elements.

Auxiliary Space: O(n/k).
For each Linked List of size n, n/k or (n/k)+1 calls will be made during the recursion.
 */
