package p0104_maximum_depth_of_binary_tree;

/**
 * <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/">104. Maximum Depth of Binary Tree</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        return recurse(root, 1);
    }

    public int recurse(TreeNode curr, int depth) {
        if (curr == null) {
            return 0;
        }
        int maxDepthLeft = 1, maxDepthRight = 1;
        if (curr.left != null) {
            maxDepthLeft = recurse(curr.left, depth + 1);
        }
        if (curr.right != null) {
            maxDepthRight = recurse(curr.right, depth + 1);
        }
        return Math.max(Math.max(maxDepthLeft, maxDepthRight), depth);
    }
}