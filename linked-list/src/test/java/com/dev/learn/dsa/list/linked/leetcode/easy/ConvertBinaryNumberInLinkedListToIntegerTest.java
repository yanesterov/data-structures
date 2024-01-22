package com.dev.learn.dsa.list.linked.leetcode.easy;


import com.dev.learn.dsa.PrintUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ConvertBinaryNumberInLinkedListToIntegerTest {
    private static final ConvertBinaryNumberInLinkedListToInteger USE_CASE = new ConvertBinaryNumberInLinkedListToInteger();

    @ParameterizedTest
    @MethodSource
    @DisplayName("should getDecimalValue() convert binary number in linked list to integer")
    void shouldConvert(ConvertBinaryNumberInLinkedListToInteger.ListNode head, Integer expectedValue) {
        //given
        PrintUtils.print("initial head: ", head);
        //when
        var result = USE_CASE.getDecimalValue(head);
        //then
        assertThat(result).isEqualTo(expectedValue);
        PrintUtils.print("processed head: ", head);
    }

    private static Stream<Arguments> shouldConvert() {
        return Stream.of(
                Arguments.of(new ConvertBinaryNumberInLinkedListToInteger.ListNode(0), 0),
                Arguments.of(new ConvertBinaryNumberInLinkedListToInteger.ListNode(1,
                        new ConvertBinaryNumberInLinkedListToInteger.ListNode(0,
                                new ConvertBinaryNumberInLinkedListToInteger.ListNode(1)
                        )
                ), 5)
        );
    }
}