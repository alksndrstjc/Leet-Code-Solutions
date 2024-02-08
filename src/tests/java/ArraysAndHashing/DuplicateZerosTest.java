package ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DuplicateZerosTest {

    @Test
    public void testDuplicateZeros1() {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        DuplicateZeros.duplicateZeros(arr);
        int[] expected = {1, 0, 0, 2, 3, 0, 0, 4};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testDuplicateZeros2() {
        int[] arr = {0, 0, 0, 0, 0, 0, 0};
        DuplicateZeros.duplicateZeros(arr);
        int[] expected = {0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testDuplicateZeros3() {
        int[] arr = {1, 2, 3, 4, 5};
        DuplicateZeros.duplicateZeros(arr);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testDuplicateZeros4() {
        int[] arr = {0, 1, 0, 2, 0, 3, 0, 4, 0};
        DuplicateZeros.duplicateZeros(arr);
        int[] expected = {0, 0, 1, 0, 0, 2, 0, 0, 3};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testDuplicateZeros5() {
        int[] arr = {1};
        DuplicateZeros.duplicateZeros(arr);
        int[] expected = {1};
        assertArrayEquals(expected, arr);
    }

}