package TwoPointers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @Test
    public void testThreeSumExample1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertEquals(expected.size(), result.size());
        assertTrue(expected.containsAll(result));
    }

    @Test
    public void testThreeSumNoTriplets() {
        int[] nums = {1, 2, 3, 4, 5};
        List<List<Integer>> expected = Collections.emptyList();
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertEquals(0, result.size());
        assertTrue(expected.containsAll(result));
    }

    @Test
    public void testThreeSumAllZeros() {
        int[] nums = {0, 0, 0, 0, 0};
        List<List<Integer>> expected = List.of(
                Arrays.asList(0, 0, 0)
        );
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertEquals(expected.size(), result.size());
        assertTrue(expected.containsAll(result));
    }

    @Test
    public void testThreeSumNegativePositiveMix() {
        int[] nums = {-2, 0, 1, 1, 2};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-2, 0, 2),
                Arrays.asList(-2, 1, 1)
        );
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertEquals(expected.size(), result.size());
        assertTrue(expected.containsAll(result));
    }

}