package p0102_binary_tree_level_order_traversal;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void levelOrder() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = solution.levelOrder(root);

        assertThat(result)
                .hasSize(3)
                .anySatisfy(group ->
                        assertThat(group).containsExactlyInAnyOrder(3)
                )
                .anySatisfy(group ->
                        assertThat(group).containsExactlyInAnyOrder(9, 20)
                )
                .anySatisfy(group ->
                        assertThat(group).containsExactlyInAnyOrder(15, 7)
                );
    }
}