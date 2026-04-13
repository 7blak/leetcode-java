package p0026_remove_duplicates_from_sorted_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {0, 0, 1, 1, 2, 2, 3, 3, 4};

        int result = solution.removeDuplicates(nums);

        assertThat(result).isEqualTo(5);
        assertThat(nums).containsSubsequence(0, 1, 2, 3, 4);
    }
}