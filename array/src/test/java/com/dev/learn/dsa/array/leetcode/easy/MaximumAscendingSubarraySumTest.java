package com.dev.learn.dsa.array.leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumAscendingSubarraySumTest {

    private static final MaximumAscendingSubarraySum USE_CASE = new MaximumAscendingSubarraySum();

    @ParameterizedTest
    @MethodSource
    @DisplayName("Return the number of hills and valleys in nums")
    void test(int[] nums, int expectedResult) {
        assertThat(USE_CASE.maxAscendingSum(nums)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{10, 20, 30, 5, 10, 50}, 65),
                Arguments.of(new int[]{10, 20, 30, 40, 50}, 150),
                Arguments.of(new int[]{12, 17, 15, 13, 10, 11, 12}, 33)
        );
    }
}