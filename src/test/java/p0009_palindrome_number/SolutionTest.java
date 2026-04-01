package p0009_palindrome_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int x = 121;

        boolean result = solution.isPalindrome(x);

        assertThat(result).isTrue();
    }

    @Test
    void test2() {
        int x = -121;

        boolean result = solution.isPalindrome(x);

        assertThat(result).isFalse();
    }

    @Test
    void test3() {
        int x = 10;

        boolean result = solution.isPalindrome(x);

        assertThat(result).isFalse();
    }
}