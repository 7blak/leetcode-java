package p0023_merge_k_sorted_lists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void test1() {
        ListNode[] arr = new ListNode[3];

        arr[0] = new ListNode(1);
        arr[0].next = new ListNode(4);
        arr[0].next.next = new ListNode(5);

        arr[1] = new ListNode(1);
        arr[1].next = new ListNode(3);
        arr[1].next.next = new ListNode(4);

        arr[2] = new ListNode(2);
        arr[2].next = new ListNode(6);

        ListNode result = solution.mergeKLists(arr);

        assertThat(result.toString()).isEqualTo("11234456");
    }

    @Test
    void test2() {
        ListNode[] arr = null;

        ListNode result = solution.mergeKLists(arr);

        assertThat(result).isNull();
    }

    @Test
    void test3() {
        ListNode[] arr = new ListNode[1];

        ListNode result = solution.mergeKLists(arr);

        assertThat(result).isNull();
    }

    @Test
    void test4() {
        ListNode[] arr = new ListNode[2];
        arr[1]  = new ListNode(1);

        ListNode result = solution.mergeKLists(arr);

        assertThat(result.toString()).isEqualTo("1");
    }

    @Test
    void test5() {
        ListNode[] arr = new ListNode[3];
        arr[0]  = new ListNode(2);
        arr[2] = new ListNode(-1);

        ListNode result = solution.mergeKLists(arr);

        assertThat(result.toString()).isEqualTo("-12");
    }
}