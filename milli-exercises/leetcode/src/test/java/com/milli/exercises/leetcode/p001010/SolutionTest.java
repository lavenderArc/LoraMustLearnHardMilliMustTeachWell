package com.milli.exercises.leetcode.p001010;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SolutionTest {
    static Logger log = LogManager.getLogger(SolutionTest.class);

    @BeforeAll
    static void beforeAll() {
        log.info("Problem 001-010 test begin...");
    }

    @AfterAll
    static void afterAll() {
        log.info("Problem 001-010 test end.");
    }

    @Test
    void testTwoSum() {
        Solution001 solution = new Solution001();

        // case01
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        Assertions.assertArrayEquals(new int[]{0, 1}, result);

        // case02
        result = solution.twoSum(new int[]{3, 2, 4}, 6);
        Assertions.assertArrayEquals(new int[]{1, 2}, result);

        // case03
        result = solution.twoSum(new int[]{3, 3}, 6);
        Assertions.assertArrayEquals(new int[]{0, 1}, result);

        // case04
        result = solution.twoSum(new int[]{}, 6);
        Assertions.assertArrayEquals(new int[]{}, result);
    }

    @Test
    void testTwoSumWithMap() {
        Solution001Ex solution = new Solution001Ex();

        // case01
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        Assertions.assertArrayEquals(new int[]{0, 1}, result);

        // case02
        result = solution.twoSum(new int[]{3, 2, 4}, 6);
        Assertions.assertArrayEquals(new int[]{1, 2}, result);

        // case03
        result = solution.twoSum(new int[]{3, 3}, 6);
        Assertions.assertArrayEquals(new int[]{0, 1}, result);

        // case04
        result = solution.twoSum(new int[]{}, 6);
        Assertions.assertArrayEquals(new int[]{}, result);
    }

    private ListNode array2ListNode(int[] arr) {
        ListNode listNode = new ListNode(arr[0]);
        ListNode tmp = listNode;
        for (int i = 1; i < arr.length; i++) {
            tmp.next = new ListNode(arr[i]);
            tmp = tmp.next;
        }
        return listNode;
    }

    @Test
    void testAddTwoNumbers() {
        Solution002 solution = new Solution002();

        // case01
        ListNode l1 = array2ListNode(new int[]{1});
        ListNode l2 = array2ListNode(new int[]{9, 9, 9});
        ListNode result = solution.addTwoNumbers(l1, l2);
        Assertions.assertEquals(array2ListNode(new int[]{0, 0, 0, 1}), result);

        // case02
        l1 = array2ListNode(new int[]{2, 4, 3});
        l2 = array2ListNode(new int[]{5, 6, 4});
        result = solution.addTwoNumbers(l1, l2);
        Assertions.assertEquals(array2ListNode(new int[]{7, 0, 8}), result);

        // case03
        l1 = array2ListNode(new int[]{0});
        l2 = array2ListNode(new int[]{0});
        result = solution.addTwoNumbers(l1, l2);
        Assertions.assertEquals(array2ListNode(new int[]{0}), result);

        // case04
        l1 = array2ListNode(new int[]{9, 9, 9, 9, 9, 9, 9});
        l2 = array2ListNode(new int[]{9, 9, 9, 9});
        result = solution.addTwoNumbers(l1, l2);
        Assertions.assertEquals(array2ListNode(new int[]{8, 9, 9, 9, 0, 0, 0, 1}), result);
    }

    @Test
    void testLengthOfLongestSubstring() {
        Solution003 solution = new Solution003();

        // case01
        int result = solution.lengthOfLongestSubstring("abcabcbb");
        Assertions.assertEquals(3, result);

        // case02
        result = solution.lengthOfLongestSubstring("bbbbb");
        Assertions.assertEquals(1, result);

        // case03
        result = solution.lengthOfLongestSubstring("pwwkew");
        Assertions.assertEquals(3, result);

        // case04
        result = solution.lengthOfLongestSubstring("dvdf");
        Assertions.assertEquals(3, result);
    }

    @Test
    void testFindMedianSortedArrays() {
        Solution004 solution = new Solution004();

        // case01
        double result = solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
        Assertions.assertEquals(2, result);

        // case02
        result = solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
        Assertions.assertEquals(2.5, result);

        // case03
        result = solution.findMedianSortedArrays(new int[]{3, 4}, new int[]{1, 2});
        Assertions.assertEquals(2.5, result);

    }

    @Test
    void testLongestPalindrome() {
        Solution005 solution = new Solution005();

        // case01
        String result = solution.longestPalindrome("babad");
        Assertions.assertEquals("bab", result);

        // case02
        result = solution.longestPalindrome("cbbd");
        Assertions.assertEquals("bb", result);

        // case03
        result = solution.longestPalindrome("1");
        Assertions.assertEquals("1", result);

        // case04
        result = solution.longestPalindrome("cbbbcbb");
        Assertions.assertEquals("cbbbc", result);
    }

    @Test
    void testConvert() {
        Solution006 solution = new Solution006();

        // case01
        String result = solution.convert("PAYPALISHIRING", 3);
        Assertions.assertEquals("PAHNAPLSIIGYIR", result);

        // case02
        result = solution.convert("PAYPALISHIRING", 4);
        Assertions.assertEquals("PINALSIGYAHRPI", result);

        // case03
        result = solution.convert("A", 1);
        Assertions.assertEquals("A", result);

        // case04
        result = solution.convert("ABC", 4);
        Assertions.assertEquals("ABC", result);
    }

    @Test
    void testReverse() {
        Solution007 solution = new Solution007();

        // case01
        int result = solution.reverse(123);
        Assertions.assertEquals(321, result);

        // case02
        result = solution.reverse(-123);
        Assertions.assertEquals(-321, result);

        // case03
        result = solution.reverse(120);
        Assertions.assertEquals(21, result);

        // case04
        result = solution.reverse(0);
        Assertions.assertEquals(0, result);

        // case05
        result = solution.reverse(2147483647);
        Assertions.assertEquals(0, result);
    }

    @Test
    void testMyAtoi() {
        Solution008 solution = new Solution008();
        int result;

        // case01
        result = solution.myAtoi("   -42");
        Assertions.assertEquals(-42, result);

        // case02
        result = solution.myAtoi("42");
        Assertions.assertEquals(42, result);

        // case03
        result = solution.myAtoi("4193 with words");
        Assertions.assertEquals(4193, result);

        // case04
        result = solution.myAtoi("+4193");
        Assertions.assertEquals(4193, result);

        // case05
        result = solution.myAtoi("1111111111111111111111111111111111");
        Assertions.assertEquals(2147483647, result);

        // case06
        result = solution.myAtoi("-1111111111111111111111111111111111");
        Assertions.assertEquals(-2147483648, result);

        // case06
        result = solution.myAtoi("09");
        Assertions.assertEquals(9, result);

        // case07
        result = solution.myAtoi("A09");
        Assertions.assertEquals(0, result);
    }

    @Test
    void testIsPalindrome() {
        Solution009 solution = new Solution009();

        // case01
        Assertions.assertTrue(solution.isPalindrome(121));

        // case02
        Assertions.assertFalse(solution.isPalindrome(-121));

        // case03
        Assertions.assertFalse(solution.isPalindrome(10));
    }

    @Test
    void testOthers() {
        Solution002 solution = new Solution002();

        // for ListNode.equals branch coverage
        ListNode l1 = array2ListNode(new int[]{1});
        ListNode l2 = array2ListNode(new int[]{9, 9, 9});
        ListNode result = solution.addTwoNumbers(l1, l2);
        Assertions.assertNotEquals(array2ListNode(new int[]{0, 0, 0, 2}), result);
        Assertions.assertNotEquals(array2ListNode(new int[]{0, 0, 0, 2}), null);
    }
}