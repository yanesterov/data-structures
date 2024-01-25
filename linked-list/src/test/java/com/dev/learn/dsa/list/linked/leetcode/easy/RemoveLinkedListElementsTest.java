package com.dev.learn.dsa.list.linked.leetcode.easy;

import com.dev.learn.dsa.PrintUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveLinkedListElementsTest {
    private static RemoveLinkedListElements USE_CASE = new RemoveLinkedListElements();

    @ParameterizedTest
    @MethodSource
    @DisplayName("should removeElements() delete all occurrences into list")
    void shouldRemoveElements(RemoveLinkedListElements.ListNode head, int val) {
        //given
        PrintUtils.print("initial head: ", head);
        //when
        head = USE_CASE.removeElements(head, val);
        //then
        var node = head;
        var isElementExist = false;
        while (node != null) {
            if (node.val != null && node.val == val) {
                isElementExist = true;
                break;
            }
            node = node.next;
        }
        assertThat(isElementExist).isFalse();
        PrintUtils.print("processed head: ", head);
    }

    private static Stream<Arguments> shouldRemoveElements() {
        return Stream.of(
//                Arguments.of(new RemoveLinkedListElements.ListNode(), 1),
                Arguments.of(new RemoveLinkedListElements.ListNode(7,
                        new RemoveLinkedListElements.ListNode(7
//                                new RemoveLinkedListElements.ListNode(7,
//                                        new RemoveLinkedListElements.ListNode(7)
//                                )
                        )
                ), 7)
//                Arguments.of(new RemoveLinkedListElements.ListNode(1,
//                        new RemoveLinkedListElements.ListNode(2,
//                                new RemoveLinkedListElements.ListNode(6,
//                                        new RemoveLinkedListElements.ListNode(3,
//                                                new RemoveLinkedListElements.ListNode(4,
//                                                        new RemoveLinkedListElements.ListNode(5,
//                                                                new RemoveLinkedListElements.ListNode(6)
//                                                        )
//                                                )
//                                        )
//                                )
//                        )
//                ), 6)
        );
    }
}