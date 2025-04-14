package com.dev.learn.dsa.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class OperationsTest {

    @Test
    void oneDimensionalArrayInitializationWays() {
        // region Initializing Arrays With Values
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        // endregion
        // region In-Place Initializing Arrays With Values
        arr = new int[]{100, 200, 300};
        System.out.println(Arrays.toString(arr));
        // endregion
        // region Initializing an Array Using the Stream API
        arr = IntStream.of(843, 321, 908).toArray();
        System.out.println(Arrays.toString(arr));
        // endregion
    }

    @Test
    void twoDimensionalArrayInitializationWays() {
        // 1
        // 2
        // 3
    }
}
