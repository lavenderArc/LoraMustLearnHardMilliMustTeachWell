package com.milli.exercises.leetcode.p001010;

public class Solution005 {
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        int maxBegin = 0, maxEnd = 1;
        for (int i1 = 0; i1 < s.length(); i1++) {
            for (int i2 = i1 + maxEnd - maxBegin + 1; i2 <= s.length(); i2++) {
                if (isRecycle(s, i1, i2)) {
                    maxBegin = i1;
                    maxEnd = i2;
                }
            }
        }

        return s.substring(maxBegin, maxEnd);
    }

    private boolean isRecycle(String s, int begin, int end) {
        while (begin < end) {
            if (s.charAt(begin) != s.charAt(end - 1)) {
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }
}
