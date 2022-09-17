package com.milli.exercises.leetcode.p001010;


import java.util.HashSet;
import java.util.Set;

public class Solution003 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> setUnique = new HashSet<>();
        int maxLength = 0, j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != 0) {
                setUnique.remove(s.charAt(i - 1));
            }

            for (; j < s.length() && !setUnique.contains(s.charAt(j)); j++) {
                setUnique.add(s.charAt(j));
            }
            maxLength = Math.max(maxLength, j - i);
        }
        return maxLength;
    }
}
