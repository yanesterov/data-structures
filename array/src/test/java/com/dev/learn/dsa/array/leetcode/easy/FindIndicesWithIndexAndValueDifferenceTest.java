package com.dev.learn.dsa.array.leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FindIndicesWithIndexAndValueDifferenceTest {

    private static final FindIndicesWithIndexAndValueDifference USE_CASE = new FindIndicesWithIndexAndValueDifference();

    @ParameterizedTest
    @MethodSource
    @DisplayName("findIndices() should return array answer")
    void test(int[] nums, int indexDifference, int valueDifference, int[] answer) {
        assertThat(USE_CASE.findIndices(nums, indexDifference, valueDifference)).isEqualTo(answer);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{0}, 0, 0, new int[]{0, 0}),
                Arguments.of(new int[]{5, 1, 4, 1}, 2, 4, new int[]{0, 3}),
                Arguments.of(new int[]{2, 1}, 0, 0, new int[]{0, 0}),
                Arguments.of(new int[]{1, 2, 3}, 2, 4, new int[]{-1, -1})
        );
    }
}