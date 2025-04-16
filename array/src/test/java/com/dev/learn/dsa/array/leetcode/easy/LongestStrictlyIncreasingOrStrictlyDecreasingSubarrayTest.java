package com.dev.learn.dsa.array.leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LongestStrictlyIncreasingOrStrictlyDecreasingSubarrayTest {

    private static final LongestStrictlyIncreasingOrStrictlyDecreasingSubarray USE_CASE = new LongestStrictlyIncreasingOrStrictlyDecreasingSubarray();

    @ParameterizedTest
    @MethodSource
    @DisplayName("timeRequiredToBuy() should return the time taken for the person initially at position k to finish buying tickets")
    void test(int[] nums, int expectedLength) {
        assertThat(USE_CASE.longestMonotonicSubarray(nums)).isEqualTo(expectedLength);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 4, 3, 3, 2}, 2),
                Arguments.of(new int[]{3,3,3,3}, 1),
                Arguments.of(new int[]{3,2,1}, 3)
        );
    }
}