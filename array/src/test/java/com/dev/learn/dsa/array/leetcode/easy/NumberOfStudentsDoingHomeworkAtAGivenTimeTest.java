package com.dev.learn.dsa.array.leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NumberOfStudentsDoingHomeworkAtAGivenTimeTest {

    private static final NumberOfStudentsDoingHomeworkAtAGivenTime USE_CASE = new NumberOfStudentsDoingHomeworkAtAGivenTime();


    @ParameterizedTest
    @MethodSource
    @DisplayName("busyStudent() return the number of students doing their homework at time queryTime")
    void test(int[] startTime, int[] endTime, int queryTime, int expectedCount) {
        assertThat(USE_CASE.busyStudent(startTime, endTime, queryTime)).isEqualTo(expectedCount);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, new int[]{3, 2, 7}, 4, 1),
                Arguments.of(new int[]{4}, new int[]{4}, 4, 1)
        );
    }
}