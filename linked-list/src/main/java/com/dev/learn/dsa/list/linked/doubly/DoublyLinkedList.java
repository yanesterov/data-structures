package com.dev.learn.dsa.list.linked.doubly;

import static java.lang.String.format;
import static java.util.Objects.isNull;

/**
 * Refer to <a href="https://www.geeksforgeeks.org/introduction-and-insertion-in-a-doubly-linked-list/">geeksforgeeks</a>
 *
 * @param <T>
 */
public class DoublyLinkedList<T> {

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    /**
     * Add a node at the front of the list
     *
     * @param item node value
     */
    public void push(T item) {
        var node = new Node(item);
        if (isNull(head)) {
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
        }
        head = node;
        size++;
    }

    /**
     * Add a node at position
     *
     * @param item     node value
     * @param position location of new node
     */
    public void add(T item, int position) {
        int size = size();
        if (position < 0 || position >= size) {
            throw new IllegalArgumentException(format("position[%s] must be >= 0 and < size[%s]", position, size));
        }
        var node = new Node(item);
        var index = 0;
        if (isNull(head) || position == 0) {
            push(item);
        } else {
            var nodeToChange = head;
            while (!isNull(nodeToChange) && index < position) {
                nodeToChange = nodeToChange.next;
                index++;
            }
            nodeToChange.prev.next = node;
            node.prev = nodeToChange.prev;
            nodeToChange.prev = node;
            node.next = nodeToChange;
        }
        size++;
    }

    /**
     * Add a node at the end of the list
     *
     * @param item node value
     */
    public void enqueue(T item) {
        var prevTail = tail;
        tail = new Node(item);
        if (isNull(head)) {
            head = tail;
        } else {
            prevTail.next = tail;
            tail.prev = prevTail;
        }
        size++;
    }

    public T getHeadValue() {
        return !isNull(head) ? head.item : null;
    }

    public T getTailValue() {
        return !isNull(tail) ? tail.item : null;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        var stringBuilder = new StringBuilder("linked list: ");
        if (isNull(head)) {
            stringBuilder.append("empty");
        } else {
            var node = head;
            while (!isNull(node)) {
                stringBuilder.append(format("[%s] -> ", node.item));
                node = node.next;
            }
        }
        var result = stringBuilder.toString();
        return result.substring(0, result.length() - 3);
    }

    private class Node {

        private final T item;
        private Node prev;
        private Node next;

        public Node(T item) {
            this.item = item;
        }
    }
}
