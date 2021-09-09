package main.java.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedArrays {
    public static void main(String[] args) {
        int[][] arr = {
                { 2, 6, 12, 34 },
                { 1, 9, 20, 1000 },
                { 23, 34, 90, 2000 }
        };

        MergeKSortedArrays obj = new MergeKSortedArrays();
        obj.mergeKSortedArrays(arr, arr.length);
    }

    void mergeKSortedArrays(int arr[][], int k) {
        PriorityQueue<Element> pq = new PriorityQueue<>(new Comparator<Element>() {
            @Override public int compare(Element o1, Element o2) {
                return o1.val - o2.val;
            }
        });

        int size = 0;
        for (int i = 0; i < k; i++) {
            pq.add(new Element(arr[i][0], i, 0));
            size = size + arr[i].length;
        }

        int result[] = new int[size];

        for (int i = 0; i < size; i++) {
            Element temp = pq.poll();
            result[i] = temp.val;
            if (temp.col < arr[temp.row].length - 1) {
                pq.add(new Element(arr[temp.row][temp.col + 1], temp.row, temp.col + 1));
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

class Element {
    int val;
    int row;
    int col;

    public Element(int val, int row, int col) {
        this.val = val;
        this.row = row;
        this.col = col;
    }
}

/*
Create a min Heap and insert the first element of all k arrays.
Run a loop until the size of MinHeap is greater than zero.
Remove the top element of the MinHeap and print the element.
Now insert the next element from the same array in which the removed element belonged.
 */
