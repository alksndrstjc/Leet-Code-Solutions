package ArraysAndHashing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    @Test
    void testGroupAnagrams() {

        // Test case 1: Normal case with anagrams
        String[] input1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result1 = GroupAnagrams.groupAnagrams(input1);
        assertEquals(3, result1.size());
        assertTrue(result1.contains(List.of("eat", "tea", "ate")));
        assertTrue(result1.contains(List.of("tan", "nat")));
        assertTrue(result1.contains(List.of("bat")));

        // Test case 2: Empty input
        String[] input2 = {};
        List<List<String>> result2 = GroupAnagrams.groupAnagrams(input2);
        assertTrue(result2.isEmpty());

        // Test case 3: Single string
        String[] input3 = {"hello"};
        List<List<String>> result3 = GroupAnagrams.groupAnagrams(input3);
        assertEquals(1, result3.size());
        assertEquals(List.of("hello"), result3.get(0));

        // Test case 4: Strings with different lengths
        String[] input4 = {"abc", "def", "gh", "ijkl"};
        List<List<String>> result4 = GroupAnagrams.groupAnagrams(input4);
        assertEquals(4, result4.size());
        assertTrue(result4.contains(List.of("abc")));
        assertTrue(result4.contains(List.of("def")));
        assertTrue(result4.contains(List.of("gh")));
        assertTrue(result4.contains(List.of("ijkl")));

        // Test case 5: Strings with different characters
        String[] input5 = {"abc", "xyz", "123"};
        List<List<String>> result5 = GroupAnagrams.groupAnagrams(input5);
        assertEquals(3, result5.size());
        assertTrue(result5.contains(List.of("abc")));
        assertTrue(result5.contains(List.of("xyz")));
        assertTrue(result5.contains(List.of("123")));
    }
}