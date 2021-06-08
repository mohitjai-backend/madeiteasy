package main.java.string;

public class URLifyAString {
    public static void main(String[] args) {
        String s = "Mr  John Smith  ";
        s = s.trim();
        URLifyAString obj = new URLifyAString();
        obj.urlifyString(s);
    }

    void urlifyString(String s) {
        int space_count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                space_count++;
            }
        }
        int extra_space = 2 * space_count;

        char ch[] = new char[s.length() + extra_space];

        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }

        int index = ch.length - 1;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (ch[i] == ' ') {
                ch[index--] = '0';
                ch[index--] = '2';
                ch[index--] = '%';
            } else {
                ch[index] = ch[i];
                index--;
            }
        }

        for (int i = 0; i < ch.length; i++)
            System.out.print(ch[i]);
        System.out.println();

    }
}

// https://www.geeksforgeeks.org/urlify-given-string-replace-spaces/
