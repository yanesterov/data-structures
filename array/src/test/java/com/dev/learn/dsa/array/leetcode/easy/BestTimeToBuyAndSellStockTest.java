package com.dev.learn.dsa.array.leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeToBuyAndSellStockTest {

    private static final BestTimeToBuyAndSellStock USE_CASE = new BestTimeToBuyAndSellStock();

    @ParameterizedTest
    @MethodSource
    @DisplayName("timeRequiredToBuy() should return maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.")
    void test(int[] prices, int expectedProfit) {
        assertThat(USE_CASE.maxProfit(prices)).isEqualTo(expectedProfit);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 5),
                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0)
        );
    }
}