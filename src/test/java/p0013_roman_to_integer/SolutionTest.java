package p0013_roman_to_integer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void test1() {
        String s = "III";

        int result = solution.romanToInt(s);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void test2() {
        String s ="LVIII";

        int result = solution.romanToInt(s);

        assertThat(result).isEqualTo(58);
    }

    @Test
    void test3() {
        String s = "MCMXCIV";

        int result = solution.romanToInt(s);

        assertThat(result).isEqualTo(1994);
    }
}