package ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    //TODO: Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
    // Each letter in magazine can only be used once in ransomNote.
    // example 1:
    // Input: ransomNote = "a", magazine = "b"
    // Output: false
    // example 2:
    // Input: ransomNote = "aa", magazine = "aab"
    // Output: true

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> dictionary = new HashMap<>();

        char[] magazineCharArr = magazine.toCharArray();
        for (char c : magazineCharArr) {
            dictionary.put(c, dictionary.getOrDefault(c, 0) + 1);
        }

        char[] ransomNoteCharArr = ransomNote.toCharArray();
        for (char c : ransomNoteCharArr) {
            if (dictionary.containsKey(c) && dictionary.get(c) > 0) {
                dictionary.put(c, dictionary.getOrDefault(c, 1) - 1);
            } else return false;
        }

        return true;
    }
}
