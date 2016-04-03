package com.forte.demo.javatutorialdemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>(); // Generic ArrayList to store only String
        ArrayList<String> stringList2 = new ArrayList<>(); // Using Diamond operator from Java 1.7

        stringList.add("Item"); //no error because we are storing String
        int size = stringList.size();
        int index = stringList.indexOf("Item"); //location of Item object in List

        for(String item: stringList){
            System.out.println("retrieved element: " + item);
        }

        boolean result = stringList.isEmpty();

        stringList.remove(0); // Can also call with an Object

        stringList.add(0, "Item1");
        stringList.add(1, "Item3");
        for(String item: stringList){
            System.out.println("retrieved element: " + item);
        }
        stringList.add(1, "Item2");
        for(String item: stringList){
            System.out.println("retrieved element: " + item);
        }

        stringList.set(0,"Item2");
        for(String item: stringList){
            System.out.println("retrieved element: " + item);
        }

        String[] returnedArray = stringList.toArray(new String[stringList.size()]);

        Collections.sort(stringList);
        Collections.sort(stringList, Collections.reverseOrder());
    }
}
