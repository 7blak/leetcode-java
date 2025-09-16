package p0008_string_to_integer;

/**
 * <a href="https://leetcode.com/problems/string-to-integer-atoi/">8. String to Integer (atoi)</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {
    public int myAtoi(String s) {
        int result = 0, sign = 1;

        s = s.stripLeading();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i == 0 && (c == '-')) {
                sign = 0;
            } else if (!(i == 0 && (c == '+'))) {
                if (!Character.isDigit(c)) {
                    break;
                }
                int num = Character.getNumericValue(c);
                if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && num > 7)) {
                    result = sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    return result;
                }
                result = result * 10 + num;
            }
        }

        return sign == 1 ? result : -result;
    }
}