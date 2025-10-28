package p0704_binary_search;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/binary-search/description/">704. Binary Search</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {
    public int search(int[] nums, int target) {
        return recurse(nums, target, 0);
    }

    public int recurse(int[] nums, int target, int offset) {
        int half = nums.length / 2;
        if (nums.length == 0) {
            return -1;
        } else if (nums[half] == target) {
            return offset + half;
        } else if (nums[half] < target) {
            return recurse(Arrays.copyOfRange(nums, half + 1, nums.length), target, offset + half + 1);
        } else {
            return recurse(Arrays.copyOfRange(nums, 0, half), target, offset);
        }
    }
}