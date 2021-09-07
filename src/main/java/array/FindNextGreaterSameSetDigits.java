package main.java.array;

public class FindNextGreaterSameSetDigits {
    public static void main(String[] args) {
        int digits[] = { 1, 2, 2, 2, 2, 3, 3, 3 };
        FindNextGreaterSameSetDigits obj = new FindNextGreaterSameSetDigits();
        obj.findNextGreaterSameSetDigits(digits);
    }

    void findNextGreaterSameSetDigits(int digits[]) {
        int n = digits.length;
        int i, j, p;

        for (i = n - 1; i > 0; i--) {
            if (digits[i] > digits[i - 1]) {
                break;
            }
        }

        if (i == 0) {
            System.out.println("No solution");
        } else {
            int min = i;
            for (j = i; j < digits.length; j++) {
                if (digits[j] > digits[i - 1] && digits[j] <= digits[min]) {
                    // digits[j] > digits[i-1] is necessary (Example - 230241)
                    // digits[j] <= digits[min] --> Equal condition is also necessary (Example - 12222333)
                    min = j;
                }
            }

            int temp = digits[i - 1];
            digits[i - 1] = digits[min];
            digits[min] = temp;

            int low = i;
            int high = digits.length - 1;

            while (low < high) {
                int tempVar = digits[low];
                digits[low] = digits[high];
                digits[high] = tempVar;
                low++;
                high--;
            }

            for (p = 0; p < digits.length; p++) {
                System.out.print(digits[p] + " ");
            }
        }
    }
}

/*
https://www.geeksforgeeks.org/find-next-greater-number-set-digits/

Following are few observations about the next greater number.
1) If all digits sorted in descending order, then output is always “Not Possible”. For example, 4321.
2) If all digits are sorted in ascending order, then we need to swap last two digits. For example, 1234.
3) For other cases, we need to process the number from rightmost side (why? because we need to find the smallest of all greater numbers)

You can now try developing an algorithm yourself.
Following is the algorithm for finding the next greater number.
I) Traverse the given number from rightmost digit, keep traversing till you find a digit which is smaller than the previously traversed digit. For example, if the input number is “534976”, we stop at 4 because 4 is smaller than next digit 9. If we do not find such a digit, then output is “Not Possible”.

II) Now search the right side of above found digit ‘d’ for the smallest digit greater than ‘d’. For “534976″, the right side of 4 contains “976”. The smallest digit greater than 4 is 6.

III) Swap the above found two digits, we get 536974 in above example.

IV) After (i-1) index, we are reversing the digits as all digits are linearly sorted in reverse order
 */
