package main.java.linklist;

public class DetectAndRemoveLoop {
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(-4);

        head.next.next.next.next = head.next;

        DetectAndRemoveLoop obj = new DetectAndRemoveLoop();
        obj.detectAndRemoveLoop(head);
        obj.printList(head);
    }

    void detectAndRemoveLoop(Node head) {
        Node slow = head;
        Node fast = head;
        Node entry = head;
        Node temp;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                temp = slow;
                while (temp != entry) {
                    temp = temp.next;
                    entry = entry.next;
                }
                removeLoop(entry);
            }
        }
    }

    void removeLoop(Node entry) {
        Node temp = entry;
        while (temp.next != entry) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}

/*
https://leetcode.com/problems/linked-list-cycle-ii/
https://leetcode.com/problems/linked-list-cycle-ii/discuss/44781/Concise-O(n)-solution-by-using-C%2B%2B-with-Detailed-Alogrithm-Description

Step 2: If there is a cycle, return the entry location of the cycle

2.1) L1 is defined as the distance between the head point and entry point

2.2) L2 is defined as the distance between the entry point and the meeting point

2.3) C is defined as the length of the cycle

2.4) n is defined as the travel times of the fast pointer around the cycle When the first encounter of the slow pointer and the fast pointer

According to the definition of L1, L2 and C, we can obtain:-

    the total distance of the slow pointer traveled when encounter is L1 + L2

    the total distance of the fast pointer traveled when encounter is L1 + L2 + n * C

    Because the total distance the fast pointer traveled is twice as the slow pointer, Thus:

    2 * (L1+L2) = L1 + L2 + n * C => L1 + L2 = n * C => L1 = (n - 1) C + (C - L2)


    It can be concluded that the distance between the head location and entry location is equal to the distance between the meeting location and the entry location along the direction of forward movement.

    So, when the slow pointer and the fast pointer encounter in the cycle, we can define a pointer "entry" that point to the head, this "entry" pointer moves one step each time so as the slow pointer. When this "entry" pointer and the slow pointer both point to the same location, this location is the node where the cycle begins.

-----------------------------------------------------------------------------------------------------------------
An easier formula to explain to the interviewer:-
1- Distance traveled by slow when they meet: L1+L2
2- Distance traveled by fast when they meet: L1+L2+x+L2, where x is the remaining length of the cycle (meeting point to start of the cycle).

2(L1+L2) = L1+L2+x+L2
2L1 + 2L2 = L1+2L2+x
=> x = L1

so we need to move L1 steps from the current meeting point to reach the entry point of the cycle.
-----------------------------------------------------------------------------------------------------------------
*/
