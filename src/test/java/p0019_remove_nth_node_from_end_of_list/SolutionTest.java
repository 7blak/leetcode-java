package p0019_remove_nth_node_from_end_of_list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    private List<Integer> toList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list;
    }

    @Test
    void test1() {
        ListNode ls = new ListNode(1);
        ls.next = new ListNode(2);
        ls.next.next = new ListNode(3);
        ls.next.next.next = new ListNode(4);
        ls.next.next.next.next = new ListNode(5);

        ListNode result = solution.removeNthFromEnd(ls, 2);

        assertThat(toList(result)).containsExactly(1, 2, 3, 5);
    }

    @Test
    void test2() {
        ListNode ls = new ListNode(1);

        ListNode result = solution.removeNthFromEnd(ls, 1);

        assertThat(toList(result)).containsExactly();
    }

    @Test
    void test3() {
        ListNode ls = new ListNode(1);
        ls.next = new ListNode(2);

        ListNode result = solution.removeNthFromEnd(ls, 1);

        assertThat(toList(result)).containsExactly(1);
    }
}