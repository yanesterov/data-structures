package com.dev.learn.dsa.list.linked.leetcode.easy;

import com.dev.learn.dsa.list.linked.LinkedListNode;

/**
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists/">21. Merge Two Sorted Lists</a>
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode mergeHead;
        if (list1.val < list2.val) {
            mergeHead = list1;
            mergeHead.next = mergeTwoLists(list1.next, list2);
        } else {
            mergeHead = list2;
            mergeHead.next = mergeTwoLists(list1, list2.next);
        }
        return mergeHead;
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
