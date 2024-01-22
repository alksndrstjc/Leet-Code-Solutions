package Stack;

import java.util.Stack;


public class ValidParentheses {

    //TODO Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    // An input string is valid if:
    //    Open brackets must be closed by the same type of brackets.
    //    Open brackets must be closed in the correct order.
    //    Every close bracket has a corresponding open bracket of the same type.
    public static boolean isValid(String s) {
        if (s == null || s.isEmpty() || s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            if (c == '{') stack.push('}');
            if (c == '[') stack.push(']');

            if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || stack.pop() != c) return false;
            }
        }

        return stack.isEmpty();
    }
}
