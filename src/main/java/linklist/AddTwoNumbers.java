package main.java.linklist;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Node head1 = new Node(2);
        head1.next = new Node(4);
        head1.next.next = new Node(3);

        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(4);

        AddTwoNumbers obj = new AddTwoNumbers();
        Node sum = obj.addTwoNumbers(head1, head2);
        obj.printList(sum);
    }

    Node addTwoNumbers(Node head1, Node head2) {
        Node dummyNode = new Node(0);
        Node curr = dummyNode;
        int carry = 0;

        while (head1 != null || head2 != null) {
            int x = head1 != null ? head1.data : 0;
            int y = head2 != null ? head2.data : 0;

            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;

            if (head1 != null) {
                head1 = head1.next;
            }

            if (head2 != null) {
                head2 = head2.next;
            }
        }

        if (carry > 0) {
            curr.next = new Node(carry);
        }

        return dummyNode.next;
    }

    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}

// https://leetcode.com/problems/add-two-numbers/
/*
Time complexity : O(max(m, n)). Assume that m and n represents the length of l1 and l2 respectively,
the algorithm above iterates at most max(m, n) times.

Space complexity : O(max(m, n)). The length of the new list is at most max(m,n) + 1.
 */
