package p0007_reverse_integer;

/**
 * <a href="https://leetcode.com/problems/reverse-integer/description/">7. Reverse Integer</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {
    public int reverse(int x) {
        int[] limit = {2,1,4,7,4,8,3,6,4,8};
        boolean isNegative = x < 0;
        x = isNegative ? -x : x;

        int result = 0, multiplier = 10, counter = 0;

        while (x > 0) {
            if (counter > 9)
                return 0;
            int num = x % 10;
            x /= 10;
            if (counter >= 9) {
                int checkResult = result, currentIndex = 0;
                for (int i = limit.length - 1; i >= 0; i--) {
                    int num2 = (int) (checkResult / Math.pow(10, i - 1)) % 10;
                    if (num2 > limit[currentIndex]) {
                        return 0;
                    } else if (num2 < limit[currentIndex]) {
                        break;
                    }
                    currentIndex++;
                }
            }
            result *= multiplier;
            result += num;
            counter++;
        }

        return isNegative ? -result : result;
    }
}