package ArraysAndHashing;

public class StringCompression {

    //TODO: Given an array of characters chars, compress it using the following algorithm:
    // Begin with an empty string s. For each group of consecutive repeating characters in chars:
    //    If the group's length is 1, append the character to s.
    //    Otherwise, append the character followed by the group's length.
    // The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.
    // After you are done modifying the input array, return the new length of the array.
    // You must write an algorithm that uses only constant extra space.
    public static int compress(char[] chars) {
        // [ a a a b b c c c c a a]
        // a3b2c4a2
//        StringBuilder sb = new StringBuilder();
//
//        int counter = 0;
//        for (int i = 0; i < chars.length; i++) {
//            counter++;
//            if (i == chars.length - 1 || chars[i] != chars[i + 1]) {
//                sb.append(chars[i]);
//                if (counter > 1) sb.append(counter);
//                counter = 0;
//            }
//        }
//        String compressed = sb.toString();
//        chars = new char[compressed.length()];
//        int i = 0;
//        for (char compressedLetter : compressed.toCharArray()) {
//            chars[i] = compressedLetter;
//            i++;
//        }
//
//
//        return chars.length;

        int indexAns = 0, index = 0;
        while(index < chars.length){
            char currentChar = chars[index];
            int count = 0;
            while(index < chars.length && chars[index] == currentChar){
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if(count != 1)
                for(char c : Integer.toString(count).toCharArray())
                    chars[indexAns++] = c;
        }
        return indexAns;

    }
}
