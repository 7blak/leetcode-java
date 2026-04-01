package p0017_letter_combinations_phone_number;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        String digits = "23";

        List<String> result = solution.letterCombinations(digits);

        assertThat(result.toString()).isEqualTo("[ad, ae, af, bd, be, bf, cd, ce, cf]");
    }

    @Test
    void test2() {
        String digits = "2";

        List<String> result = solution.letterCombinations(digits);

        assertThat(result.toString()).isEqualTo("[a, b, c]");
    }
}