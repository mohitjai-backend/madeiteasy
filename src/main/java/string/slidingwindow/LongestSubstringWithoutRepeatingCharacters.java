package main.java.string.slidingwindow;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();
        String s = "pwwhkm";
        System.out.println(obj.longestSubstringWithoutRepeatingCharacters(s));
    }

    int longestSubstringWithoutRepeatingCharacters(String s) {
        int chars[] = new int[128];
        int left = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            chars[c]++;

            while (chars[c] > 1) {
                char leftChar = s.charAt(left);
                chars[leftChar]--;
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
