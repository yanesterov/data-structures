package com.dev.learn.dsa.array.leetcode.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CountNumberOfDistinctIntegersAfterReverseOperationsTest {

    private static final CountNumberOfDistinctIntegersAfterReverseOperations USE_CASE = new CountNumberOfDistinctIntegersAfterReverseOperations();

    @ParameterizedTest
    @MethodSource
    @DisplayName("timeRequiredToBuy() should return an array answer of size n, where answer[i] is the minimum number of operations needed to move all the balls to the ith box")
    void test(int[] nums, int distinctIntegers) {
        assertThat(USE_CASE.countDistinctIntegers(nums)).isEqualTo(distinctIntegers);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 13, 10, 12, 31}, 6),
                Arguments.of(new int[]{2, 2, 2}, 1)
        );
    }
}