package ArraysAndHashing;

public class MergeStringsAlternately {

    //TODO: You are given two strings word1 and word2.
    // Merge the strings by adding letters in alternating order, starting with word1.
    // If a string is longer than the other, append the additional letters onto the end of the merged string.
    // example
    // Input: word1 = "abc", word2 = "pqr"
    // Output: "apbqcr"
    // Explanation: The merged string will be merged as so:
    // word1:  a   b   c
    // word2:    p   q   r
    // merged: a p b q c r
    public static String mergeAlternately(String word1, String word2) {
        int pos1 = 0;
        int pos2 = 0;
        int resultPos = 0;

        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        char[] mergedWord = new char[chars1.length + chars2.length];
        while (pos1 < word1.length() && pos2 < word2.length()) {
            mergedWord[resultPos++] = chars1[pos1++];
            mergedWord[resultPos++] = chars2[pos2++];
        }

        while (pos1 < chars1.length) {
            mergedWord[resultPos++] = chars1[pos1++];
        }

        while (pos2 < chars2.length) {
            mergedWord[resultPos++] = chars2[pos2++];
        }

        return new String(mergedWord);
    }
}
