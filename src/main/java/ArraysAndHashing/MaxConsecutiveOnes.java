package ArraysAndHashing;

public class MaxConsecutiveOnes {

    //TODO: Given a binary array nums, return the maximum number of consecutive 1's in the array.
    // Output: 3
    // Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3
    // 0 1 0 1 1 1 0 1
    public static int findMaxConsecutiveOnes(int[] nums) {

        int consecutiveCount = 0;
        int maxConsecutiveCount = 0;
        for (int n : nums) {
            if (n == 1) consecutiveCount++;
            else consecutiveCount = 0;

            if (maxConsecutiveCount < consecutiveCount) {
                maxConsecutiveCount = consecutiveCount;
            }
        }

        return maxConsecutiveCount;
    }
}
