package p0012_integer_to_roman;

/**
 * <a href="https://leetcode.com/problems/integer-to-roman/">12. Integer to Roman</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            if (num >= 1000) {
                int mult = num / 1000;
                for (int i = 0; i < mult; i++) {
                    sb.append("M");
                    num -= 1000;
                }
            } else if (num >= 900) {
                sb.append("CM");
                num -= 900;
            } else if (num >= 500) {
                sb.append("D");
                num -= 500;
            } else if (num >= 400) {
                sb.append("CD");
                num -= 400;
            } else if (num >= 100) {
                int mult = num / 100;
                for (int i = 0; i < mult; i++) {
                    sb.append("C");
                    num -= 100;
                }
            } else if (num >= 90) {
                sb.append("XC");
                num -= 90;
            } else if (num >= 50) {
                sb.append("L");
                num -= 50;
            } else if (num >= 40) {
                sb.append("XL");
                num -= 40;
            } else if (num >= 10) {
                int mult = num / 10;
                for (int i = 0; i < mult; i++) {
                    sb.append("X");
                    num -= 10;
                }
            } else if (num >= 9) {
                sb.append("IX");
                num -= 9;
            } else if (num >= 5) {
                sb.append("V");
                num -= 5;
            } else if (num >= 4) {
                sb.append("IV");
                num -=4;
            } else {
                for (int i = 0; i < num; i++) {
                    sb.append("I");
                    num -= 1;
                }
            }
        }

        return sb.toString();
    }
}