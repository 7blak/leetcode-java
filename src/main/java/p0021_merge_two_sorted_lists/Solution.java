package p0021_merge_two_sorted_lists;

/**
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists/description/">21. Merge Two Sorted Lists</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode result = new ListNode(Math.min(list1.val, list2.val));
        ListNode temp = result;
        if (list1.val <= list2.val) {
            list1 = list1.next;
        } else {
            list2 = list2.next;
        }

        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    temp.next = new ListNode(list1.val);
                    temp = temp.next;
                    list1 = list1.next;
                } else {
                    temp.next = new ListNode(list2.val);
                    temp = temp.next;
                    list2 = list2.next;
                }
            } else if (list1 != null) {
                temp.next = new ListNode(list1.val);
                temp = temp.next;
                list1 = list1.next;
            } else {
                temp.next = new ListNode(list2.val);
                temp = temp.next;
                list2 = list2.next;
            }
        }

        return result;
    }
}