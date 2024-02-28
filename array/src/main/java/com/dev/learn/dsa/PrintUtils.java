package com.dev.learn.dsa;

import static java.lang.String.format;

public final class PrintUtils {

    private PrintUtils() {
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
