package com.dev.learn.dsa.list.linked.leetcode.easy;

import com.dev.learn.dsa.PrintUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MergeTwoSortedListsTest {
    private static MergeTwoSortedLists USE_CASE = new MergeTwoSortedLists();

    @ParameterizedTest
    @MethodSource
    @DisplayName("should mergeTwoLists() merge two list into one list")
    void shouldRemoveElements(MergeTwoSortedLists.ListNode list1, MergeTwoSortedLists.ListNode list2, LinkedList<Integer> expectedList) {
        //given
        PrintUtils.print("initial list1: ", list1);
        PrintUtils.print("initial list2: ", list2);
        //when
        var result = USE_CASE.mergeTwoLists(list1, list2);
        //then
        var isSame = true;
        var node = result;
        while (node != null) {
            if (node.val != expectedList.pop()) {
                isSame = false;
                break;
            }
            node = node.next;
        }
        assertThat(isSame).isTrue();
        PrintUtils.print("result: ", result);
    }

    private static Stream<Arguments> shouldRemoveElements() {
        return Stream.of(
                Arguments.of(
                        new MergeTwoSortedLists.ListNode(1,
                                new MergeTwoSortedLists.ListNode(2,
                                        new MergeTwoSortedLists.ListNode(4)
                                )
                        ),
                        new MergeTwoSortedLists.ListNode(1,
                                new MergeTwoSortedLists.ListNode(3,
                                        new MergeTwoSortedLists.ListNode(4)
                                )
                        ),
                        new LinkedList<>(List.of(1, 1, 2, 3, 4, 4))
                ),
                Arguments.of(
                        null,
                        null,
                        null
                ),
                Arguments.of(
                        null,
                        new MergeTwoSortedLists.ListNode(0),
                        new LinkedList<>(List.of(0))
                )
        );
    }
}