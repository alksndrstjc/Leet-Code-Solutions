package ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {

    @Test
    public void testLongestConsecutiveSequenceExample1() {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int expected = 4;  // Longest consecutive sequence: 1, 2, 3, 4
        int result = LongestConsecutiveSequence.longestConsecutive(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testLongestConsecutiveSequenceExample2() {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int expected = 9;  // Longest consecutive sequence: 0, 1, 2, 3, 4, 5, 6, 7, 8
        int result = LongestConsecutiveSequence.longestConsecutive(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testLongestConsecutiveSequenceEmptyArray() {
        int[] nums = {};
        int expected = 0;  // Empty array, so the longest consecutive sequence is 0
        int result = LongestConsecutiveSequence.longestConsecutive(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testLongestConsecutiveSequenceSingleElement() {
        int[] nums = {5};
        int expected = 1;  // Single element, so the longest consecutive sequence is 1
        int result = LongestConsecutiveSequence.longestConsecutive(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testLongestConsecutiveSequenceNegativeNumbers() {
        int[] nums = {-5, -4, -3, -2, -1, 0};
        int expected = 6;  // Longest consecutive sequence: -5, -4, -3, -2, -1, 0
        int result = LongestConsecutiveSequence.longestConsecutive(nums);
        assertEquals(expected, result);
    }

}