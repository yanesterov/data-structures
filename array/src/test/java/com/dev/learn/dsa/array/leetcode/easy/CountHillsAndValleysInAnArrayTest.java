package com.dev.learn.dsa.array.leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CountHillsAndValleysInAnArrayTest {

    private static final CountHillsAndValleysInAnArray USE_CASE = new CountHillsAndValleysInAnArray();

    @ParameterizedTest
    @MethodSource
    @DisplayName("kLengthApart() return true if all 1's are at least k places away from each other, otherwise return false")
    void test(int[] nums, int expectedResult) {
        assertThat(USE_CASE.countHillValley(nums)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{2, 4, 1, 1, 6, 5}, 3),
                Arguments.of(new int[]{6, 6, 5, 5, 4, 1}, 0)
        );
    }
}