package com.dev.learn.dsa.list.linked.leetcode.easy;

import com.dev.learn.dsa.list.linked.LinkedListNode;

/**
 * <a href="https://leetcode.com/problems/middle-of-the-linked-list/">876. Middle of the Linked List</a>
 */
public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        var listSize = 0;
        var index = 0;
        var middleIndex = 0;
        var node = head;

        if (head == null) {
            return head;
        }
        while (node != null) {
            node = node.next;
            listSize++;
        }
        if (listSize <= 1) {
            return head;
        }

        middleIndex = listSize / 2;
        node = head;

        while (index < middleIndex) {
            node = node.next;
            index++;
        }

        return node;
    }

    public static class ListNode implements LinkedListNode<Integer> {
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
