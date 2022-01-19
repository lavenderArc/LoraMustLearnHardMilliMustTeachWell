package com.milli.exercises.leetcode.p05;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("babad"));
        System.out.println(solution.longestPalindrome("cbbd"));
        System.out.println(solution.longestPalindrome("a"));
        System.out.println(solution.longestPalindrome("ac"));
        System.out.println(solution.longestPalindrome("bb"));
    }

    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        int maxBegin = 0, maxEnd = 1;
        for (int i1 = 0; i1 < s.length(); i1++) {
            for (int i2 = i1 + maxEnd - maxBegin + 1; i2 <= s.length(); i2++) {
                if (isRecycle(s, i1, i2) && i2 - i1 > maxEnd - maxBegin) {
                    maxBegin = i1;
                    maxEnd = i2;
                }
            }
        }

        return s.substring(maxBegin, maxEnd);
    }

    private boolean isRecycle(String s, int begin, int end) {
        String s1 = s.substring(begin, (end + begin) / 2);
        String s2 = s.substring((end + begin) / 2, end);
        return s1.matches(s2);
    }
}
