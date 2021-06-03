package main.java.tree;

public class SortedArrayToBalancedBST {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        SortedArrayToBalancedBST obj = new SortedArrayToBalancedBST();
        TNode root = obj.sortedArrayToBalancedBST(arr, 0, arr.length - 1);
        obj.printInOrder(root);
    }

    TNode sortedArrayToBalancedBST(int arr[], int start, int end) {

        if (start > end)
            return null;

        int midPosition = start + ((end - start) / 2);
        TNode root = new TNode(arr[midPosition]);
        root.left = sortedArrayToBalancedBST(arr, start, midPosition - 1);
        root.right = sortedArrayToBalancedBST(arr, midPosition + 1, end);

        return root;
    }

    void printInOrder(TNode root) {
        if (root == null)
            return;
        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }
}

//https://www.geeksforgeeks.org/sorted-array-to-balanced-bst/
