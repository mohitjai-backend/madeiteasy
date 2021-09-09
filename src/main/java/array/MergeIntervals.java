package main.java.array;

import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {
    public static void main(String[] args) {
        Interval arr[] = new Interval[4];
        arr[0] = new Interval(6, 8);
        arr[1] = new Interval(1, 9);
        arr[2] = new Interval(2, 4);
        arr[3] = new Interval(4, 7);
        MergeIntervals obj = new MergeIntervals();
        obj.mergeIntervals(arr);
    }

    void mergeIntervals(Interval arr[]) {
        Arrays.sort(arr, new Comparator<Interval>() {
            @Override public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });

        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[index].end >= arr[i].end) {
                arr[index].end = Math.max(arr[i].end, arr[index].end);
                arr[index].start = Math.min(arr[i].start, arr[index].start);
            } else {
                index++;
                arr[index] = arr[i];
            }
        }

        for (int i = 0; i <= index; i++) {
            System.out.println(arr[i].start + " " + arr[i].end);
        }
    }
}

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

// https://www.geeksforgeeks.org/merging-intervals/
