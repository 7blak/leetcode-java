package p0016_3sum_closest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {-1, 2, 1, -4};

        int result = solution.threeSumClosest(nums, 1);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void test2() {
        int[] nums = {0, 0, 0};

        int result = solution.threeSumClosest(nums, 1);

        assertThat(result).isEqualTo(0);
    }
}