package com.milli.exercises.leetcode.p03;


import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution02();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println(solution.lengthOfLongestSubstring(""));

        // error example
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
        System.out.println(solution.lengthOfLongestSubstring(" "));
        System.out.println(solution.lengthOfLongestSubstring("dvdf"));
    }

    public int lengthOfLongestSubstring(String s) {
        Set<Integer> set = new HashSet<>();
        int max = 0;
        int tempMax = 0;

        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if (set.contains(ch)) {
                set.clear();
                if (tempMax > max) {
                    max = tempMax;
                }
                tempMax = 1;
                set.add(ch);
            } else {
                set.add(ch);
                tempMax++;
            }
        }
        if (tempMax > max) {
            max = tempMax;
        }
        return max;
    }
}

class Solution02 extends Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Integer, Integer> map = new Hashtable<>();

        int i = 0;
        int max = 0;
        int tmpMax = 0;

        while (i < s.length()) {
            int ch = s.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, i);
                tmpMax++;
                i++;
            } else {
                if (tmpMax > max) {
                    max = tmpMax;
                }
                i = map.get(ch) + 1;
                map.clear();
                tmpMax = 0;
            }
        }

        if (tmpMax > max) {
            max = tmpMax;
        }
        return max;
    }
}
