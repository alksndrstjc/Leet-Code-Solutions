package ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrefixSumArrayTest {

    @Test
    public void testPrefixSumArray() {
        // Test Case 1: Basic example
        int[] originalArray1 = {1, 2, 3, 4, 5};
        int[] expectedPrefixSum1 = {1, 3, 6, 10, 15};
        assertArrayEquals(expectedPrefixSum1, PrefixSumArray.runningSum(originalArray1));

        // Test Case 2: Array with negative numbers
        int[] originalArray2 = {-1, 2, -3, 4, -5};
        int[] expectedPrefixSum2 = {-1, 1, -2, 2, -3};
        assertArrayEquals(expectedPrefixSum2, PrefixSumArray.runningSum(originalArray2));

        // Test Case 3: Array with zeros
        int[] originalArray3 = {0, 0, 0, 0, 0};
        int[] expectedPrefixSum3 = {0, 0, 0, 0, 0};
        assertArrayEquals(expectedPrefixSum3, PrefixSumArray.runningSum(originalArray3));

        // Test Case 4: Array with a single element
        int[] originalArray4 = {7};
        int[] expectedPrefixSum4 = {7};
        assertArrayEquals(expectedPrefixSum4, PrefixSumArray.runningSum(originalArray4));

        // Test Case 5: Empty array
        int[] originalArray5 = {};
        int[] expectedPrefixSum5 = {};
        assertArrayEquals(expectedPrefixSum5, PrefixSumArray.runningSum(originalArray5));
    }

}