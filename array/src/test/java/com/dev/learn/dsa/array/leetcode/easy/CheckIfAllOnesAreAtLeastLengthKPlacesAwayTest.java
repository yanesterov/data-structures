package com.dev.learn.dsa.array.leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CheckIfAllOnesAreAtLeastLengthKPlacesAwayTest {

    private static final CheckIfAllOnesAreAtLeastLengthKPlacesAway USE_CASE = new CheckIfAllOnesAreAtLeastLengthKPlacesAway();

    @ParameterizedTest
    @MethodSource
    @DisplayName("kLengthApart() return true if all 1's are at least k places away from each other, otherwise return false")
    void test(int[] nums, int k, boolean expectedResult) {
        assertThat(USE_CASE.kLengthApart(nums, k)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 0, 0, 0, 1, 0, 0, 1}, 2, true),
                Arguments.of(new int[]{1, 0, 0, 1, 0, 1}, 2, false)
        );
    }
}