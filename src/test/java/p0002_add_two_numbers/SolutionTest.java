package p0002_add_two_numbers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Example 1: l1 = [2,4,3], l2 = [5,6,4]")
    void addTwoNumbers() {
        ListNode l111 = new ListNode(3);
        ListNode l11 = new ListNode(4, l111);
        ListNode l1 = new ListNode(2, l11);

        ListNode l222 = new ListNode(4);
        ListNode l22 = new ListNode(6, l222);
        ListNode l2 = new ListNode(5, l22);

        ListNode result = solution.addTwoNumbers(l1, l2);

        assertThat(result.toString()).isEqualTo("708");
    }

}