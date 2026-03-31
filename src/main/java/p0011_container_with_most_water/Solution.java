package p0011_container_with_most_water;

/**
 * <a href="https://leetcode.com/problems/container-with-most-water/">11. Container With Most Water</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int diff = right - left;

            int area = diff * Math.min(height[left], height[right]);

            if (area > maxArea)
                maxArea = area;

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
