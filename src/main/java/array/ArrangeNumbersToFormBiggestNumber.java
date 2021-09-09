package main.java.array;

import java.util.Arrays;
import java.util.Comparator;

public class ArrangeNumbersToFormBiggestNumber {
    public static void main(String[] args) {
        String arr[] = { "54", "546", "548", "60" };
        ArrangeNumbersToFormBiggestNumber obj = new ArrangeNumbersToFormBiggestNumber();
        obj.formBiggestNumber(arr);
    }

    void formBiggestNumber(String arr[]) {
        Arrays.sort(arr, new Comparator<String>() {
            @Override public int compare(String x, String y) {
                String xy = x + y;
                String yx = y + x;

                return xy.compareTo(yx) > 0 ? -1 : 1;
            }
        });

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}

// https://www.geeksforgeeks.org/given-an-array-of-numbers-arrange-the-numbers-to-form-the-biggest-number/
