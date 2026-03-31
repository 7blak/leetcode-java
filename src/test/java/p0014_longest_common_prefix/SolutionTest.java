package p0014_longest_common_prefix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void test1() {
        String[] strs = {"flower", "flow", "flight"};

        String result = solution.longestCommonPrefix(strs);

        assertThat(result).isEqualTo("fl");
    }

    @Test
    void test2() {
        String[] strs = {"dog", "racecar", "car"};

        String result = solution.longestCommonPrefix(strs);

        assertThat(result).isEqualTo("");
    }
}