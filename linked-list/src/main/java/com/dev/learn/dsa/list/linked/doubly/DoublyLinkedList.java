package com.dev.learn.dsa.list.linked.doubly;

import static java.util.Objects.isNull;

/**
 * Refer to <a href="https://www.geeksforgeeks.org/introduction-and-insertion-in-a-doubly-linked-list/">geeksforgeeks</a>
 *
 * @param <T>
 */
public class DoublyLinkedList<T> {

    private Node head = null;
    private Node tail = null;

    /**
     * Add a node at the front of the list
     *
     * @param item node value
     */
    public void push(T item) {
        var newNode = new Node(item);
        if (!isNull(head)) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    public T getHeadNodeValue() {
        return !isNull(head) ? head.item : null;
    }

    private class Node {

        private T item;
        private Node prev;
        private Node next;

        public Node(T item) {
            this.item = item;
        }
    }
}
