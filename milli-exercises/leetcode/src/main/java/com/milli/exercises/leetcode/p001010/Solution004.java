package com.milli.exercises.leetcode.p001010;

public class Solution004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int midIndex01, midIndex02;
        midIndex01 = midIndex02 = (nums1.length + nums2.length) / 2;
        midIndex01 = midIndex01 - (nums1.length + nums2.length + 1) % 2;

        final int MIN_VAL = Integer.MIN_VALUE;
        int val, midVal01 = MIN_VAL, midVal02 = MIN_VAL;
        boolean use02;
        for (int i1 = 0, i2 = 0, index = -1; ; ) {
            if (i1 <= nums1.length - 1 && i2 <= nums2.length - 1) {
                use02 = nums1[i1] >= nums2[i2];
            } else {
                use02 = i2 != nums2.length;
            }

            if (use02) {
                val = nums2[i2++];
            } else {
                val = nums1[i1++];
            }
            index++;

            if (index == midIndex01) {
                midVal01 = val;
            }
            if (index == midIndex02) {
                midVal02 = val;
            }
            if (midVal01 > MIN_VAL && midVal02 > MIN_VAL) {
                break;
            }
        }
        return (midVal01 + midVal02) / 2.0;
    }
}
