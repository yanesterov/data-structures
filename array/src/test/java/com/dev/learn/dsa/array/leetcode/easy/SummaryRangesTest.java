package com.dev.learn.dsa.array.leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SummaryRangesTest {

    private static final SummaryRanges USE_CASE = new SummaryRanges();

    @ParameterizedTest
    @MethodSource
    @DisplayName("summaryRanges() return the smallest sorted list of ranges that cover all the numbers in the array exactly")
    void test(int[] nums, List<String> expectedRanges) {
        assertThat(USE_CASE.summaryRanges(nums)).isEqualTo(expectedRanges);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 2, 4, 5, 7}, List.of("0->2", "4->5", "7")),
                Arguments.of(new int[]{0, 2, 3, 4, 6, 8, 9}, List.of("0", "2->4", "6", "8->9"))
        );
    }
}