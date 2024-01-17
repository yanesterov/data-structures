package com.dev.learn.dsa.list.linked.doubly;

import static java.lang.String.format;
import static java.util.Objects.isNull;

public class DoublyLinkedList<T> {

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    /**
     * Add node at front of list
     *
     * @param item node value
     */
    public void push(T item) {
        var node = new Node(item);
        if (size == 0) {
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
        }
        head = node;
        size++;
    }

    /**
     * Add node at position
     *
     * @param item     node value
     * @param position location of new node
     */
    public void add(T item, int position) {
        if (position < 0 || position >= size) {
            throw new IllegalArgumentException(format("position[%s] must be >= 0 and < size[%s]", position, size));
        }
        var node = new Node(item);
        var index = 0;
        if (position == 0) {
            push(item);
            return;
        } else if (position == size - 1) {
            enqueue(item);
            return;
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
     * Add node at end of list
     *
     * @param item node value
     */
    public void enqueue(T item) {
        var prevTail = tail;
        tail = new Node(item);
        if (size == 0) {
            head = tail;
        } else {
            prevTail.next = tail;
            tail.prev = prevTail;
        }
        size++;
    }

    /**
     * Delete node from front of list
     *
     * @return deleted node value
     */
    public T pop() {
        if (size == 0) {
            return null;
        }
        var item = head.item;
        head = head.next;
        size--;
        return item;
    }

    /**
     * Delete node from position
     *
     * @param position node location for deleting
     * @return deleted node value
     */
    public T delete(int position) {
        if (position < 0 || position >= size) {
            throw new IllegalArgumentException(format("position[%s] must be >= 0 and < size[%s]", position, size));
        }
        var index = 0;
        if (position == 0) {
            return pop();
        } else if (position == size - 1) {
            return dequeue();
        } else {
            var nodeToChange = head;
            while (!isNull(nodeToChange) && index < position) {
                nodeToChange = nodeToChange.next;
                index++;
            }
            nodeToChange.prev.next = nodeToChange.next;
            nodeToChange.next.prev = nodeToChange.prev;
            nodeToChange.prev = null;
            nodeToChange.next = null;
            size--;
            return nodeToChange.item;
        }
    }

    /**
     * Delete node from end of list
     */
    public T dequeue() {
        if (size == 0) {
            return null;
        }else if (size == 1) {
            return pop();
        }
        var item = tail.item;
        tail = tail.prev;
        tail.next.prev = null;
        tail.next = null;
        size--;
        return item;
    }

    public T getHeadValue() {
        return size != 0 ? head.item : null;
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
        if (size == 0) {
            stringBuilder.append("[]");
        } else {
            var node = head;
            while (!isNull(node)) {
                stringBuilder.append(format("[%s] -> ", node.item));
                node = node.next;
            }
        }
        return stringBuilder.toString().replaceAll("\\s->\\s$", "");
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
