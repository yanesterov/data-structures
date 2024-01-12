package com.dev.learn.dsa.list.linked.doubly;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class DoublyLinkedListTest {

    @Nested
    @DisplayName("insertion node into list")
    class Insertion {

        @Test
        @DisplayName("should push() add new node at the front of empty list")
        void shouldAddNodeAtFrontOfEmptyList() {
            //given
            var list = new DoublyLinkedList<String>();
            assertThat(list)
                    .hasFieldOrPropertyWithValue("head", null)
                    .hasFieldOrPropertyWithValue("tail", null);
            var nodeValue = "item";
            //when
            list.push(nodeValue);
            //then
            assertThat(list).hasNoNullFieldsOrProperties();
            assertThat(list.getHeadValue()).isEqualTo(nodeValue);
            assertThat(list.getTailValue()).isEqualTo(nodeValue);
            System.out.printf("[AddNodeAtFrontOfEmptyList] %s%n", list);
        }

        @Test
        @DisplayName("should push() add new node at the front of list")
        void shouldAddNodeAtFrontOfList() {
            //given
            var list = new DoublyLinkedList<String>();
            var headValue = "6";
            var tailValue = "0";
            //when
            IntStream.range(0, 7).mapToObj(String::valueOf).forEach(list::push);
            //then
            assertThat(list).hasNoNullFieldsOrProperties();
            list.getHeadValue();
            assertThat(list.getHeadValue()).isEqualTo(headValue);
            assertThat(list.getTailValue()).isEqualTo(tailValue);
            System.out.printf("[AddNodeAtFrontOfList] %s%n", list);
        }

        @Test
        @DisplayName("should enqueue() add new node at the end of empty list")
        void shouldAddNodeAtEndOfEmptyList() {
            //given
            var list = new DoublyLinkedList<Integer>();
            assertThat(list)
                    .hasFieldOrPropertyWithValue("head", null)
                    .hasFieldOrPropertyWithValue("tail", null);
            var nodeValue = 0;
            //when
            list.push(nodeValue);
            //then
            assertThat(list).hasNoNullFieldsOrProperties();
            assertThat(list.getHeadValue()).isEqualTo(nodeValue);
            assertThat(list.getTailValue()).isEqualTo(nodeValue);
            System.out.printf("[AddNodeAtEndOfEmptyList] %s%n", list);
        }

        @Test
        @DisplayName("should enqueue() add new node at the end of list")
        void shouldAddNodeAtEndOfList() {
            //given
            var list = new DoublyLinkedList<Integer>();
            assertThat(list)
                    .hasFieldOrPropertyWithValue("head", null)
                    .hasFieldOrPropertyWithValue("tail", null);
            var headValue = 0;
            var tailValue = 6;
            //when
            IntStream.range(0, 7).forEach(list::enqueue);
            //then
            assertThat(list).hasNoNullFieldsOrProperties();
            list.getHeadValue();
            assertThat(list.getHeadValue()).isEqualTo(headValue);
            assertThat(list.getTailValue()).isEqualTo(tailValue);
            System.out.printf("[AddNodeAtEndOfList] %s%n", list);
        }
    }
}