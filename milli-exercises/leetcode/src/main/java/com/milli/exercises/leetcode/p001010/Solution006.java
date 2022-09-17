package com.milli.exercises.leetcode.p001010;

import java.util.Arrays;

class Solution006 {
    public String convert(String s, int numRows) {
        if (s.length() < numRows || numRows < 2) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        String[] zArr = new String[numRows];
        Arrays.fill(zArr, "");
        int blockSize = numRows * 2 - 2;
        for (int i = 0; i < s.length(); i++) {
            int index = i - i / blockSize * blockSize;
            if (index < numRows) {
                zArr[index] += s.charAt(i);
            } else {
                zArr[blockSize - index] += s.charAt(i);
            }
        }
        for (String s1 : zArr) {
            result.append(s1);
        }

        return result.toString();
    }
}