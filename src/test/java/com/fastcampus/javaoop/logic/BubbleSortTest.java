package com.fastcampus.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @DisplayName("Bubble Sort")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList() {
        //Given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        //When
        List<Integer> actual = bubbleSort.sort(List.of(3, 2, 4, 5, 1));

        //Then
        assertEquals(List.of(1,2 ,3 ,4, 5), actual);
    }
}