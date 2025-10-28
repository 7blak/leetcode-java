package p0704_binary_search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void search() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int result = solution.search(nums, target);
        assertThat(result).isEqualTo(4);
    }
}