package main.java.stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingInAStream {
    public static void main(String[] args) {
        FirstNonRepeatingInAStream obj = new FirstNonRepeatingInAStream();
        String s1 = "aabc";
        String s2 = "aabbc";
        String s3 = "aabbbc";
        String s4 = "aabbbcc";
        String s5 = "aabcbc";
        obj.firstNonRepeatingCharacter(s1);
        obj.firstNonRepeatingCharacter(s2);
        obj.firstNonRepeatingCharacter(s3);
        obj.firstNonRepeatingCharacter(s4);
        obj.firstNonRepeatingCharacter(s5);
    }

    void firstNonRepeatingCharacter(String s) {
        int charCount[] = new int[256];
        Queue<Character> q = new LinkedList<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            q.add(c);
            charCount[c - 'a']++;

            while (!q.isEmpty()) {
                if (charCount[q.peek() - 'a'] > 1) {
                    q.poll();
                } else {
                    System.out.print(q.peek() + " ");
                    break;
                }
            }

            if (q.isEmpty()) {
                System.out.print("-1" + " ");
            }
        }

        System.out.println();
    }
}

// https://www.geeksforgeeks.org/queue-based-approach-for-first-non-repeating-character-in-a-stream/
