package p0027_remove_element;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {3, 2, 2, 3};

        int result = solution.removeElement(nums, 3);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void test2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};

        int result = solution.removeElement(nums, 2);

        assertThat(result).isEqualTo(5);
    }

    @Test
    void test3() {
        int[] nums = {1};

        int result = solution.removeElement(nums, 1);

        assertThat(result).isEqualTo(0);
    }
}