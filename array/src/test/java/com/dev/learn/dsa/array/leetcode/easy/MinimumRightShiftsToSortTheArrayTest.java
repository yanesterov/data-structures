package com.dev.learn.dsa.array.leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumRightShiftsToSortTheArrayTest {

    private static final MinimumRightShiftsToSortTheArray USE_CASE = new MinimumRightShiftsToSortTheArray();

    @ParameterizedTest
    @MethodSource
    @DisplayName("Return the minimum number of right shifts required to sort nums and -1 if this is not possible")
    void test(List<Integer> nums, int result) {
        assertThat(USE_CASE.minimumRightShifts(nums)).isEqualTo(result);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(List.of(3, 4, 5, 1, 2), 2),
                Arguments.of(List.of(1, 3, 5), 0),
                Arguments.of(List.of(2, 1, 4), -1)
        );
    }
}