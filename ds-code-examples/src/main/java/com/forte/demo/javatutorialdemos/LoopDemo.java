package com.forte.demo.javatutorialdemos;

class LoopDemo {

    public static void main(String[] args){

        // Demonstrate for
        for (int i = 1; i < 11; i++) {
            System.out.println("Count is: " + i);
        }

        // A better for loop for collections
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }

        // Demonstrate while
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }

        // Demonstrate do while
        count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}