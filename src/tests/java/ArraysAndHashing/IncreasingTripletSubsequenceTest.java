package ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingTripletSubsequenceTest {

    @Test
    public void testValidTripleExists() {
        // Valid triple: nums[0] < nums[1] < nums[2]
        int[] nums = {1, 2, 3};
        assertTrue(IncreasingTripletSubsequence.increasingTriplet(nums));
    }

    @Test
    public void testValidTripleExists2() {
        // Valid triple: nums[1] < nums[3] < nums[5]
        int[] nums = {5, 2, 8, 3, 7, 1};
        assertTrue(IncreasingTripletSubsequence.increasingTriplet(nums));
    }

    @Test
    public void testNoValidTripleExists() {
        // No valid triple exists
        int[] nums = {1, 2, 1, 2, 1, 2};
        assertFalse(IncreasingTripletSubsequence.increasingTriplet(nums));
    }

    @Test
    public void testNoValidTripleExists2() {
        // No valid triple exists
        int[] nums = {3, 2, 1};
        assertFalse(IncreasingTripletSubsequence.increasingTriplet(nums));
    }

    @Test
    public void testEmptyArray() {
        // Edge case: Empty array should return false
        int[] nums = {};
        assertFalse(IncreasingTripletSubsequence.increasingTriplet(nums));
    }

    @Test
    public void testArrayWithTwoElements() {
        // Edge case: Array with only two elements should return false
        int[] nums = {5, 3};
        assertFalse(IncreasingTripletSubsequence.increasingTriplet(nums));
    }

}