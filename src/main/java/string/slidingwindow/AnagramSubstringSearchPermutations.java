package main.java.string.slidingwindow;

public class AnagramSubstringSearchPermutations {
    public static void main(String[] args) {
        String pat = "abc";
        String text = "cbaebabacd";

        AnagramSubstringSearchPermutations obj = new AnagramSubstringSearchPermutations();
        obj.search(pat, text);
    }

    void search(String pat, String text) {
        int patLength = pat.length();
        int textLength = text.length();

        int patArray[] = new int[256];
        int textArray[] = new int[256];

        for (int i = 0; i < patLength; i++) {
            patArray[pat.charAt(i)]++;
            textArray[text.charAt(i)]++;
        }

        for (int i = patLength; i < textLength; i++) {
            if (compare(patArray, textArray)) {
                System.out.println(i - patLength);
            }

            textArray[text.charAt(i)]++;
            textArray[text.charAt(i - patLength)]--;
        }

        if (compare(patArray, textArray)) {
            System.out.println(textLength - patLength);
        }

    }

    boolean compare(int arr1[], int arr2[]) {

        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }

        return true;
    }
}

// https://www.geeksforgeeks.org/anagram-substring-search-search-permutations/
