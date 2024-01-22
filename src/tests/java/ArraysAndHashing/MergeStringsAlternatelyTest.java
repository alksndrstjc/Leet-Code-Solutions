package ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsAlternatelyTest {

    @Test
    public void testMergeStringsExample() {
        String word1 = "abc";
        String word2 = "pqr";
        String expected = "apbqcr";
        String result = MergeStringsAlternately.mergeAlternately(word1, word2);
        assertEquals(expected, result);
    }

    @Test
    public void testMergeStringsWithEqualLength() {
        String word1 = "xyz";
        String word2 = "123";
        String expected = "x1y2z3";
        String result = MergeStringsAlternately.mergeAlternately(word1, word2);
        assertEquals(expected, result);
    }

    @Test
    public void testMergeStringsWithDifferentLengths1() {
        String word1 = "abc";
        String word2 = "defgh";
        String expected = "adbecfgh";
        String result = MergeStringsAlternately.mergeAlternately(word1, word2);
        assertEquals(expected, result);
    }

    @Test
    public void testMergeStringsWithDifferentLengths2() {
        String word1 = "ijklm";
        String word2 = "no";
        String expected = "injoklm";
        String result = MergeStringsAlternately.mergeAlternately(word1, word2);
        assertEquals(expected, result);
    }

    @Test
    public void testMergeStringsWithEmptyString() {
        String word1 = "abc";
        String word2 = "";
        String expected = "abc";
        String result = MergeStringsAlternately.mergeAlternately(word1, word2);
        assertEquals(expected, result);
    }

    @Test
    public void testMergeStringsWithBothEmptyStrings() {
        String word1 = "";
        String word2 = "";
        String expected = "";
        String result = MergeStringsAlternately.mergeAlternately(word1, word2);
        assertEquals(expected, result);
    }
}