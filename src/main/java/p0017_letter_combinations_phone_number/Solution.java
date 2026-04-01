package p0017_letter_combinations_phone_number;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/">17. Letter Combinations of a Phone Number</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {
    private static final Map<Integer, List<Character>> map = new HashMap<>();

    static {
        map.put(2, List.of('a', 'b', 'c'));
        map.put(3, List.of('d', 'e', 'f'));
        map.put(4, List.of('g', 'h', 'i'));
        map.put(5, List.of('j', 'k', 'l'));
        map.put(6, List.of('m', 'n', 'o'));
        map.put(7, List.of('p', 'q', 'r', 's'));
        map.put(8, List.of('t', 'u', 'v'));
        map.put(9, List.of('w', 'x', 'y', 'z'));
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        recurse(result, sb, digits);

        return result;
    }

    public void recurse(List<String> list, StringBuilder sb, String digits) {
        if (digits.isEmpty()) {
            list.add(sb.toString());
            return;
        }

        List<Character> currentChars = map.get(Character.getNumericValue(digits.charAt(0)));

        for (char current : currentChars) {
            sb.append(current);
            recurse(list, sb, digits.substring(1));
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}