package p0015_3sum;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = solution.threeSum(nums);

        assertThat(result.toString()).isEqualTo("[[-1, -1, 2], [-1, 0, 1]]");
    }

    @Test
    void test2() {
        int[] nums = {0, 1, 1};

        List<List<Integer>> result = solution.threeSum(nums);

        assertThat(result.toString()).isEqualTo("[]");
    }

    @Test
    void test3() {
        int[] nums = {0, 0, 0};

        List<List<Integer>> result = solution.threeSum(nums);

        assertThat(result.toString()).isEqualTo("[[0, 0, 0]]");
    }
}