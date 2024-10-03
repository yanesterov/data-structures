package com.dev.learn.dsa.array.leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FindNearestPointThatHasTheSameXOrYCoordinateTest {

    private static final FindNearestPointThatHasTheSameXOrYCoordinate USE_CASE = new FindNearestPointThatHasTheSameXOrYCoordinate();

    @ParameterizedTest
    @MethodSource
    @DisplayName("Return the index of the valid point with the smallest Manhattan distance from current location")
    void test(int x, int y, int[][] points, int expectedResult) {
        assertThat(USE_CASE.nearestValidPoint(x, y, points)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(3, 4, new int[][]{{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}}, 2),
                Arguments.of(3, 4, new int[][]{{3, 4},}, 0),
                Arguments.of(3, 4, new int[][]{{2, 3},}, -1),
                Arguments.of(1, 1, new int[][]{{1, 1}, {1, 1}}, 0)
        );
    }
}