package Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void testValidString() {
        assertTrue(ValidParentheses.isValid("()"));
        assertTrue(ValidParentheses.isValid("({})"));
        assertTrue(ValidParentheses.isValid("[{()}]"));
    }

    @Test
    void testInvalidString() {
        assertFalse(ValidParentheses.isValid("("));
        assertFalse(ValidParentheses.isValid(")"));
        assertFalse(ValidParentheses.isValid("({[)}]"));
        assertFalse(ValidParentheses.isValid("({}"));
    }

    @Test
    void testEmptyString() {
        assertFalse(ValidParentheses.isValid(""));
    }

    @Test
    void testMixedCharacters() {
        assertTrue(ValidParentheses.isValid("a(b)c{d}e[f]"));
    }

    @Test
    void testNullString() {
        assertFalse(ValidParentheses.isValid(null));
    }

    @Test
    void anotherTest() {
        assertFalse(ValidParentheses.isValid("){"));
    }
}