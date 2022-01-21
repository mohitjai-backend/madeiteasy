package main.java.linklist;

public class MergeKSortedLinkList {
    public static void main(String[] args) {
        Node arr[] = new Node[4];

        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        arr[0] = head1;

        Node head2 = new Node(10);
        head2.next = new Node(20);
        head2.next.next = new Node(30);

        arr[1] = head2;

        Node head3 = new Node(100);
        head3.next = new Node(200);
        head3.next.next = new Node(300);

        arr[2] = head3;

        Node head4 = new Node(50);
        head4.next = new Node(60);
        head4.next.next = new Node(70);

        arr[3] = head4;

        MergeKSortedLinkList obj = new MergeKSortedLinkList();

        Node result = obj.mergeKSortedLinkList(arr, arr.length - 1);
        obj.printList(result);

    }

    Node mergeKSortedLinkList(Node arr[], int k) {
        while (k != 0) {
            int i = 0;
            int j = k;
            while (i < j) {
                arr[i] = mergeTwoSortedList(arr[i], arr[j]);
                i++;
                j--;
                if (i >= j) {
                    k = j;
                }
            }
        }
        return arr[0];
    }

    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    Node mergeTwoSortedList(Node a, Node b) {
        if (a == null)
            return b;
        if (b == null)
            return a;

        Node result;

        if (a.data <= b.data) {
            result = a;
            result.next = mergeTwoSortedList(a.next, b);
        } else {
            result = b;
            result.next = mergeTwoSortedList(a, b.next);
        }

        return result;
    }
}

// https://www.geeksforgeeks.org/merge-k-sorted-linked-lists/
// https://www.geeksforgeeks.org/merge-two-sorted-linked-lists/

//https://www.geeksforgeeks.org/merge-two-sorted-linked-lists-such-that-merged-list-is-in-reverse-order/
// Solution:-
// Reverse List A
// Reverse List B
// Then call sortedMerge

/*
Complexity Analysis:

Assuming N(n*k) is the total number of nodes, n is the size of each linked list, and k is the total number of linked lists.

Time Complexity: O(N*log k) or O(n*k*log k)
As outer while loop in function mergeKLists() runs log k times and every time it processes n*k elements.
Auxiliary Space: O(N) or O(n*k)
Because recursion is used in SortedMerge() and to merge the final 2 linked lists of size N/2, N recursive calls will be made.
 */