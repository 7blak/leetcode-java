package p0021_merge_two_sorted_lists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void mergeTwoLists() {
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(4);

        ListNode b = new ListNode(1);
        b.next = new ListNode(3);
        b.next.next = new ListNode(5);

        ListNode result = solution.mergeTwoLists(a, b);

        assertThat(result.toString()).isEqualTo("1123345");
    }
}