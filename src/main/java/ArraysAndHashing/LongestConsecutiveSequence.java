package ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    //TODO: Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
    // You must write an algorithm that runs in O(n) time.
    // example:
    // Input: nums = [100,4,200,1,3,2]
    // Output: 4
    // Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
    public static int longestConsecutive(int[] nums) {
        // convert to set
        // now check if the current element is a start of a sequence (if n-1 doesnt exist)
        // if it is a start of a sequence than increment by 1 till you reach an element that doesnt exist in the set
        Set<Integer> set = new HashSet<>();
        for (int i : nums) set.add(i);

        int maximumSequence = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currentSequence = 0;
                while (set.contains(num + currentSequence)) {
                    currentSequence++;
                }

                if (maximumSequence < currentSequence) maximumSequence = currentSequence;
            }
        }

        return maximumSequence;
    }
}
