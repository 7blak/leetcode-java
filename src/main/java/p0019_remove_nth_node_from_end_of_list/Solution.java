package p0019_remove_nth_node_from_end_of_list;

/**
 * <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/">19. Remove Nth Node From End of List</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public ListNode removeNthFromEnd(ListNode Head, int n) {
        ListNode savedBefore = null, savedAfter = null, current = Head;
        int count = 0;

        while (current != null) {
            if (savedBefore != null && savedAfter != null) {
                savedBefore = savedBefore.next;
                savedAfter = savedAfter.next;
            } else if (count >= n && savedBefore == null) {
                savedBefore = Head;
                savedAfter = Head.next.next;
            }

            count++;
            current = current.next;
        }

        if (n == 1 && count == 1)
            return null;

        if (savedBefore == null && count > 1)
            return Head.next;

        savedBefore.next = savedAfter;

        return Head;
    }
}