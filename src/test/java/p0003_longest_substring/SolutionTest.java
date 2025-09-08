package p0003_longest_substring;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Example 1: s = \"abcabcbb\"")
    void testExample1() {
        String s = "abcabcbb";

        int result = solution.lengthOfLongestSubstring(s);

        assertThat(result).isEqualTo(3);
    }

    @Test
    @DisplayName("Example 2: s = \"bbbbb\"")
    void testExample2() {
        String s = "bbbbb";

        int result = solution.lengthOfLongestSubstring(s);

        assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName("Example 3: s = \"pwwkew\"")
    void testExample3() {
        String s = "pwwkew";

        int result = solution.lengthOfLongestSubstring(s);

        assertThat(result).isEqualTo(3);
    }

    @Test
    @DisplayName("Example 4: s = \"abcdaefghijkl\"")
    void testExample4() {
        String s = "abcdaefghijkl";

        int result = solution.lengthOfLongestSubstring(s);

        assertThat(result).isEqualTo(12);
    }
}