package p0141_linked_list_cycle;

import java.util.HashSet;

/**
 * <a href="https://leetcode.com/problems/linked-list-cycle/">141. Linked List Cycle</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> encountered = new HashSet<>();
        while (head != null) {
            if (encountered.contains(head))
                return true;
            encountered.add(head);
            head = head.next;
        }
        return false;
    }
}