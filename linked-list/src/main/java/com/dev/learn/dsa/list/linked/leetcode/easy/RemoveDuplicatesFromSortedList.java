package com.dev.learn.dsa.list.linked.leetcode.easy;

import com.dev.learn.dsa.PrintUtils;
import com.dev.learn.dsa.list.linked.LinkedListNode;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list/">83. Remove Duplicates from Sorted List</a>
 */
public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        var head = new ListNode(1, new ListNode(1,
                new ListNode(2,
                        new ListNode(3, new ListNode(3)))));
        PrintUtils.print("initial list: ", head);
        head = deleteDuplicates(head);
        PrintUtils.print("processed list: ", head);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        var currentNode = head;
        var nextNode = head;
        while (nextNode != null) {
            if (!currentNode.val.equals(nextNode.val)) {
                currentNode.next = nextNode;
                currentNode = currentNode.next;
            }
            nextNode = nextNode.next;
        }
        if (currentNode != nextNode) {
            currentNode.next = nextNode;
        }
        return head;
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
