package p0226_invert_binary_tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void invertTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode result = solution.invertTree(root);

        root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        assertThat(result.left.val).isEqualTo(root.right.val);
        assertThat(result.right.val).isEqualTo(root.left.val);
        assertThat(result.left.left.val).isEqualTo(root.right.right.val);
        assertThat(result.left.right.val).isEqualTo(root.right.left.val);
        assertThat(result.right.left.val).isEqualTo(root.left.right.val);
        assertThat(result.right.right.val).isEqualTo(root.left.left.val);
    }

}