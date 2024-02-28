package com.dev.learn.dsa;

import com.dev.learn.dsa.list.linked.LinkedListNode;

import static java.lang.String.format;

public final class PrintUtils {

    private PrintUtils() {
    }

    public static <T> void print(LinkedListNode<T> head) {
        var stringBuilder = new StringBuilder();
        if (head == null) {
            stringBuilder.append("[]");
        } else {
            var node = head;
            while (node != null) {
                stringBuilder.append(format("[%s] -> ", node.getValue()));
                node = node.getNext();
            }
        }
        System.out.println(stringBuilder.toString().replaceAll("\\s->\\s$", ""));
    }

    public static <T> void print(String message, LinkedListNode<T> head) {
        var stringBuilder = new StringBuilder();
        if (head == null) {
            stringBuilder.append("[]");
        } else {
            var node = head;
            while (node != null) {
                stringBuilder.append(format("[%s] -> ", node.getValue()));
                node = node.getNext();
            }
        }
        System.out.println(message + stringBuilder.toString().replaceAll("\\s->\\s$", ""));
    }

    public static void print(String message, int[] array) {
        var stringBuilder = new StringBuilder();
        if (array == null) {
            stringBuilder.append("[]");
        } else {
            stringBuilder.append("[");
            for (int i = 0; i < array.length; i++) {
                stringBuilder.append(format("%d,", array[i]));
            }
            stringBuilder.append("]");
        }
        System.out.println(message + stringBuilder.toString().replaceAll(",]", "]"));
    }
}
