package p0003_longest_substring;

import java.util.HashMap;
import java.util.HashSet;

/**
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">3. Longest Substring Without Repeating Characters</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> encountered = new HashMap<>();
        int maxLength = 0, currentLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (encountered.containsKey(s.charAt(i))) {
                i = encountered.get(s.charAt(i));
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 0;
                encountered.clear();
            } else {
                encountered.put(s.charAt(i), i);
                currentLength++;
            }
        }

        return Math.max(maxLength, currentLength);
    }
}