package com.dev.learn.dsa.array.leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumDistanceToTheTargetElementTest {

    private static final MinimumDistanceToTheTargetElement USE_CASE = new MinimumDistanceToTheTargetElement();

    @ParameterizedTest
    @MethodSource
    @DisplayName("Return abs(i - start)")
    void test(int[] nums, int target, int start, int result) {
        assertThat(USE_CASE.getMinDistance(nums, target, start)).isEqualTo(result);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 5, 3, 1),
                Arguments.of(new int[]{1}, 1, 0, 0),
                Arguments.of(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 1, 0, 0)
        );
    }
}