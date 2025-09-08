package p0001_two_sum;
/**
 * <a href="https://leetcode.com/problems/two-sum/">1. Two Sum</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i, j;
        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}