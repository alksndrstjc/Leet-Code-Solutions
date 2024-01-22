package ArraysAndHashing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    public void testFizzBuzzWithSmallN() {
        int n = 5;
        List<String> result = FizzBuzz.fizzBuzz(n);
        assertEquals(List.of("1", "2", "Fizz", "4", "Buzz"), result);
    }

    @Test
    public void testFizzBuzzWithLargeN() {
        int n = 15;
        List<String> result = FizzBuzz.fizzBuzz(n);
        assertEquals(List.of(
                "1", "2", "Fizz", "4", "Buzz",
                "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz"
        ), result);
    }

    @Test
    public void testFizzBuzzWithNegativeN() {
        int n = -10;
        List<String> result = FizzBuzz.fizzBuzz(n);
        assertEquals(List.of(), result);  // Empty list for negative input
    }

    @Test
    public void testFizzBuzzWithZeroN() {
        int n = 0;
        List<String> result = FizzBuzz.fizzBuzz(n);
        assertEquals(List.of(), result);  // Empty list for zero input
    }

}