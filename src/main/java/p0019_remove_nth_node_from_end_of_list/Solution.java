package p0019_remove_nth_node_from_end_of_list;

/**
 * <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/">19. Remove Nth Node From End of List</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public ListNode removeNthFromEnd(ListNode Head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = Head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}