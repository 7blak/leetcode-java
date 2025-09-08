package p0002_add_two_numbers;

/**
 * <a href="https://leetcode.com/problems/add-two-numbers/description/">2. Add Two Numbers</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode currentNode = result;
        int remainder = 0;

        while (l1 != null || l2 != null || remainder != 0) {
            int sum = remainder;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            remainder = sum / 10;
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;
        }

        return result.next;
    }
}