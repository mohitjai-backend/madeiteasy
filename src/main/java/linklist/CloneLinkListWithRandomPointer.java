package main.java.linklist;

public class CloneLinkListWithRandomPointer {
    public static void main(String[] args) {
        CloneLinkListWithRandomPointer obj = new CloneLinkListWithRandomPointer();

        NodeWithRandomPointer head = new NodeWithRandomPointer(1);
        head.next = new NodeWithRandomPointer(2);
        head.next.next = new NodeWithRandomPointer(3);
        head.next.next.next = new NodeWithRandomPointer(4);
        head.next.next.next.next = new NodeWithRandomPointer(5);

        head.randomPointer = head.next.next;
        head.next.randomPointer = head;
        head.next.next.randomPointer = head.next.next.next.next;
        head.next.next.next.randomPointer = head.next.next.next.next;
        head.next.next.next.next.randomPointer = head.next;

        System.out.println("Original list : ");
        obj.printList(head);

        System.out.println("Cloned list : ");
        NodeWithRandomPointer clonedList = obj.clone(head);
        obj.printList(clonedList);
    }

    void printList(NodeWithRandomPointer head) {
        while (head != null) {
            System.out.println("Node data: " + head.data + " Random Pointer data: " + head.randomPointer.data);
            head = head.next;
        }
    }

    NodeWithRandomPointer clone(NodeWithRandomPointer head) {
        NodeWithRandomPointer curr = head;
        while (curr != null) {
            NodeWithRandomPointer temp = curr.next;
            curr.next = new NodeWithRandomPointer(curr.data);
            curr.next.next = temp;
            curr = curr.next.next;
        }

        curr = head;

        while (curr != null) {
            curr.next.randomPointer = curr.randomPointer.next;
            curr = curr.next.next;
        }

        NodeWithRandomPointer original = head;
        NodeWithRandomPointer copy = head.next;
        NodeWithRandomPointer copyHead = copy;

        while (original != null) {
            original.next = original.next.next;
            copy.next = copy.next == null ? copy.next : copy.next.next;
            original = original.next;
            copy = copy.next;
        }

        return copyHead;
    }
}

class NodeWithRandomPointer {
    int                   data;
    NodeWithRandomPointer next;
    NodeWithRandomPointer randomPointer;

    public NodeWithRandomPointer(int data) {
        this.data = data;
        this.next = null;
        this.randomPointer = null;
    }
}

// https://www.geeksforgeeks.org/clone-linked-list-next-random-pointer-o1-space/