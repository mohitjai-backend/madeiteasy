package main.java.string;

public class PrintAllPermutationsOfAGivenString {
    public static void main(String[] args) {
        String s = "ABC";
        PrintAllPermutationsOfAGivenString obj = new PrintAllPermutationsOfAGivenString();
        obj.printAllPermutations(s, 0, s.length() - 1);
    }

    void printAllPermutations(String s, int low, int high) {
        if (low == high) {
            System.out.print(s + " ");
        } else {
            for (int i = low; i <= high; i++) {
                s = swap(s, low, i);
                printAllPermutations(s, low + 1, high);
                s = swap(s, low, i); // return back to root (ABC), see attached picture for better understanding
            }
        }
    }

    String swap(String s, int index1, int index2) {
        char arr[] = s.toCharArray();
        char temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        return String.valueOf(arr);
    }
}

// https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
/*
Time Complexity: O(n*n!) The time complexity is the same as the above approach,
i.e. there are n! permutations and it requires O(n) time to print a permutation.
 */