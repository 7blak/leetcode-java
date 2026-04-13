package p0026_remove_duplicates_from_sorted_array;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">26. Remove Duplicates from Sorted Array</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        int uniqueElements = 1;
        int point = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                point++;
                uniqueElements++;
                nums[point] = nums[i + 1];
            }
        }

        return uniqueElements;
    }
}