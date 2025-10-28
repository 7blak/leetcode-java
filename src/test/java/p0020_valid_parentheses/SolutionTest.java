package p0020_valid_parentheses;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void test1() {
        String s = "()[]{}";

        boolean result = solution.isValid(s);

        assertThat(result).isTrue();
    }

    @Test
    void test2() {
        String s = "([]{}])";

        boolean result = solution.isValid(s);

        assertThat(result).isFalse();
    }

    @Test
    void test3() {
        String s = "([{}])";

        boolean result = solution.isValid(s);

        assertThat(result).isTrue();
    }
}