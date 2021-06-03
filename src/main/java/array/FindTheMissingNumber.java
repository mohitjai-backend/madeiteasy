package main.java.array;

public class FindTheMissingNumber {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 3, 7, 8 };
        FindTheMissingNumber obj = new FindTheMissingNumber();
        int missingNumber = obj.findTheMissingNumber(arr);
        System.out.println(missingNumber);
    }

    int findTheMissingNumber(int arr[]) {
        int ans = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            ans = (ans ^ (arr[i] ^ (i + 1)));
        }

        return ans ^ (i + 1);
    }
}

//https://www.geeksforgeeks.org/find-the-missing-number/
