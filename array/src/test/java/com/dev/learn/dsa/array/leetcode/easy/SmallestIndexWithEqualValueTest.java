package com.dev.learn.dsa.array.leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SmallestIndexWithEqualValueTest {

    private static final SmallestIndexWithEqualValue USE_CASE = new SmallestIndexWithEqualValue();

    @ParameterizedTest
    @MethodSource
    @DisplayName("smallestEqual() return the smallest index i of nums such that i mod 10 == nums[i], or -1 if such index does not exist")
    void test(int[] nums, int expectedResult) {
        assertThat(USE_CASE.smallestEqual(nums)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 2}, 0),
                Arguments.of(new int[]{4, 3, 2, 1}, 2),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, -1)
        );
    }
}