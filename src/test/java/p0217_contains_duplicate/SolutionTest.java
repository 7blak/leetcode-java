package p0217_contains_duplicate;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {1, 3, 2, 1};

        boolean result = solution.containsDuplicate(nums);

        assertThat(result).isTrue();
    }
}