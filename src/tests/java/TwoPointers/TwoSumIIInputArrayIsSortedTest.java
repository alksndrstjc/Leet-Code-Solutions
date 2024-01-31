package TwoPointers;

import org.junit.jupiter.api.Test;

import static TwoPointers.TwoSumIIInputArrayIsSorted.twoSum;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumIIInputArrayIsSortedTest {

    @Test
    public void testArr() {
        int[] arr = new int[]{1, 3, 4, 5, 7, 10, 11};
        assertArrayEquals(new int[]{3, 4}, twoSum(arr, 9));
    }

    @Test
    public void testExample() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {1, 2};
        assertArrayEquals(expected, twoSum(numbers, target));
    }

    @Test
    public void testAdditional1() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int target = 7;
        int[] expected = {1, 6};
        assertArrayEquals(expected, twoSum(numbers, target));
    }

    @Test
    public void testAdditional2() {
        int[] numbers = {-1, 0, 2, 4, 6};
        int target = 5;
        int[] expected = {1, 5};
        assertArrayEquals(expected, twoSum(numbers, target));
    }

}