package TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    public void testPalindromeWithValidPalindrome() {
        assertTrue(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void testPalindromeWithEmptyString() {
        assertTrue(ValidPalindrome.isPalindrome(""));
    }

    @Test
    public void testPalindromeWithSingleCharacter() {
        assertTrue(ValidPalindrome.isPalindrome("a"));
    }

    @Test
    public void testPalindromeWithNonAlphanumericCharacters() {
        assertTrue(ValidPalindrome.isPalindrome("Was it a car or a cat I saw?"));
    }

    @Test
    public void testPalindromeWithMixedCase() {
        assertFalse(ValidPalindrome.isPalindrome("Race a car"));
    }

    @Test
    public void testPalindromeWithNonPalindrome() {
        assertFalse(ValidPalindrome.isPalindrome("Hello, World!"));
    }

    @Test
    public void testPalindromeWithNumbers() {
        assertFalse(ValidPalindrome.isPalindrome("Able was I 123 I saw elbA"));
    }

}