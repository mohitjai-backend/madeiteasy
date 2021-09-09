package main.java.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        MajorityElement obj = new MajorityElement();
        System.out.println(obj.majorityElement(arr));
    }

    int majorityElement(int arr[]) {
        int majorityElement = -1;
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                if (hm.get(arr[i]) >= arr.length / 2) {
                    majorityElement = arr[i];
                } else {
                    hm.put(arr[i], hm.get(arr[i]) + 1);
                }
            } else {
                hm.put(arr[i], 1);
            }
        }

        return majorityElement;
    }
}

// https://www.geeksforgeeks.org/majority-element/
