package com.forte.sorting;

public class BubbleSort implements IntegerSorter {

    public int[] sort(int[] numbers) {

        boolean swapFound = true;
        int temp;

        while (swapFound) {

            swapFound = false;

            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j+1] ) {

                    // Swap elements
                    temp = numbers[j];
                    numbers[j] = numbers[ j+1 ];
                    numbers[j+1] = temp;

                    // We swapped an element so we are not done yet
                    swapFound = true;
                }
            }
        }

        return numbers;
    }
}
