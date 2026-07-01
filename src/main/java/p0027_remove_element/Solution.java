package p0027_remove_element;

/**
 * <a href="https://leetcode.com/problems/remove-element/">27. Remove Element</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int left = 0, right = 0;
        while (right < nums.length) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }

            right++;
        }

        return left;
    }
}