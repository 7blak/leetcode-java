package p0206_reverse_linked_list;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void reverseList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = solution.reverseList(head);

        assertThat(result.val).isEqualTo(5);
        assertThat(result.next.val).isEqualTo(4);
        assertThat(result.next.next.val).isEqualTo(3);
        assertThat(result.next.next.next.val).isEqualTo(2);
        assertThat(result.next.next.next.next.val).isEqualTo(1);
    }
}