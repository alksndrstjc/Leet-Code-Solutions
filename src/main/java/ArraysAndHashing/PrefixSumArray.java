package ArraysAndHashing;

public class PrefixSumArray {

    //TODO: Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
    // example
    // Input: nums = [1,2,3,4]
    // Output: [1,3,6,10]
    // Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

    //prefix sum array
    public static int[] runningSum(int[] nums) {
        if (nums.length == 0) return nums;
        int[] result = new int[nums.length];
        result[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }

        return result;
    }
}
