package ArraysAndHashing;

public class IncreasingTripletSubsequence {

    //todo: Given an integer array nums, return true if there exists a triple of indices (i, j, k)
    // such that i < j < k and nums[i] < nums[j] < nums[k].
    // If no such indices exists, return false.
    public static boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= a) {
                a = num;
            } else if (num <= b) {
                b = num;
            } else {
                return true;
            }
        }

        return false;
    }
}
