package com.forte.demo.javatutorialdemos;

import java.util.Arrays;

public class ArrayDemo {

    public static void simpleArrayDemo() {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];

        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: "
                + anArray[0]);
        System.out.println("Element at index 1: "
                + anArray[1]);
        System.out.println("Element at index 2: "
                + anArray[2]);
        System.out.println("Element at index 3: "
                + anArray[3]);
        System.out.println("Element at index 4: "
                + anArray[4]);
        System.out.println("Element at index 5: "
                + anArray[5]);
        System.out.println("Element at index 6: "
                + anArray[6]);
        System.out.println("Element at index 7: "
                + anArray[7]);
        System.out.println("Element at index 8: "
                + anArray[8]);
        System.out.println("Element at index 9: "
                + anArray[9]);
    }

    public static void multiDimArrayDemo() {

        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);

        // Traverse the entire array
        for (int i = 0; i < names.length; i++) {
            String[] innerArray = names[i];
            for (int j = 0; j < innerArray.length; j++) {
                System.out.println(innerArray[j]);
            }
        }

        // All Pairs
        String[] titles = names[0];
        String[] lastNames = names[1];

        for (String title : titles) {
            for (String lastName : lastNames) {
                System.out.println(title + lastName);
            }
        }
    }

    public static void copyDemo() {

        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }

    public static void copyDemo2() {

        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};

        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

        System.out.println(new String(copyTo));
    }

    public static void moreArraysYoopeeeeeeDemo() {

        char[] iAmNotGoingToMakeIt = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};
        char[] thatIsMoreLikeIt = {'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};

        Arrays.fill(iAmNotGoingToMakeIt,'e');
        System.out.println(iAmNotGoingToMakeIt);
        Arrays.sort(thatIsMoreLikeIt);
        System.out.println(thatIsMoreLikeIt);
        System.out.println(Arrays.binarySearch(thatIsMoreLikeIt,'a')); // Array MUST be sorted

    }

    public static void main(String[] args) {
        multiDimArrayDemo();
    }
}
