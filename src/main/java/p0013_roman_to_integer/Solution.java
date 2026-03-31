package p0013_roman_to_integer;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/roman-to-integer/">13. Roman to Integer</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {

    static Map<String, Integer> values = new HashMap<>();

    static {
        values.put("M", 1000);
        values.put("D", 500);
        values.put("C", 100);
        values.put("L", 50);
        values.put("X", 10);
        values.put("V", 5);
        values.put("I", 1);
    }

    public int romanToInt(String s) {
        String lastSymbol = s.substring(s.length() - 1);
        int lastValue = values.get(lastSymbol);
        int total = lastValue;

        for (int i = s.length() - 2; i >= 0; i--) {
            int currentValue = values.get(s.substring(i, i + 1));
            if (currentValue < lastValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            lastValue = currentValue;
        }

        return total;
    }
}