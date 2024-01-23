package ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorOfStringsTest {

    @Test
    public void testCommonDivisorWithExampleInput() {
        String str1 = "ABCABC";
        String str2 = "ABC";
        String expected = "ABC";
        String result = GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2);
        assertEquals(expected, result);
    }

    @Test
    public void testCommonDivisorWithNoCommonDivisor() {
        String str1 = "XYZ";
        String str2 = "ABC";
        String expected = "";
        String result = GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2);
        assertEquals(expected, result);
    }

    @Test
    public void testCommonDivisorWithOneEmptyString() {
        String str1 = "ABC";
        String str2 = "";
        String expected = "";
        String result = GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2);
        assertEquals(expected, result);
    }

    @Test
    public void testCommonDivisorWithBothEmptyStrings() {
        String str1 = "";
        String str2 = "";
        String expected = "";
        String result = GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2);
        assertEquals(expected, result);
    }

    @Test
    public void testCommonDivisorAnotherCase() {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        String expected = "AB";
        String result = GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2);
        assertEquals(expected, result);
    }

}