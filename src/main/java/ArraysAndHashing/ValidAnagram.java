package ArraysAndHashing;

import java.util.Arrays;

public class ValidAnagram {

    // Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    // An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    // typically using all the original letters exactly once.
    public static boolean isAnagram(String s, String t) {
        char[] sArr = s.toLowerCase().replace(" ", "").toCharArray();
        char[] tArr = t.toLowerCase().replace(" ", "").toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return new String(sArr).equals(new String(tArr));
    }
}
