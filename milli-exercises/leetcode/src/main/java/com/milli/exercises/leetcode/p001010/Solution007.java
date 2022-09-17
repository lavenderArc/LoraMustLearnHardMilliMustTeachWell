/**
 * Copyright (c) 2022-2022 lgori
 **/
package com.milli.exercises.leetcode.p001010;

/**
 * Comment: Solution007
 *
 * @since 2022/9/17
 **/
public class Solution007 {

    public int reverse(int x) {
        long y = Math.abs((long) x);
        String ys = new StringBuilder().append(y).reverse().toString();
        y = Long.parseLong(ys);
        if (y > Integer.MAX_VALUE) {
            return 0;
        }

        return x > 0 ? (int) y : -(int) y;
    }
}
