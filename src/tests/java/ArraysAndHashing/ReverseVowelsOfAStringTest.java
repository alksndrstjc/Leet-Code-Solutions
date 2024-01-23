package ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseVowelsOfAStringTest {


    @Test
    public void testReverseVowels() {
        String s = "hello";
        String expected = "holle";
        String result = ReverseVowelsOfAString.reverseVowels(s);
        String result1 = ReverseVowelsOfAString.reverseVowelsTwoPointersSolution(s);
        assertEquals(expected, result);
        assertEquals(expected, result1);
    }

    @Test
    public void testReverseVowelsMixedCase() {
        String s = "Hello World";
        String expected = "Hollo Werld";
        String result = ReverseVowelsOfAString.reverseVowels(s);
        String result1 = ReverseVowelsOfAString.reverseVowelsTwoPointersSolution(s);
        assertEquals(expected, result);
        assertEquals(expected, result1);
    }

    @Test
    public void testReverseVowelsNoVowels() {
        String s = "xyz";
        String expected = "xyz";
        String result = ReverseVowelsOfAString.reverseVowels(s);
        String result1 = ReverseVowelsOfAString.reverseVowelsTwoPointersSolution(s);
        assertEquals(expected, result);
        assertEquals(expected, result1);
    }

    @Test
    public void testReverseVowelsOnlyVowels() {
        String s = "AEIOU";
        String expected = "UOIEA";
        String result = ReverseVowelsOfAString.reverseVowels(s);
        String result1 = ReverseVowelsOfAString.reverseVowelsTwoPointersSolution(s);
        assertEquals(expected, result);
        assertEquals(expected, result1);
    }

    @Test
    public void testReverseVowelsEmptyString() {
        String s = "";
        String expected = "";
        String result = ReverseVowelsOfAString.reverseVowels(s);
        String result1 = ReverseVowelsOfAString.reverseVowelsTwoPointersSolution(s);
        assertEquals(expected, result);
        assertEquals(expected, result1);
    }

    @Test
    public void testReverseVowelsSingleCharacter() {
        String s = "a";
        String expected = "a";
        String result = ReverseVowelsOfAString.reverseVowels(s);
        String result1 = ReverseVowelsOfAString.reverseVowelsTwoPointersSolution(s);
        assertEquals(expected, result);
        assertEquals(expected, result1);
    }

}