package p0242_valid_anagram;

import java.util.HashMap;

/**
 * <a href="https://leetcode.com/problems/valid-anagram/description/">242. Valid Anagram</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            Integer result = map.getOrDefault(t.charAt(i), 0);
            if (result <= 0)
                return false;
            map.put(t.charAt(i), result-1);
        }
        return true;
    }
}
