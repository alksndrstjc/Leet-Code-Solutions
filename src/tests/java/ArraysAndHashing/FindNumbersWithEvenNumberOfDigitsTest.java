package ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNumbersWithEvenNumberOfDigitsTest {

    @Test
    public void testEvenNumberOfDigitsBasic() {
        int[] nums = {12, 345, 2, 6, 7896};
        assertEquals(2, FindNumbersWithEvenNumberOfDigits.findNumbers(nums));
    }

    @Test
    public void testEvenNumberOfDigitsAllSingleDigit() {
        int[] nums = {1, 3, 5, 7, 9};
        assertEquals(0, FindNumbersWithEvenNumberOfDigits.findNumbers(nums));
    }

    @Test
    public void testEvenNumberOfDigitsAllEvenDigits() {
        int[] nums = {22, 4444, 666666};
        assertEquals(3, FindNumbersWithEvenNumberOfDigits.findNumbers(nums));
    }

    @Test
    public void testEvenNumberOfDigitsAllOddDigits() {
        int[] nums = {111, 33333, 5555555};
        assertEquals(0, FindNumbersWithEvenNumberOfDigits.findNumbers(nums));
    }

    @Test
    public void testEvenNumberOfDigitsEmptyArray() {
        int[] nums = {};
        assertEquals(0, FindNumbersWithEvenNumberOfDigits.findNumbers(nums));
    }

}