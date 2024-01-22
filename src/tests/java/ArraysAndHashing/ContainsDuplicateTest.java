package ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {

    @Test
    public void testNoDuplicates() {
        int[] nums = {1, 2, 3, 4, 5};
        assertFalse(ContainsDuplicate.containsDuplicate(nums));
    }

    @Test
    public void testWithDuplicates() {
        int[] nums = {1, 2, 3, 4, 1};
        assertTrue(ContainsDuplicate.containsDuplicate(nums));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        assertFalse(ContainsDuplicate.containsDuplicate(nums));
    }

    @Test
    public void testSingleElementArray() {
        int[] nums = {42};
        assertFalse(ContainsDuplicate.containsDuplicate(nums));
    }

    @Test
    public void testLargeArrayWithDuplicates() {
        int[] nums = {5, 8, 2, 9, 1, 3, 7, 6, 4, 5};
        assertTrue(ContainsDuplicate.containsDuplicate(nums));
    }

    @Test
    public void testLargeArrayWithoutDuplicates() {
        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        assertFalse(ContainsDuplicate.containsDuplicate(nums));
    }
}