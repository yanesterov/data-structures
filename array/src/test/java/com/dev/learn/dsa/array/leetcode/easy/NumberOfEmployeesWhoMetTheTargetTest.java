package com.dev.learn.dsa.array.leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NumberOfEmployeesWhoMetTheTargetTest {

    private static final NumberOfEmployeesWhoMetTheTarget USE_CASE = new NumberOfEmployeesWhoMetTheTarget();

    @ParameterizedTest
    @MethodSource
    @DisplayName("numberOfEmployeesWhoMetTarget() will return the integer denoting the number of employees who worked at least target hours")
    void test(int[] hours, int target, int expectedCount) {
        assertThat(USE_CASE.numberOfEmployeesWhoMetTarget(hours, target)).isEqualTo(expectedCount);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 2, 3, 4}, 2, 3),
                Arguments.of(new int[]{5, 1, 4, 2, 2}, 6, 0)
        );
    }
}