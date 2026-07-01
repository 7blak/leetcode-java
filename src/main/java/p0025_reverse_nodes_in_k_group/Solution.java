package p0025_reverse_nodes_in_k_group;

/**
 * <a href="https://leetcode.com/problems/reverse-nodes-in-k-group/">25. Reverse Nodes in k-Group</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }

        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode curr = head;
        ListNode originalHead = prev;

        while (curr != null) {
            if (getListLength(curr) < k) {
                break;
            }

            prev.next = reverseList(curr, k);
            prev = advanceKNodes(prev, k);
            curr = curr.next;
        }

        return originalHead.next;
    }

    private ListNode reverseList(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        if (k == 1) {
            return head;
        }

        int counter = 0;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while (counter < k) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
            counter++;
        }

        advanceKNodes(prev, k - 1).next = curr;

        return prev;
    }

    private int getListLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }

        return length;
    }

    private ListNode advanceKNodes(ListNode head, int k) {
        int counter = 0;
        ListNode curr = head;

        while (counter++ < k && curr != null) {
            curr = curr.next;
        }

        return curr;
    }
}