package ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    //todo: Given an integer array nums, return true if any value appears at least twice in the array,
    // and return false if every element is distinct.
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();

        for (int i : nums) {
            if (numbers.contains(i)) {
                return true;
            }
            numbers.add(i);
        }

        return false;
    }
}
