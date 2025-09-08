package p0004_median_of_two_arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Example 1: nums1 = [1,3], nums2 = [2] --> [1,2,3], median is 2")
    void findMedianSortedArrays1() {
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2};

        double result = solution.findMedianSortedArrays(nums1, nums2);

        assertThat(result).isEqualTo(2);
    }

    @Test
    @DisplayName("Example 2: nums1 = [1,2], nums2 = [3,4] --> [1,2,3,4], median is 2.5")
    void findMedianSortedArrays2() {
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};

        double result = solution.findMedianSortedArrays(nums1, nums2);

        assertThat(result).isEqualTo(2.5);
    }
}