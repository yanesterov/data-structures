package com.dev.learn.dsa.list.linked.leetcode.easy;

import com.dev.learn.dsa.PrintUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MiddleOfTheLinkedListTest {

    private static MiddleOfTheLinkedList LIST = new MiddleOfTheLinkedList();

    @ParameterizedTest
    @MethodSource
    @DisplayName("should middleNode() find middle node of list")
    void shouldFindMiddleNode(MiddleOfTheLinkedList.ListNode head, Integer middleValue) {
        //given
        PrintUtils.print("initial head: ", head);
        //when
        head = LIST.middleNode(head);
        //then
        if (head == null) {
            assertThat(head).isEqualTo(middleValue);
        } else {
            assertThat(head.val).isEqualTo(middleValue);
        }
        PrintUtils.print("processed head: ", head);
    }

    private static Stream<Arguments> shouldFindMiddleNode() {
        return Stream.of(
                Arguments.of(null, null),
                Arguments.of(new MiddleOfTheLinkedList.ListNode(), null),
                Arguments.of(new MiddleOfTheLinkedList.ListNode(1), 1),
                Arguments.of(new MiddleOfTheLinkedList.ListNode(1, new MiddleOfTheLinkedList.ListNode(2)), 2),
                Arguments.of(new MiddleOfTheLinkedList.ListNode(1,
                        new MiddleOfTheLinkedList.ListNode(2,
                                new MiddleOfTheLinkedList.ListNode(3,
                                        new MiddleOfTheLinkedList.ListNode(4,
                                                new MiddleOfTheLinkedList.ListNode(5)
                                        )
                                )
                        )
                ), 3),
                Arguments.of(new MiddleOfTheLinkedList.ListNode(1,
                        new MiddleOfTheLinkedList.ListNode(2,
                                new MiddleOfTheLinkedList.ListNode(3,
                                        new MiddleOfTheLinkedList.ListNode(4,
                                                new MiddleOfTheLinkedList.ListNode(5, new MiddleOfTheLinkedList.ListNode(6))
                                        )
                                )
                        )
                ), 4)
        );
    }
}