package ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (valueIndexMap.containsKey(target - nums[i])) {
                return new int[] {i, valueIndexMap.get(target - nums[i])};
            } else valueIndexMap.put(nums[i], i);
        }
        return new int[]{0, 0};
    }
}
