package com.dev.learn.dsa.list.linked.leetcode.easy;

import com.dev.learn.dsa.list.linked.LinkedListNode;

/**
 * <a href="https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/">1290. Convert Binary Number in a Linked List to Integer</a>
 */
public class ConvertBinaryNumberInLinkedListToInteger {

    public int getDecimalValue(ListNode head) {
        var power = 0;
        var result = 0;
        var node = head;

        while (node.next != null) {
            power++;
            node = node.next;
        }

        node = head;
        while (node != null) {
            result += node.val * Double.valueOf(Math.pow(2, power)).intValue();
            power--;
            node = node.next;
        }

        return result;
    }

    protected static class ListNode implements LinkedListNode<Integer> {
        Integer val;
        ListNode next;

        ListNode() {
        }

        ListNode(Integer val) {
            this.val = val;
        }

        ListNode(Integer val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public LinkedListNode<Integer> getNext() {
            return next;
        }

        @Override
        public Integer getValue() {
            return val;
        }
    }
}
