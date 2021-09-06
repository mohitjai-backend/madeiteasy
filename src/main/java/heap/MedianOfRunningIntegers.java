package main.java.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfRunningIntegers {
    public static void main(String[] args) {
        int arr[] = { 5, 15, 10, 20, 3 };
        MedianOfRunningIntegers obj = new MedianOfRunningIntegers();
        obj.medianOfRunningIntegers(arr);
    }

    void medianOfRunningIntegers(int arr[]) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        minHeap.add(arr[0]);
        System.out.println((double) arr[0]);

        for (int i = 1; i < arr.length; i++) {
            double median;
            int curr_value = arr[i];

            if (minHeap.size() > maxHeap.size()) {
                if (curr_value > minHeap.peek()) {
                    maxHeap.add(minHeap.poll());
                    minHeap.add(curr_value);
                } else {
                    maxHeap.add(curr_value);
                }
                median = (double) (maxHeap.peek() + minHeap.peek()) / 2;
            } else if (maxHeap.size() > minHeap.size()) {
                if (curr_value > maxHeap.peek()) {
                    minHeap.add(maxHeap.poll());
                    maxHeap.add(curr_value);
                } else {
                    minHeap.add(curr_value);
                }
                median = (double) (maxHeap.peek() + minHeap.peek()) / 2;
            } else {
                if (curr_value < maxHeap.peek()) {
                    maxHeap.add(curr_value);
                } else {
                    minHeap.add(curr_value);
                }
                if (maxHeap.size() > minHeap.size()) {
                    median = maxHeap.peek();
                } else {
                    median = minHeap.peek();
                }
            }

            System.out.println(median);
        }
    }
}

/*
The basic idea is to maintain two heaps: a max-heap and a min-heap.
The max heap stores the smaller half of all numbers while the min heap stores the larger half.
The sizes of two heaps need to be balanced each time when a new number is inserted so that their size will not be different by more than 1.
Therefore each time when findMedian() is called we check if two heaps have the same size.
If they do, we should return the average of the two top values of heaps.
Otherwise we return the top of the heap which has one more element.

There are several possible situations when a new number is inserted:

1)If both heap are empty, meaning that we are inserting the first number, we just arbitrarily inserted it into a heap, let's say, the min-heap.

2)If min-heap has more elements (later we will argue that the size won't be different by more than 1),
we need to compare the new number with the top of the min-heap. If it is larger than that, then the new number belongs to the larger half and it should be added to the min-heap. But since we have to balance the heap, we should move the top element of the min-heap to the max-heap. For the min-heap, we inserted a new number but removed the original top, its size won't change. For the max-heap, we inserted a new element (the top of the min-heap) so its size will increase by 1.

3)If max-heap has more elements, we did the similar thing as 2).

4)If they have the same size, we just compare the new number with one of the top to determine which heap the new number should be inserted. We just simply inserted it there.

It can be seen that for each insertion if it was in situation 1) and 4), then after insertion the heap size difference will be 1. For 2) and 3), the size of the heap with fewer element will increase by 1 to catch up with the heap with more elements.
Hence their sizes are well-balanced and the difference will never exceeds 1.

Obviously, the median will be the top element of the heap which has one more element (if max-heap and min-heap have different sizes), or the average of the two tops (if max-heap and min-heap have equal sizes). So the findMedian() function is very straightforward:

Links-
https://leetcode.com/problems/find-median-from-data-stream/discuss/74144/Easy-to-understand-double-heap-solution-in-Java
https://www.geeksforgeeks.org/median-of-stream-of-running-integers-using-stl/

MinHeap ->
    10
 5

MaxHeap ->
    20

arr[] = {15,5,12} ,, for equal heap size
*/


