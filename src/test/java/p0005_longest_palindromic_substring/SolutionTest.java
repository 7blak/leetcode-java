package p0005_longest_palindromic_substring;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Example 1: s = \"babad\" --> \"bab\"")
    void test1() {
        String s = "babad";

        String result = solution.longestPalindrome(s);

        assertThat(result).isIn("bab", "aba");
    }

    @Test
    @DisplayName("Example 2: s = \"cbbd\" --> \"bb\"")
    void test2() {
        String s = "cbbd";

        String result = solution.longestPalindrome(s);

        assertThat(result).isEqualTo("bb");
    }

    @Test
    @DisplayName("Example 3: s = \"bacabab\" --> \"bacab\"")
    void test3() {
        String s = "bacabab";

        String result = solution.longestPalindrome(s);

        assertThat(result).isEqualTo("bacab");
    }
}