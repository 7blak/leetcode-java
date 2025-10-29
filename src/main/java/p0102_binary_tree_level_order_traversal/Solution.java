package p0102_binary_tree_level_order_traversal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/binary-tree-level-order-traversal/description/">102. Binary Tree Level Order Traversal</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {
    private final HashMap<Integer, List<Integer>> levelValues = new HashMap<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        dfs(root, 0);
        return new ArrayList<>(levelValues.values());
    }

    private void dfs (TreeNode node, int level) {
        if (node == null) {
            return;
        }

        if (!levelValues.containsKey(level)) {
            levelValues.put(level, new ArrayList<>());
        }
        levelValues.get(level).add(node.val);

        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
    }
}