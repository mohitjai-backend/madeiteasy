package main.java.linklist;

public class CheckIfListIsPalindrome {
    public static void main(String[] args) {
        CheckIfListIsPalindrome obj = new CheckIfListIsPalindrome();
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(20);
        head.next.next.next.next.next = new Node(10);
        boolean isPalindrome = obj.isPalindrome(head);
        System.out.println(isPalindrome);
    }

    boolean isPalindrome(Node head) {
        Node slowPtr = head;
        Node fastPtr = head;
        Node prev = null;

        Node list1 = head;
        Node list2 = null;

        while (fastPtr != null && fastPtr.next != null) {
            prev = slowPtr;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        if (fastPtr != null) {
            prev.next = null;
            list2 = reverseList(slowPtr.next);
        } else {
            prev.next = null;
            list2 = reverseList(slowPtr);
        }

        return compareTwoLists(list1, list2);
    }

    Node reverseList(Node head) {
        Node prev = null;
        while (head != null) {
            Node temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }

        return prev;
    }

    boolean compareTwoLists(Node head1, Node head2) {
        if (head1 == null && head2 == null)
            return true;
        while (head1 != null && head2 != null) {
            if (head1.data != head2.data)
                return false;
            head1 = head1.next;
            head2 = head2.next;
        }

        if (head1 != null || head2 != null)
            return false;
        return true;
    }
}

// https://www.geeksforgeeks.org/function-to-check-if-a-singly-linked-list-is-palindrome/
