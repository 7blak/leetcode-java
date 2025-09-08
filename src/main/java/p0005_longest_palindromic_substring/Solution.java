package p0005_longest_palindromic_substring;

/**
 * <a href="https://leetcode.com/problems/longest-palindromic-substring/">5. Longest Palindromic Substring</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {
    public String longestPalindrome(String s) {
        StringBuilder currentString = new StringBuilder();
        String result = s.charAt(0) + "";

        for (int left = 0; left < s.length(); left++) {
            currentString.append(s.charAt(left));
            for (int right = left + 1; right < s.length(); right++) {
                currentString.append(s.charAt(right));
                if (currentString.toString().length() > result.length() && isPalindrome(currentString.toString())) {
                    result = currentString.toString();
                }
            }
            currentString = new StringBuilder();
        }

        return result;
    }

    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}