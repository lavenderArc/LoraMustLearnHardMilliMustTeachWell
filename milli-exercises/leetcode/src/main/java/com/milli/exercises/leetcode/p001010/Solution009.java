package com.milli.exercises.leetcode.p001010;

class Solution009 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String value = String.valueOf(x);
        int len = value.length();
        for (int i = 0; i < len / 2; i++) {
            if (value.charAt(i) != value.charAt(len - 1 - i)) {
                return false;
            }

            
        }
        return true;
    }
}