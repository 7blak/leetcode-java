package p0016_3sum_closest;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/3sum-closest/description/">16. 3Sum Closest</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length && diff != 0; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - sum) < Math.abs(diff)) {
                    diff = target - sum;
                }
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return target - diff;
    }
}