package com.dev.learn.dsa.list.linked.doubly;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DoublyLinkedListTest {

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
        assertThat(list).hasAllNullFieldsOrPropertiesExcept("head");
        assertThat(list.getHeadNodeValue()).isEqualTo(nodeValue);
    }

    @Test
    @DisplayName("should push() add new node at the front of list")
    void shouldAddNodeAtFrontOfList() {
        //given
        var list = new DoublyLinkedList<String>();
        var firstValue = "firstValue";
        var secondValue = "secondValue";
        list.push(firstValue);
        //when
        list.push(secondValue);
        //then
        assertThat(list).hasAllNullFieldsOrPropertiesExcept("head");
        list.getHeadNodeValue();
        assertThat(list.getHeadNodeValue()).isEqualTo(secondValue);
    }
}