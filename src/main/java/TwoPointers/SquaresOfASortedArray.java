package TwoPointers;

public class SquaresOfASortedArray {

    //TODO: Given an integer array nums sorted in increasing order, return an array of the squares of each number sorted in non-decreasing order.
    // Example 1:
    // Input: nums = [-4,-1,0,3,10]
    // Output: [0,1,9,16,100]
    // Explanation: After squaring, the array becomes [16,1,0,9,100].
    // After sorting, it becomes [0,1,9,16,100].
    // Example 2:
    // Input: nums = [-7,-3,2,3,11]
    // Output: [4,9,9,49,121]
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int low = 0, high = nums.length - 1;

        for (int i = high; i >= 0; i--) {
            if (Math.abs(nums[low]) < Math.abs(nums[high])) {
                result[i] = nums[high] * nums[high];
                high--;
            } else {
                result[i] = nums[low] * nums[low];
                low++;
            }
        }

        return result;
    }
}
