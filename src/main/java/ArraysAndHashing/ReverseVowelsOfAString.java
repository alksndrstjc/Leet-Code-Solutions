package ArraysAndHashing;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseVowelsOfAString {

    //TODO: Given a string s, reverse only all the vowels in the string and return it.
    // The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
    // explanation
    // Input: s = "hello"
    // Output: "holle"
    public static String reverseVowels(String s) {
        Stack<Character> vowelStack = new Stack<>();
        List<Integer> indexes = new ArrayList<>();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (isLetterVowel(chars[i])) {
                vowelStack.push(chars[i]);
                indexes.add(i);
            }
        }

        for (int index : indexes) {
            chars[index] = vowelStack.pop();
        }

        return new String(chars);

    }

    public static String reverseVowelsTwoPointersSolution(String s) {
        // move start and end pointer until they both find a vowel, once this happens swap and continue
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            // cycle start and end till a vowel is found
            while (start < end && !isLetterVowel(chars[start])) start++;
            while (start < end && !isLetterVowel(chars[end])) end--;

            // swap
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }

        return new String(chars);
    }

    public static boolean isLetterVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
