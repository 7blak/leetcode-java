package p0006_zigzag_conversion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Example 1: s = \"PAYPALISHIRING\", numRows = 3 --> \"PAHNAPLSIIGYIR\"")
    void test1() {
        String s = "PAYPALISHIRING";
        int numRows = 3;

        String result = solution.convert(s, numRows);

        assertThat(result).isEqualTo("PAHNAPLSIIGYIR");
    }
}