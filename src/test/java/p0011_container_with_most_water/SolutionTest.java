package p0011_container_with_most_water;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] arr = {1,8,6,2,5,4,8,3,7};

        int result = solution.maxArea(arr);

        assertThat(result).isEqualTo(49);
    }
}