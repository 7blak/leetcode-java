package p0007_reverse_integer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void test1() {
        int x = 123;

        int result = solution.reverse(x);

        assertThat(result).isEqualTo(321);
    }

    @Test
    void test2() {
        int x = 1534236469;

        int result = solution.reverse(x);

        assertThat(result).isEqualTo(0);
    }

    @Test
    void test3() {
        int x = -2147483412;

        int result = solution.reverse(x);

        assertThat(result).isEqualTo(-2143847412);
    }

    @Test
    void test4() {
        int x = 1563847412;

        int result = solution.reverse(x);

        assertThat(result).isEqualTo(0);
    }
}