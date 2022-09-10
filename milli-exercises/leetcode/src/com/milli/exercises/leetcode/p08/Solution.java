package com.milli.exercises.leetcode.p08;

import com.milli.exercises.leetcode.utils.AssertUtils;

class Solution {
    public int myAtoi(String s) {
        byte isSigned = 0;
        int start = -1, i;
        for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (start < 0 && isSigned == 0) {
                if (ch == ' ') {
                    continue;
                }
                if (ch == '-') {
                    isSigned = -1;
                    continue;
                }
                if (ch == '+') {
                    isSigned = 1;
                    continue;
                }
            }

            if (ch <= '9' && ch >= '0') {
                start = start < 0 ? i : start;
            } else {
                break;
            }
        }
        int value = 0;
        if (start >= 0) {
            String subDigit = s.substring(start, i);
            try {
                value = Integer.parseInt(subDigit);
            } catch (NumberFormatException e) {
                return isSigned < 0 ? -Integer.MAX_VALUE - 1 : Integer.MAX_VALUE;
            }
        }

        return isSigned < 0 ? -value : value;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(AssertUtils.equals(solution.myAtoi("4211111111111111111111"), 2147483647));
        System.out.println(AssertUtils.equals(solution.myAtoi("     -42"), -42));
        System.out.println(AssertUtils.equals(solution.myAtoi("4193 with words"), 4193));
        System.out.println(AssertUtils.equals(solution.myAtoi("words and 987"), 0));
        System.out.println(AssertUtils.equals(solution.myAtoi("-91283472332"), -2147483648));
        System.out.println(AssertUtils.equals(solution.myAtoi("+1"), 1));
        System.out.println(AssertUtils.equals(solution.myAtoi("+-12"), 0));
        System.out.println(AssertUtils.equals(solution.myAtoi("++12"), 0));
        System.out.println(AssertUtils.equals(solution.myAtoi("--12"), 0));
        System.out.println(AssertUtils.equals(solution.myAtoi("00000000-12"), 0));
        System.out.println(AssertUtils.equals(solution.myAtoi("00000000+12"), 0));
        System.out.println(AssertUtils.equals(solution.myAtoi("  +0 12"), 0));
        System.out.println(AssertUtils.equals(solution.myAtoi("  + 12"), 0));
    }
}
