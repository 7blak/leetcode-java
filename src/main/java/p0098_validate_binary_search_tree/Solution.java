package p0098_validate_binary_search_tree;

/**
 * <a href="https://leetcode.com/problems/validate-binary-search-tree/description/">98. Validate Binary Search Tree</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;

        return recurse(root.left, root.val, Long.MIN_VALUE) && recurse(root.right, Long.MAX_VALUE, root.val);
    }

    private boolean recurse(TreeNode curr, long currentMax, long currentMin) {
        if (curr == null)
            return true;
        if ((curr.val <= currentMin) || (curr.val >= currentMax))
            return false;
        return recurse(curr.left, curr.val, currentMin) && recurse(curr.right, currentMax, curr.val);
    }
}