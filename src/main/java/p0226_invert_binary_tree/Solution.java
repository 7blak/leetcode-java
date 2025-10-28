package p0226_invert_binary_tree;

/**
 * <a href="https://leetcode.com/problems/invert-binary-tree/description/">226. Invert Binary Tree</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        if (root.left != null) {
            invertTree(root.left);
        }

        if (root.right != null) {
            invertTree(root.right);
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}