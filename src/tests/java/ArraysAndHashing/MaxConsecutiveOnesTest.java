package ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesTest {

    @Test
    public void testMaxConsecutiveOnesBasic() {
        int[] nums = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1};
        assertEquals(3, MaxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }

    @Test
    public void testMaxConsecutiveOnesNoOnes() {
        int[] nums = {0, 0, 0, 0, 0, 0};
        assertEquals(0, MaxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }

    @Test
    public void testMaxConsecutiveOnesAlternating() {
        int[] nums = {1, 0, 1, 0, 1, 0, 1, 0};
        assertEquals(1, MaxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }

    @Test
    public void testMaxConsecutiveOnesEmptyArray() {
        int[] nums = {};
        assertEquals(0, MaxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }

    @Test
    public void testMaxConsecutiveOnesSingleOne() {
        int[] nums = {1};
        assertEquals(1, MaxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }
}