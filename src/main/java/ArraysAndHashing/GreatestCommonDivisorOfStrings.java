package ArraysAndHashing;

//todo For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
// Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
// example
// Input: str1 = "ABCABC", str2 = "ABC"
// Output: "ABC"
// INCOMPLETE
public class GreatestCommonDivisorOfStrings {

    public static String gcdOfStrings(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        int pos1, pos2;
        pos1 = pos2 = 0;

        StringBuilder commonDivisor = new StringBuilder();
        while (pos1 < chars1.length && pos2 < chars2.length) {
            if (chars1[pos1] != chars2[pos2]) {
                break;
            }
            commonDivisor.append(chars1[pos1]);
            pos1++;
            pos2++;
        }

        return commonDivisor.toString();
    }
}
