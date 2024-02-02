package TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    @Test
    public void testMaxAreaExample1() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;  // Container between lines with heights 8 and 7
        int result = ContainerWithMostWater.maxArea(height);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxAreaExample2() {
        int[] height = {1, 1};
        int expected = 1;  // Container between lines with heights 1 and 1
        int result = ContainerWithMostWater.maxArea(height);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxAreaExample3() {
        int[] height = {4, 3, 2, 1, 4};
        int expected = 16;  // Container between lines with heights 4 and 4
        int result = ContainerWithMostWater.maxArea(height);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxAreaExample4() {
        int[] height = {1, 2, 1};
        int expected = 2;  // Container between lines with heights 2 and 1
        int result = ContainerWithMostWater.maxArea(height);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxAreaNoContainer() {
        int[] height = {1, 2, 3, 4, 5};
        int expected = 6;
        int result = ContainerWithMostWater.maxArea(height);
        assertEquals(expected, result);
    }

}