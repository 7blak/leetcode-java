package p0018_4sum;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> result = solution.fourSum(nums, target);

        assertThat(result).containsExactlyInAnyOrder(List.of(-2, -1, 1, 2), List.of(-2, 0, 0, 2), List.of(-1, 0, 0, 1));
    }

    @Test
    void test2() {
        int[] nums = {2, 2, 2, 2, 2};
        int target = 8;

        List<List<Integer>> result = solution.fourSum(nums, target);

        assertThat(result).containsExactlyInAnyOrder(List.of(2,2,2,2));
    }

    @Test
    void test3() {
        int[] nums = {-3, -1, 0, 2, 4, 5};
        int target = 2;

        List<List<Integer>> result = solution.fourSum(nums, target);

        assertThat(result).containsExactlyInAnyOrder(List.of(-3,-1,2,4));
    }
}