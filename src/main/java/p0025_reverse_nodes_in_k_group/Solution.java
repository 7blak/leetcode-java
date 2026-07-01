package p0025_reverse_nodes_in_k_group;

/**
 * <a href="https://leetcode.com/problems/reverse-nodes-in-k-group/">25. Reverse Nodes in k-Group</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroupTail = dummy;

        while (true) {
            ListNode kthNode = getKthNode(prevGroupTail, k);

            if (kthNode == null) {
                break;
            }

            ListNode nextGroupHead = kthNode.next;

            ListNode curr = prevGroupTail.next;
            ListNode prev = nextGroupHead;

            while (curr != nextGroupHead) {
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }

            ListNode tailOfReversedGroup = prevGroupTail.next;
            prevGroupTail.next = kthNode;
            prevGroupTail = tailOfReversedGroup;
        }

        return dummy.next;
    }

    private ListNode getKthNode(ListNode curr, int k) {
        while (curr != null && k-- > 0) {
            curr = curr.next;
        }

        return curr;
    }
}