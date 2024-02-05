package TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfASortedArrayTest {

    @Test
    public void testSortedSquaresExample1() {
        int[] nums1 = {-4, -1, 0, 3, 10};
        int[] expected1 = {0, 1, 9, 16, 100};
        assertArrayEquals(expected1, SquaresOfASortedArray.sortedSquares(nums1));
    }

    @Test
    public void testSortedSquaresExample2() {
        int[] nums2 = {-7, -3, 2, 3, 11};
        int[] expected2 = {4, 9, 9, 49, 121};
        assertArrayEquals(expected2, SquaresOfASortedArray.sortedSquares(nums2));
    }

    @Test
    public void testSortedSquaresAllNegative() {
        int[] nums3 = {-5, -4, -3, -2, -1};
        int[] expected3 = {1, 4, 9, 16, 25};
        assertArrayEquals(expected3, SquaresOfASortedArray.sortedSquares(nums3));
    }

    @Test
    public void testSortedSquaresAllPositive() {
        int[] nums4 = {1, 2, 3, 4, 5};
        int[] expected4 = {1, 4, 9, 16, 25};
        assertArrayEquals(expected4, SquaresOfASortedArray.sortedSquares(nums4));
    }

    @Test
    public void testSortedSquaresMixed() {
        int[] nums5 = {-3, -2, -1, 0, 1, 2, 3};
        int[] expected5 = {0, 1, 1, 4, 4, 9, 9};
        assertArrayEquals(expected5, SquaresOfASortedArray.sortedSquares(nums5));
    }

    @Test
    public void leetCodeTest() {
        int[] nums5 = {-1, 2, 2};
        int[] expected5 = {1, 4 ,4};
        assertArrayEquals(expected5, SquaresOfASortedArray.sortedSquares(nums5));
    }

}