package ArraysAndHashing;

public class ProductOfArrayExceptSelf {

    //todo: Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
    // The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
    // You must write an algorithm that runs in O(n) time and without using the division operation.
    // example:
    // Input: nums = [1,2,3,4]
    // Output: [24,12,8,6]
    public static int[] productExceptSelf(int[] nums) {
        if (nums.length == 0) return new int[0];
        int[] result = new int[nums.length];

        result[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int suffixProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }

        return result;
    }
}
