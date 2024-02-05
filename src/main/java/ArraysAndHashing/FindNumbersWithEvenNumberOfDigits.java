package ArraysAndHashing;

public class FindNumbersWithEvenNumberOfDigits {

    //todo: Given an array nums of integers, return how many of them contain an even number of digits.
    // Input: nums = [12,345,2,6,7896]
    // Output: 2
    // Explanation:
    // 12 contains 2 digits (even number of digits).
    // 345 contains 3 digits (odd number of digits).
    public static int findNumbers(int[] nums) {

        int count = 0;
        for (int n : nums) {
            int numOfDigits = ((int) Math.log10(n)) + 1;
            if (numOfDigits % 2 == 0) count++;
        }

        return count;
    }
}
