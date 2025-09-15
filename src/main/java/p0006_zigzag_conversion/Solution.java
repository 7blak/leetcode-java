package p0006_zigzag_conversion;

import java.util.HashMap;

 /**
 * <a href="https://leetcode.com/problems/zigzag-conversion/">6. Zigzag Conversion</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {
    public String convert(String s, int numRows) {
        HashMap<Integer, StringBuilder> rowStrings = new HashMap<>();

        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        for (int i = 0; i < numRows; i++) {
            rowStrings.put(i, new StringBuilder());
        }

        int currentIndex = 0;
        boolean decreaseIndex = false;
        for (int i = 0; i < s.length(); i++) {
            rowStrings.get(currentIndex).append(s.charAt(i));
            currentIndex += decreaseIndex ? -1 : 1;

            if (currentIndex == numRows) {
                decreaseIndex = true;
                currentIndex -= 2;
            }

            if (currentIndex <= 0) {
                currentIndex = 0;
                decreaseIndex = false;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            result.append(rowStrings.get(i));
        }

        return result.toString();
    }
}