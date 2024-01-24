package TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {

    //TODO: A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    // Given a string s, return true if it is a palindrome, or false otherwise.
    public static boolean isPalindrome(String s) {
        // can be improved by switching Character.isLetterOrDigit with the ASCII check
        if (s.isEmpty()) return true;

        List<Character> condensed = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) condensed.add(Character.toLowerCase(c));
        }

        int start = 0;
        int end = condensed.size() - 1;
        int middle = condensed.size() / 2;

        while (start <= middle && end >= middle) {
            Character startPointer = condensed.get(start);
            Character endPointer = condensed.get(end);
            if (!startPointer.equals(endPointer)) return false;
            start++;
            end--;
        }

        return true;
    }
}
