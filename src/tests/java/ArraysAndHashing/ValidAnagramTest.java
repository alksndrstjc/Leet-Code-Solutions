package ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    public void testAnagramStrings() {
        String s = "listen";
        String t = "silent";
        assertTrue(ValidAnagram.isAnagram(s, t));
    }

    @Test
    public void testNonAnagramStrings() {
        String s = "hello";
        String t = "world";
        assertFalse(ValidAnagram.isAnagram(s, t));
    }

    @Test
    public void testAnagramStringsWithDifferentCase() {
        String s = "Triangle";
        String t = "integral";
        assertTrue(ValidAnagram.isAnagram(s, t));
    }

    @Test
    public void testAnagramStringsWithWhitespace() {
        String s = "Astronomer";
        String t = "Moon starer";
        assertTrue(ValidAnagram.isAnagram(s, t));
    }

    @Test
    public void testAnagramStringsWithSpecialCharacters() {
        String s = "heart";
        String t = "earth";
        assertTrue(ValidAnagram.isAnagram(s, t));
    }

    @Test
    public void testAnagramStringsWithDifferentLengths() {
        String s = "cat";
        String t = "tacare";
        assertFalse(ValidAnagram.isAnagram(s, t));
    }
}