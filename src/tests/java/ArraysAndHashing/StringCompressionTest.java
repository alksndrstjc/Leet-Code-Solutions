package ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {

    @Test
    public void testCompressStringWithConsecutiveRepeatingCharacters() {
        char[] input = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int result = StringCompression.compress(input);
        assertEquals(6, result);
        //assertArrayEquals(new char[] {'a', '2', 'b', '2', 'c', '3'}, input);
    }

    @Test
    public void testCompressStringWithSingleCharacter() {
        char[] input = {'a'};
        int result = StringCompression.compress(input);
        assertEquals(1, result);
        //assertArrayEquals(new char[] {'a'}, input);
    }

    @Test
    public void testCompressStringWithMixedCharacters() {
        char[] input = {'a', 'a', 'a', 'b', 'b', 'a', 'a'};
        int result = StringCompression.compress(input);
        assertEquals(6, result);
        //assertArrayEquals(new char[] {'a', '3', 'b', '2', 'a', '2'}, input);
    }

    @Test
    public void testCompressStringWithNoRepeatingCharacters() {
        char[] input = {'a', 'b', 'c'};
        int result = StringCompression.compress(input);
        assertEquals(3, result);
        //assertArrayEquals(new char[] {'a', 'b', 'c'}, input);
    }

    @Test
    public void testCompressStringWithGroupLengthGreaterThan10() {
        char[] input = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        int result = StringCompression.compress(input);
        assertEquals(4, result);
        //assertArrayEquals(new char[] {'a', 'b', '1', '2'}, input);
    }

    @Test
    public void leetCodeTest() {
        //["a","a","b","b","c","c","c"]
        char[] input = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int result = StringCompression.compress(input);
        assertEquals(6, result);
    }

}