package p0200_number_of_islands;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void test1() {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        int result = solution.numIslands(grid);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void test2() {
        char[][] grid = {
                {'1', '1', '1', '0', '1'},
                {'1', '1', '0', '1', '1'},
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '1', '1'}
        };

        int result = solution.numIslands(grid);

        assertThat(result).isEqualTo(3);
    }
}