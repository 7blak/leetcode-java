package p0049_group_anagrams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void groupAnagrams() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result = solution.groupAnagrams(strs);

        assertThat(result)
                .hasSize(3) // We expect 3 groups
                .anySatisfy(group ->
                        assertThat(group).containsExactlyInAnyOrder("eat", "tea", "ate")
                )
                .anySatisfy(group ->
                        assertThat(group).containsExactlyInAnyOrder("tan", "nat")
                )
                .anySatisfy(group ->
                        assertThat(group).containsExactlyInAnyOrder("bat")
                );
    }
}