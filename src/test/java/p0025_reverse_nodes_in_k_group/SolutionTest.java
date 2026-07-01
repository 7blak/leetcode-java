package p0025_reverse_nodes_in_k_group;

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
        head.next.next.next.next = new ListNode(5);

        ListNode result = solution.reverseKGroup(head, 2);

        assertThat(result.toString()).isEqualTo("21435");
    }

    @Test
    void test2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = solution.reverseKGroup(head, 3);

        assertThat(result.toString()).isEqualTo("32145");
    }

}