package main.java.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("I", 1);
        mp.put("V", 5);
        mp.put("X", 10);
        mp.put("L", 50);
        mp.put("C", 100);
        mp.put("D", 500);
        mp.put("M", 1000);

        mp.put("IV", 4);
        mp.put("IX", 9);
        mp.put("XL", 40);
        mp.put("XC", 90);
        mp.put("CD", 400);
        mp.put("CM", 900);

        RomanToInt obj = new RomanToInt();
        System.out.println(obj.romanToInt("MCMXCIV", mp));

    }

    int romanToInt(String s, Map<String, Integer> mp) {
        int ans = 0;
        int i = 0;

        while (i < s.length()) {
            if (i < s.length() - 1) {
                String doubleCharString = s.substring(i, i + 2);
                if (mp.containsKey(doubleCharString)) {
                    i = i + 2;
                    ans = ans + mp.get(doubleCharString);
                    continue;
                }
            }

            ans = ans + mp.get(s.substring(i, i + 1));
            i++;
        }

        return ans;
    }
}

// https://leetcode.com/problems/roman-to-integer/
/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
 */
