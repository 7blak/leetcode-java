package p0206_reverse_linked_list;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/reverse-linked-list/description/">206. Reverse Linked List</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}