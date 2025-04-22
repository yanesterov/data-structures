package com.dev.learn.dsa.array.leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ShortestDistanceToTargetStringInACircularArrayTest {

    private static final ShortestDistanceToTargetStringInACircularArray USE_CASE = new ShortestDistanceToTargetStringInACircularArray();

    @ParameterizedTest
    @MethodSource
    @DisplayName("timeRequiredToBuy() should return shortest distance needed to reach the string target. If the string target does not exist in words, return -1")
    void test(String[] words, String target, int startIndex, int shortedDistance) {
        assertThat(USE_CASE.closestTarget(words, target, startIndex)).isEqualTo(shortedDistance);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new String[]{"hello", "i", "am", "leetcode", "hello"}, "hello", 1, 1),
                Arguments.of(new String[]{"a", "b", "leetcode"}, "leetcode", 0, 1),
                Arguments.of(new String[]{"i", "eat", "leetcode"}, "ate", 0, -1)
        );
    }
}