package com.milli.exercises.leetcode.utils;

public class AssertUtils {
    public static boolean equals(int value, int expect) {
        if (value != expect) {
            System.out.printf("Expect: %d, actual: %d\n", expect, value);
            return false;
        }
        return true;
    }

    public static boolean equalsTrue(boolean value) {
        return value;
    }

    public static boolean equalsFalse(boolean value) {
        return equalsTrue(!value);
    }
}
