package com.dev.learn.dsa.list.linked.leetcode.easy;

import com.dev.learn.dsa.PrintUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ReverseLinkedListTest {
    private static ReverseLinkedList USE_CASE = new ReverseLinkedList();

    @ParameterizedTest
    @MethodSource
    @DisplayName("should reverseList() return reverted list")
    void shouldReverseList(ReverseLinkedList.ListNode head, Integer headValue, Integer tailValue) {
        //given
        PrintUtils.print("initial head: ", head);
        //when
        if (head == null) {
            assertThat(head).isEqualTo(headValue);
        } else {
            assertThat(head.val).isEqualTo(headValue);
        }
        head = USE_CASE.reverseList(head);
        //then
        if (head == null) {
            assertThat(head).isEqualTo(headValue);
        } else {
            assertThat(head.val).isEqualTo(tailValue);
        }
        PrintUtils.print("processed head: ", head);
    }

    private static Stream<Arguments> shouldReverseList() {
        return Stream.of(
                Arguments.of(null, null, null),
                Arguments.of(new ReverseLinkedList.ListNode(), null, null),
                Arguments.of(new ReverseLinkedList.ListNode(1), 1, 1),
                Arguments.of(new ReverseLinkedList.ListNode(1, new ReverseLinkedList.ListNode(2)), 1, 2),
                Arguments.of(new ReverseLinkedList.ListNode(1,
                        new ReverseLinkedList.ListNode(2,
                                new ReverseLinkedList.ListNode(3,
                                        new ReverseLinkedList.ListNode(4,
                                                new ReverseLinkedList.ListNode(5)
                                        )
                                )
                        )
                ), 1, 5)
        );
    }
}