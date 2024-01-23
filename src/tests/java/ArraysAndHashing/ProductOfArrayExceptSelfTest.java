package ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    @Test
    public void testProductExceptSelf() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        int[] result = ProductOfArrayExceptSelf.productExceptSelf(nums);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testProductExceptSelfWithZero() {
        int[] nums = {1, 2, 0, 4};
        int[] expected = {0, 0, 8, 0};
        int[] result = ProductOfArrayExceptSelf.productExceptSelf(nums);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testProductExceptSelfWithNegativeNumbers() {
        int[] nums = {-1, 2, -3, 4};
        int[] expected = {-24, 12, -8, 6};
        int[] result = ProductOfArrayExceptSelf.productExceptSelf(nums);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testProductExceptSelfEmptyArray() {
        int[] nums = {};
        int[] expected = {};
        int[] result = ProductOfArrayExceptSelf.productExceptSelf(nums);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testProductExceptSelfSingleElement() {
        int[] nums = {5};
        int[] expected = {1};
        int[] result = ProductOfArrayExceptSelf.productExceptSelf(nums);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testProductExceptSelfAllZeros() {
        int[] nums = {0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0};
        int[] result = ProductOfArrayExceptSelf.productExceptSelf(nums);
        assertArrayEquals(expected, result);
    }

}