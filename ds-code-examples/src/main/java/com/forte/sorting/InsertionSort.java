package com.forte.sorting;

public class InsertionSort implements IntegerSorter {

    public int[] sort(int [] numbers) {

        for (int j = 1; j < numbers.length; j++) {

            int temp = numbers[j];
            int i;
            for (i = j - 1; (i >= 0) && (numbers[i] > temp); i--) {
                numbers[i+1] = numbers[i];
            }
            numbers[i+1] = temp;
        }

        return numbers;
    }
}
