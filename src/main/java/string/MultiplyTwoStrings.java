package main.java.string;

public class MultiplyTwoStrings {
    public static void main(String[] args) {
        MultiplyTwoStrings obj = new MultiplyTwoStrings();
        String res = obj.multiplyTwoStrings("123", "456");
        System.out.println(res);
    }

    String multiplyTwoStrings(String s1, String s2) {
        if (s1.equals("0") || s2.equals("0"))
            return "0";

        int len1 = s1.length();
        int len2 = s2.length();

        int res[] = new int[len1 + len2];

        for (int i = len1 - 1; i >= 0; i--) {
            int a = s1.charAt(i) - '0';
            for (int j = len2 - 1; j >= 0; j--) {
                int b = s2.charAt(j) - '0';
                int idx = i + j + 1;
                int p = a * b + res[idx];
                res[idx] = p % 10;
                res[idx - 1] += p / 10;
            }
        }

        int start = res[0] != 0 ? 0 : 1;
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < res.length; i++) {
            sb.append(res[i]);
        }

        return sb.toString();

    }
}

/*
            1    2    3
            4    5    6
 ------------------------------------
            7    3    8
       6    1    5    x
   4   9    2    x    x
 ------------------------------------
   5   6    0    8    8
 ------------------------------------

 https://leetcode.com/problems/multiply-strings/
 */
