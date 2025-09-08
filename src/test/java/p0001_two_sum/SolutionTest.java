package p0001_two_sum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Example 1: [2,7,11,15], target=9 -> [0,1]")
    void testExample1() {
        // Given
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};

        // When
        int[] result = solution.twoSum(nums, target);

        // Then
        assertThat(result).containsExactly(expected);
    }

    @Test
    @DisplayName("Example 2: [3,2,4], target=6 -> [1,2]")
    void testExample2() {
        // Given
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};

        // When
        int[] result = solution.twoSum(nums, target);

        // Then
        assertThat(result).containsExactly(expected);
    }

    @Test
    @DisplayName("Example 3: [3,3], target=6 -> [0,1]")
    void testExample3() {
        // Given
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};

        // When
        int[] result = solution.twoSum(nums, target);

        // Then
        assertThat(result).containsExactly(expected);
    }

    @Test
    @DisplayName("Edge case: Two elements array")
    void testTwoElements() {
        // Given
        int[] nums = {1, 2};
        int target = 3;
        int[] expected = {0, 1};

        // When
        int[] result = solution.twoSum(nums, target);

        // Then
        assertThat(result).containsExactly(expected);
    }

    @Test
    @DisplayName("Negative numbers")
    void testNegativeNumbers() {
        // Given
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        int[] expected = {2, 4}; // -3 + -5 = -8

        // When
        int[] result = solution.twoSum(nums, target);

        // Then
        assertThat(result).containsExactly(expected);
    }
}