package com.dev.learn.dsa.list.linked.leetcode.easy;

import com.dev.learn.dsa.list.linked.LinkedListNode;

/**
 * <a href="https://leetcode.com/problems/remove-linked-list-elements/">203. Remove Linked List Elements</a>
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
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
