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
        HashSet<Character> encountered = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            while (encountered.contains(c)) {
                encountered.remove(s.charAt(left));
                left++;
            }
            encountered.add(c);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}