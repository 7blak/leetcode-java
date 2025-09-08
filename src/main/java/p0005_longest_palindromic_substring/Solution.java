package p0005_longest_palindromic_substring;

/**
 * <a href="https://leetcode.com/problems/longest-palindromic-substring/">5. Longest Palindromic Substring</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {
    public String longestPalindrome(String s) {
        StringBuilder currentString = new StringBuilder();
        String result = "";
        boolean flag = false;

        for (int lstart = 0; lstart < s.length() && s.length() - lstart > result.length(); lstart++) {
            int left = lstart;
            for (int rstart = s.length() - 1; rstart >= lstart; rstart--) {
                int right = rstart;

                while (left <= right && s.charAt(left) == s.charAt(right)) {
                    if (left == right)
                        flag = true;
                    currentString.append(s.charAt(left++));
                    right--;
                }
                if (left > right) {
                    break;
                } else {
                    currentString.setLength(0);
                    left = lstart;
                }
            }

            if (!flag) {
                StringBuilder helper = new StringBuilder(currentString);
                helper.append(currentString.reverse());
                result = helper.toString().length() > result.length() ? helper.toString() : result;
            } else {
                StringBuilder helper = new StringBuilder(currentString);
                helper.append(currentString.reverse(), 1, currentString.length());
                result = helper.toString().length() > result.length() ? helper.toString() : result;
            }
            currentString.setLength(0);
            flag = false;
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