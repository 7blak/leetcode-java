package p0242_valid_anagram;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void validAnagram() {
        String t = "carrace";
        String s = "racecar";

        boolean result = solution.isAnagram(s, t);

        assertThat(result).isTrue();
    }
}