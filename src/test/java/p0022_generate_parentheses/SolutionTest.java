package p0022_generate_parentheses;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void test1() {
        int n = 3;

        List<String> result = solution.generateParenthesis(n);

        assertThat(result).containsExactlyInAnyOrder("((()))", "(()())", "(())()", "()(())", "()()()");
    }

    @Test
    void test2() {
        int n = 1;

        List<String> result = solution.generateParenthesis(n);

        assertThat(result).containsExactlyInAnyOrder("()");
    }
}