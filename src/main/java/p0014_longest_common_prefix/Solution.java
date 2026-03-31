package p0014_longest_common_prefix;

/**
 * <a href="https://leetcode.com/problems/longest-common-prefix/">14. Longest Common Prefix</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {

    public String longestCommonPrefix(String[] strs) {
        int maxLength = Integer.MAX_VALUE;
        String shortest = null;

        for (String s : strs) {
            if (s.length() < maxLength) {
                maxLength = s.length();
                shortest = s;
            }
        }

        if (shortest == null)
            return "";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < maxLength; i++) {
            for (String s : strs) {
                if (s.charAt(i) != shortest.charAt(i)) {
                    return sb.toString();
                }
            }

            sb.append(shortest.charAt(i));
        }

        return sb.toString();
    }
}