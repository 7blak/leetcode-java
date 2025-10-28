package p0020_valid_parentheses;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/valid-parentheses/">20. Valid Parentheses</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;
                char c1 = stack.pop();
                if (!((c1 == '(' && c == ')') || (c1 == '[' && c == ']') || (c1 == '{' && c == '}')))
                    return false;
            }
        }
        return stack.isEmpty();
    }
}