package p0024_swap_nodes_in_pairs;

/**
 * <a href="https://leetcode.com/problems/swap-nodes-in-pairs/">24. Swap Nodes in Pairs</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode leading = head.next;
        ListNode trailing = head;
        ListNode previous = null;

        boolean bFirst = true;

        while (leading != null && trailing != null) {
            trailing.next = leading.next;
            leading.next = trailing;

            if (bFirst) {
                bFirst = false;
                head = leading;
            } else {
                previous.next = leading;
            }

            previous = trailing;
            trailing = trailing.next;

            if (trailing != null) {
                leading = trailing.next;
            }
        }

        return head;
    }
}