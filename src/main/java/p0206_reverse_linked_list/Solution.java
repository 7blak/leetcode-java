package p0206_reverse_linked_list;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/reverse-linked-list/description/">206. Reverse Linked List</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return head;
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        ListNode reverse = new ListNode(stack.pop());
        ListNode temp = reverse;

        while (!stack.isEmpty()) {
            temp.next = new ListNode(stack.pop());
            temp = temp.next;
        }

        return reverse;
    }
}