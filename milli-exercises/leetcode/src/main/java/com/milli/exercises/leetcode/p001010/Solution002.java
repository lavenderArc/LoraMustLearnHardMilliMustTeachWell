package com.milli.exercises.leetcode.p001010;


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
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

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ListNode && this.toString().equals(obj.toString());
    }
}

/**
 * Comment: Solution001Refine
 *
 * @since 2022/9/17
 **/
public class Solution002 {
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