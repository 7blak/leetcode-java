package p0012_integer_to_roman;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void test1() {
        int num = 3749;

        String result = solution.intToRoman(num);

        assertThat(result).isEqualTo("MMMDCCXLIX");
    }

    @Test
    void test2() {
        int num = 58;

        String result = solution.intToRoman(num);

        assertThat(result).isEqualTo("LVIII");
    }

    @Test
    void test3() {
        int num = 1994;

        String result = solution.intToRoman(num);

        assertThat(result).isEqualTo("MCMXCIV");
    }
}