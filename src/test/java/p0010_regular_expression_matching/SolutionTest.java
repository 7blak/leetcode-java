package p0010_regular_expression_matching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void test1() {
        String s = "aaabbbbbbccd";
        String p = "aaab*.cd";

        boolean result = solution.isMatch(s, p);

        assertThat(result).isTrue();
    }

    @Test
    void test2() {
        String s = "aa";
        String p = "a";

        boolean result = solution.isMatch(s, p);

        assertThat(result).isFalse();
    }

    @Test
    void test3() {
        String s = "aab";
        String p = "c*a*b";

        boolean result = solution.isMatch(s, p);

        assertThat(result).isTrue();
    }

    @Test
    void test4() {
        String s = "aaa";
        String p = "ab*ac*a";

        boolean result = solution.isMatch(s, p);

        assertThat(result).isTrue();
    }

    @Test
    void test5() {
        String s = "a";
        String p = "ab*a";

        boolean result = solution.isMatch(s, p);

        assertThat(result).isFalse();
    }

    @Test
    void test6() {
        String s = "aaa";
        String p = "ab*a*c*a";

        boolean result = solution.isMatch(s, p);

        assertThat(result).isTrue();
    }
}