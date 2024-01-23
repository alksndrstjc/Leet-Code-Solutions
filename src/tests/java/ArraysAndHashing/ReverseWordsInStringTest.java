package ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInStringTest {

    @Test
    public void testReverseWords() {
        String s = "Hello World";
        String expected = "World Hello";
        String result = ReverseWordsInString.reverseWords(s);
        assertEquals(expected, result);
    }

    @Test
    public void testReverseWordsWithLeadingAndTrailingSpaces() {
        String s = "   Quick   Brown   Fox   ";
        String expected = "Fox Brown Quick";
        String result = ReverseWordsInString.reverseWords(s);
        assertEquals(expected, result);
    }

    @Test
    public void testReverseWordsWithMultipleSpacesBetweenWords() {
        String s = "Jump    over    the    lazy   dog";
        String expected = "dog lazy the over Jump";
        String result = ReverseWordsInString.reverseWords(s);
        assertEquals(expected, result);
    }

    @Test
    public void testReverseWordsEmptyString() {
        String s = "";
        String expected = "";
        String result = ReverseWordsInString.reverseWords(s);
        assertEquals(expected, result);
    }

    @Test
    public void testReverseWordsSingleWord() {
        String s = "SingleWord";
        String expected = "SingleWord";
        String result = ReverseWordsInString.reverseWords(s);
        assertEquals(expected, result);
    }

    @Test
    public void testReverseWordsMultipleConsecutiveSpaces() {
        String s = "    ";
        String expected = "";
        String result = ReverseWordsInString.reverseWords(s);
        assertEquals(expected, result);
    }

}