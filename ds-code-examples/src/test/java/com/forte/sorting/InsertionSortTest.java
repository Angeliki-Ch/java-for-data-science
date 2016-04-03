package com.forte.sorting;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class InsertionSortTest {

    private InsertionSort sorter = new InsertionSort();

    @Test
    public void shouldCorrectlySortNumbers() {

        int[] numbers = new int[] {45, 8, 4, 27, 13, 19};
        int[] sortedNumbers = new int[] {4, 8, 13, 19, 27, 45};
        assertThat(sorter.sort(numbers), is(sortedNumbers));

    }
}
