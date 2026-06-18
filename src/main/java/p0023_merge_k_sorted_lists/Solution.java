package p0023_merge_k_sorted_lists;

/**
 * <a href="https://leetcode.com/problems/merge-k-sorted-lists/">23. Merge k Sorted Lists</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        int currentlyEmpty = 0;
        boolean isListEmpty = true;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                isListEmpty = false;
            } else {
                currentlyEmpty++;
            }
        }

        if (isListEmpty) {
            return null;
        }

        ListNode result = new ListNode();
        ListNode current = result;

        while (currentlyEmpty < lists.length) {
            int currentMin = Integer.MAX_VALUE, arrIndex = -1;

            for (int i = 0; i < lists.length; i++) {
                ListNode currentList = lists[i];
                if (currentList != null && currentList.val < currentMin) {
                    currentMin = currentList.val;
                    arrIndex = i;
                }
            }

            if (arrIndex != -1) {
                current.next = new ListNode(currentMin);
                current = current.next;
                lists[arrIndex] = lists[arrIndex].next;
                if (lists[arrIndex] == null) {
                    currentlyEmpty++;
                }
            }
        }

        return result.next;
    }
}