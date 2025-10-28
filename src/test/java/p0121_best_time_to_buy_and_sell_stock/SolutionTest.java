package p0121_best_time_to_buy_and_sell_stock;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void maxProfit() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};

        int result = solution.maxProfit(prices);

        assertThat(result).isEqualTo(5);
    }
}