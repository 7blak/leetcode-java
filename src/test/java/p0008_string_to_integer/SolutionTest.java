package p0008_string_to_integer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void test1() {
        String s = "-21474836482";

        int result = solution.myAtoi(s);

        assertThat(result).isEqualTo(-2147483648);
    }
}