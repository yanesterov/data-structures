package com.dev.learn.dsa.array.leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TimeNeededToBuyTicketsTest {

    private static final TimeNeededToBuyTickets USE_CASE = new TimeNeededToBuyTickets();

    @ParameterizedTest
    @MethodSource
    @DisplayName("timeRequiredToBuy() should return the time taken for the person initially at position k to finish buying tickets")
    void test(int[] tickets, int k, int expectedTime) {
        assertThat(USE_CASE.timeRequiredToBuy(tickets, k)).isEqualTo(expectedTime);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 2}, 2, 6),
                Arguments.of(new int[]{5, 1, 1, 1}, 0, 8),
                Arguments.of(new int[]{84, 49, 5, 24, 70, 77, 87, 8}, 3, 154)
        );
    }
}