package com.dev.learn.dsa.array.leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class CheckIfArrayIsSortedAndRotatedTest {

    private static final CheckIfArrayIsSortedAndRotated USE_CASE = new CheckIfArrayIsSortedAndRotated();

    @ParameterizedTest
    @MethodSource
    @DisplayName("check() return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false")
    void test(int[] nums, boolean expectedResult) {
        assertThat(USE_CASE.check(nums)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{3, 4, 5, 1, 2}, true),
                Arguments.of(new int[]{2, 1, 3, 4}, false),
                Arguments.of(new int[]{1, 2, 3}, true)
        );
    }

}