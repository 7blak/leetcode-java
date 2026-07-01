package p0024_swap_nodes_in_pairs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode result = solution.swapPairs(head);

        assertThat(result.toString()).isEqualTo("2143");
    }

    @Test
    void test2() {
        ListNode head = null;

        ListNode result = solution.swapPairs(head);

        assertThat(result).isNull();
    }

    @Test
    void test3() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode result = solution.swapPairs(head);

        assertThat(result.toString()).isEqualTo("213");
    }
}