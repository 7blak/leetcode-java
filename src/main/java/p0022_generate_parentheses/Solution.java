package p0022_generate_parentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/generate-parentheses/description/">22. Generate Parentheses</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtracking(result, new StringBuilder(), 0, 0, n);

        return result;
    }

    private void backtracking(List<String> result, StringBuilder curString, int leftCount, int rightCount, int n) {
        if (curString.length() == 2 * n) {
            result.add(curString.toString());
            return;
        }

        if (leftCount < n) {
            curString.append("(");
            backtracking(result, curString, leftCount + 1, rightCount, n);
            curString.deleteCharAt(curString.length() - 1);
        }

        if (leftCount > rightCount) {
            curString.append(")");
            backtracking(result, curString, leftCount, rightCount + 1, n);
            curString.deleteCharAt(curString.length() - 1);
        }
    }
}