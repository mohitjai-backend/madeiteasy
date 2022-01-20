package main.java.string;

public class SumTwoLargeNumbers {
    public static void main(String[] args) {
        SumTwoLargeNumbers obj = new SumTwoLargeNumbers();
        String s1 = "3333311111111111";
        String s2 = "44422222221111";

        String res = obj.sum(s1, s2);
        System.out.println(res);
    }

    String sum(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        // Before proceeding further, make sure length of str2 is larger.
        if (len1 > len2) {
            return sum(s2, s1);
        }

        int diff = len2 - len1;
        int sum = 0;
        int carry = 0;

        String res = "";

        for (int i = len1 - 1; i >= 0; i--) {
            sum = (s1.charAt(i) - '0') + (s2.charAt(i + diff) - '0') + carry;
            carry = sum / 10;
            res = res + (char) (sum % 10 + '0');
        }

        for (int i = diff - 1; i >= 0; i--) {
            sum = (s2.charAt(i) - '0') + carry;
            carry = sum / 10;
            res = res + (char) (sum % 10 + '0');
        }

        if (carry > 0) {
            res = res + (char) (carry + '0');
        }

        return new StringBuilder(res).reverse().toString();

    }
}

// https://www.geeksforgeeks.org/sum-two-large-numbers/
