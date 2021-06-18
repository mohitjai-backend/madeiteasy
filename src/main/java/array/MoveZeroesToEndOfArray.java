package main.java.array;

public class MoveZeroesToEndOfArray {
    public static void main(String[] args) {
        int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0 };
        MoveZeroesToEndOfArray obj = new MoveZeroesToEndOfArray();
        obj.printArray(arr);
        obj.moveZeroesToEndOfArray(arr);
        obj.printArray(arr);
    }

    void moveZeroesToEndOfArray(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// https://www.geeksforgeeks.org/move-zeroes-end-array/
