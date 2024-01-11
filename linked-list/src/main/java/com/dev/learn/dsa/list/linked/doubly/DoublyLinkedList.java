package com.dev.learn.dsa.list.linked.doubly;

/**
 * Refer to <a href="https://www.geeksforgeeks.org/introduction-and-insertion-in-a-doubly-linked-list/">geeksforgeeks</a>
 *
 * @param <T>
 */
public class DoublyLinkedList<T> {

    private Node head = null;
    private Node tail = null;

    private class Node {

        private T item;
        private Node prev;
        private Node next;

        public Node(T item) {
            this.item = item;
        }
    }
}
