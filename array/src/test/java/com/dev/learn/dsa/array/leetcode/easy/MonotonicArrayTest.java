package com.dev.learn.dsa.array.leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MonotonicArrayTest {

    private static final MonotonicArray USE_CASE = new MonotonicArray();

    @ParameterizedTest
    @MethodSource
    @DisplayName("Return true if nums[] is monotonic, or false otherwise")
    void test(int[] nums, boolean result) {
        assertThat(USE_CASE.isMonotonic(nums)).isEqualTo(result);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 3}, true),
                Arguments.of(new int[]{6, 5, 4, 4}, true),
                Arguments.of(new int[]{1, 3, 2}, false)
        );
    }
}