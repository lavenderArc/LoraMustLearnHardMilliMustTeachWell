package com.milli.exercises.leetcode.p02;


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        ListNode node = this;
        StringBuilder str = new StringBuilder(String.valueOf(node.val));
        while (node.next != null) {
            node = node.next;
            str.append(",").append(node.val);
        }
        return str.toString();
    }
}

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] input1 = new int[]{1};
        ListNode l1 = new ListNode(input1[0]);

        int[] input2 = new int[]{9, 9, 9};
        ListNode l2 = new ListNode(input2[0]);
        ListNode node2 = l2;
        for (int i = 1; i < input2.length; i++) {
            node2.next = new ListNode(input2[i]);
            node2 = node2.next;
        }

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(solution.addTwoNumbers(l1, l2));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode adder01 = l1;
        ListNode adder02 = l2;
        int addV01 = l1.val;
        int addV02 = l2.val;

        int increment = (addV01 + addV02) / 10;
        ListNode result = new ListNode((addV01 + addV02) % 10);
        ListNode resultIterator = result;
        while (adder01.next != null || adder02.next != null || increment != 0) {
            addV01 = 0;
            if (adder01.next != null) {
                adder01 = adder01.next;
                addV01 = adder01.val;
            }

            addV02 = 0;
            if (adder02.next != null) {
                adder02 = adder02.next;
                addV02 = adder02.val;
            }

            int tmpIncrement = (addV01 + addV02 + increment) / 10;
            resultIterator.next = new ListNode((addV01 + addV02 + increment) % 10);

            resultIterator = resultIterator.next;
            increment = tmpIncrement;
        }
        return result;
    }
}