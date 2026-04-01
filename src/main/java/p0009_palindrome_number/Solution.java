package p0009_palindrome_number;

/**
 * <a href="https://leetcode.com/problems/palindrome-number/">9. Palindrome Number</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {

    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }

        return true;
    }
}