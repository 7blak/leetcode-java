package p0004_median_of_two_arrays;

import java.util.ArrayList;

/**
 * <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">4. Median of Two Sorted Arrays</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, medianIndex = (nums1.length + nums2.length) / 2;
        double median;
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            if (i >= nums1.length) {
                while (j < nums2.length) {
                    list.add(nums2[j++]);
                }
                break;
            } else if (j >= nums2.length) {
                while (i < nums1.length) {
                    list.add(nums1[i++]);
                }
                break;
            }

            if (nums1[i] < nums2[j]) {
                list.add(nums1[i++]);
            } else {
                list.add(nums2[j++]);
            }
        }

        if ((nums1.length + nums2.length) % 2 == 0) {
            median = (list.get(medianIndex - 1) + list.get(medianIndex)) / 2.0;
        } else {
            median = list.get(medianIndex);
        }

        return median;
    }
}