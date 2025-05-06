package com.dev.learn.dsa.array.leetcode.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumNumberOfOperationsToMoveAllBallsToEachBoxTest {

    private static final MinimumNumberOfOperationsToMoveAllBallsToEachBox USE_CASE = new MinimumNumberOfOperationsToMoveAllBallsToEachBox();

    @ParameterizedTest
    @MethodSource
    @DisplayName("timeRequiredToBuy() should return an array answer of size n, where answer[i] is the minimum number of operations needed to move all the balls to the ith box")
    void test(String boxes, int[] answer) {
        assertThat(USE_CASE.minOperations(boxes)).isEqualTo(answer);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("110", new int[]{1, 1, 3,}),
                Arguments.of("001011", new int[]{11, 8, 5, 4, 3, 4})
        );
    }
}