package ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArrTest {



    @Test
    // Test Case 1: Basic merge with non-empty arrays
    public void testMergeArrays1() {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] merge = MergeSortedArr.merge(nums1, nums1.length, nums2, nums2.length);
        assertArrayEquals(expected, merge);
    }

    @Test
    // Test Case 2: Merge with empty nums1
    public void testMergeArrays2() {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{2, 4, 6};
        int[] expected = new int[]{2, 4, 6};
        int[] merge1 = MergeSortedArr.merge(nums1, nums1.length, nums2, nums2.length);
        assertArrayEquals(expected, merge1);
    }

    @Test
    // Test Case 3: Merge with empty nums2
    public void testMergeArrays3() {
        int[] nums1 = new int[]{1, 3, 5};
        int[] nums2 = new int[]{};
        int[] expected = new int[]{1, 3, 5};
        int[] merge2 = MergeSortedArr.merge(nums1, nums1.length, nums2, nums2.length);
        assertArrayEquals(expected, merge2);
    }
}