package p0141_linked_list_cycle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void hasCycle() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next;

        boolean result = solution.hasCycle(head);

        assertThat(result).isTrue();
    }

    @Test
    void hasCycle2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        boolean result = solution.hasCycle(head);

        assertThat(result).isFalse();
    }
}