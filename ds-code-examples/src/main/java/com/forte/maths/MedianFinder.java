package com.forte.maths;

import com.forte.sorting.BubbleSort;
import com.forte.sorting.IntegerSorter;

public class MedianFinder {

    private IntegerSorter sorter;

    // Two different constructors to allow a default value for the integer sorter

    public MedianFinder() {
        sorter = new BubbleSort();
    }

    public MedianFinder(IntegerSorter sorter) {
        this.sorter = sorter;
    }

    public double findMedian(int[] numbers) {

        int[] sortedNumbers = sorter.sort(numbers);
        int length = numbers.length;
        double median;

        if (length % 2 == 0) {
            // Median of an array of even length is the average of the two middle positions
            median = (sortedNumbers[length / 2 - 1] + sortedNumbers[length / 2]) / 2.0;
        }
        else {
            median =  (double) sortedNumbers[(length - 1) / 2];
        }

        return median;
    }

}
