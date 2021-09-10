package main.java.string;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "  Ankita You Love I  ";
        ReverseWordsInAString obj = new ReverseWordsInAString();
        String reversedWords = obj.reverseWords(s);
        System.out.println(reversedWords);
    }

    String reverseWords(String s) {
        StringBuilder sb = trimSpaces(s);
        reverse(sb, 0, sb.length() - 1);
        reverseEachWord(sb);

        return sb.toString();
    }

    StringBuilder trimSpaces(String s) {
        int left = 0;
        int right = s.length() - 1;

        StringBuilder sb = new StringBuilder();

        while (left <= right && s.charAt(left) == ' ') {
            left++;
        }

        while (left <= right && s.charAt(right) == ' ') {
            right--;
        }

        while (left <= right) {
            if (s.charAt(left) != ' ') {
                sb.append(s.charAt(left));
            } else if (sb.charAt(sb.length() - 1) != ' ') {
                sb.append(s.charAt(left));
            }
            left++;
        }

        return sb;
    }

    void reverse(StringBuilder sb, int left, int right) {
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);

            left++;
            right--;
        }
    }

    void reverseEachWord(StringBuilder sb) {
        int start = 0;
        int end = 0;
        int n = sb.length();

        while (start < n) {
            while (end < n && sb.charAt(end) != ' ') {
                end++;
            }

            reverse(sb, start, end - 1);
            start = end + 1;
            end = end + 1;
        }
    }
}

// https://leetcode.com/problems/reverse-words-in-a-string/
