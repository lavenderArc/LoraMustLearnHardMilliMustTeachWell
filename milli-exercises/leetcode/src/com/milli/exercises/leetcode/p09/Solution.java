package com.milli.exercises.leetcode.p09;

import com.milli.exercises.leetcode.utils.AssertUtils;

class Solution {
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

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(AssertUtils.equalsTrue(solution.isPalindrome(121)));
        System.out.println(AssertUtils.equalsTrue(solution.isPalindrome(0)));
        System.out.println(AssertUtils.equalsFalse(solution.isPalindrome(-121)));
        System.out.println(AssertUtils.equalsFalse(solution.isPalindrome(10)));
    }
}