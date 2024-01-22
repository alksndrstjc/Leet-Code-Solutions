package ArraysAndHashing;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {

    // Given an array of strings strs, group the anagrams together.
    // You can return the answer in any order.

    // example
    // Input: strs = ["eat","tea","tan","ate","nat","bat"]
    // Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramRepresentationWordGroup = new HashMap<>();
        for (String str : strs) {
            char[] strAsChars = str.toCharArray();
            Arrays.sort(strAsChars);
            String anagramRep = new String(strAsChars);
            List<String> group = anagramRepresentationWordGroup.computeIfAbsent(anagramRep, k -> new ArrayList<>());
            group.add(str);
        }
        return new ArrayList<>(anagramRepresentationWordGroup.values());
    }
}
