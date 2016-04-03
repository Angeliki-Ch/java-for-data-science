package com.forte.maths;

import com.forte.sorting.InsertionSort;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MedianFinderTest {

    @Test
    public void shouldCorrectlyFindMedianOfOddLengthArrayWithDefaultSorter() {

        MedianFinder medianFinder = new MedianFinder();
        int[] numbers = new int[] {45, 8, 4, 27, 13, 19, 0};
        double median = 13.0;
        assertThat(medianFinder.findMedian(numbers), is(median));
    }

    @Test
    public void shouldCorrectlyFindMedianOfEvenLengthArrayWithDifferentSorter() {

        MedianFinder medianFinder = new MedianFinder(new InsertionSort());
        int[] numbers = new int[] {45, 8, 4, 27, 13, 19};
        double median = 16.0;
        assertThat(medianFinder.findMedian(numbers), is(median));
    }


}
