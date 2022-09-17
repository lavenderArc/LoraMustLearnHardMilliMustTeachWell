package com.milli.exercises.leetcode.p001010;

class Solution008 {
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
}
