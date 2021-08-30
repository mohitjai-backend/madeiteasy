package main.java.array;

public class LargestSumContiguousSubArray {
    public static void main(String[] args) {
        LargestSumContiguousSubArray obj = new LargestSumContiguousSubArray();
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(obj.largestSumContiguousSubArray(arr));
    }

    int largestSumContiguousSubArray(int arr[]) {
        int max_so_far = arr[0];
        int curr_max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            curr_max = Math.max(arr[i], arr[i] + curr_max);
            max_so_far = Math.max(max_so_far, curr_max);
        }

        return max_so_far;
    }
}

// https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
