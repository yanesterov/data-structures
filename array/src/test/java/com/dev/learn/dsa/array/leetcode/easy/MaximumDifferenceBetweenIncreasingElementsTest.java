package com.dev.learn.dsa.array.leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumDifferenceBetweenIncreasingElementsTest {

    private static final MaximumDifferenceBetweenIncreasingElements USE_CASE = new MaximumDifferenceBetweenIncreasingElements();

    @ParameterizedTest
    @MethodSource
    @DisplayName("Return the maximum difference. If no such i and j exists, return -1")
    void test(int[] nums, int result) {
        assertThat(USE_CASE.maximumDifference(nums)).isEqualTo(result);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{7, 1, 5, 4}, 4),
                Arguments.of(new int[]{9, 4, 3, 2}, -1),
                Arguments.of(new int[]{1, 5, 2, 10}, 9)
        );
    }
}