package ArraysAndHashing;

public class MergeSortedArr {

    //TODO: You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
    // and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];

        int pos1 = 0;
        int pos2 = 0;
        int posResult = 0;

        while (pos1 < nums1.length && pos2 < nums2.length) {
            if (nums1[pos1] < nums2[pos2]) {
                result[posResult++] = nums1[pos1++];
            } else {
                result[posResult++] = nums2[pos2++];
            }
        }

        while (pos1 < nums1.length) {
            result[posResult++] = nums1[pos1++];
        }

        while (pos2 < nums2.length) {
            result[posResult++] = nums2[pos2++];
        }

        return result;
    }
}
