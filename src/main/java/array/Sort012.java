package main.java.array;

public class Sort012 {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0, 1, 1, 0, 0, 2, 2, 1, 2, 2 };
        // low =4 , mid=6 --> when first 1 comes
        Sort012 obj = new Sort012();
        obj.sort012(arr);
        obj.printArray(arr);
    }

    void sort012(int arr[]) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int temp;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }
    }

    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
