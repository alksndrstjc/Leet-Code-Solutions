package ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    @Test
    public void testGeneralCase() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(new int[]{1, 0}, TwoSum.twoSum(nums, target));
    }

    @Test
    public void testMultiplePairs() {
        int[] nums = {3, 5, 2, 8, 10, 4};
        int target = 12;
        assertArrayEquals(new int[]{4, 2}, TwoSum.twoSum(nums, target));
    }

    @Test
    public void testNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        assertArrayEquals(new int[]{4, 2}, TwoSum.twoSum(nums, target));
    }

    @Test
    public void testNoSolution() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 20;
        assertArrayEquals(new int[]{0, 0}, TwoSum.twoSum(nums, target));
    }

    @Test
    public void testZeroAsTarget() {
        int[] nums = {0, 4, 3, 0};
        int target = 0;
        assertArrayEquals(new int[]{3, 0}, TwoSum.twoSum(nums, target));
    }

    @Test
    public void testArrayWithDuplicates() {
        int[] nums = {3, 3, 7, 4, 2};
        int target = 6;
        assertArrayEquals(new int[]{1, 0}, TwoSum.twoSum(nums, target));
    }

    @Test
    public void testSingleElementArray() {
        int[] nums = {5};
        int target = 5;
        assertArrayEquals(new int[]{0, 0}, TwoSum.twoSum(nums, target));
    }

    @Test
    public void testLargeNumbers() {
        int[] nums = {1000000000, 500000000, 200000000, 300000000};
        int target = 800000000;
        assertArrayEquals(new int[]{3, 1}, TwoSum.twoSum(nums, target));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int target = 10;
        assertArrayEquals(new int[]{0, 0}, TwoSum.twoSum(nums, target));
    }

    @Test
    public void testAllZeros() {
        int[] nums = {0, 0, 0, 0, 0};
        int target = 0;
        assertArrayEquals(new int[]{1, 0}, TwoSum.twoSum(nums, target));
    }
}