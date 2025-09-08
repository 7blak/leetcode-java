package p0005_longest_palindromic_substring;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void testIsPalindrome() {
        String s = "abba";

        boolean result = solution.isPalindrome(s);

        assertThat(result).isTrue();

        String s2 = "aba";

        boolean result2 = solution.isPalindrome(s2);

        assertThat(result2).isTrue();

        String s3 = "abca";

        boolean result3 = solution.isPalindrome(s3);

        assertThat(result3).isFalse();
    }

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
}