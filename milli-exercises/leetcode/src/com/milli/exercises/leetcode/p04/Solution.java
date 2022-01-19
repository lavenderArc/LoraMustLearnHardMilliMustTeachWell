package com.milli.exercises.leetcode.p04;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        System.out.println(solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
        System.out.println(solution.findMedianSortedArrays(new int[]{0, 0}, new int[]{0, 0}));
        System.out.println(solution.findMedianSortedArrays(new int[]{}, new int[]{1}));
        System.out.println(solution.findMedianSortedArrays(new int[]{2}, new int[]{}));
        System.out.println(solution.findMedianSortedArrays(new int[]{1, 3, 5}, new int[]{2, 2, 2}));
        System.out.println(solution.findMedianSortedArrays(new int[]{1, 1, 1, 1}, new int[]{2, 2, 2}));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int midIndex01, midIndex02;
        midIndex01 = midIndex02 = (nums1.length + nums2.length) / 2;
        midIndex01 = midIndex01 - (nums1.length + nums2.length + 1) % 2;

        final int MIN_VAL = -100000000;
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
