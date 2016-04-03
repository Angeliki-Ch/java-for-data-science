package com.forte.demo.javatutorialdemos;

import java.util.HashMap;

public class MapDemo {

    // HashMap is most common and fastest, LinkedHashMap remembers order of insertion, TreeMap ordered keys by
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(21, "Twenty One");

        int key21 = 21;
        String value = map.get(key21);
        System.out.println("Key: " + key21 +" value: "+ value);

        map.put(31, "Thirty One");

        for (Integer key : map.keySet()){
            System.out.println("key: " + key + " value: " + map.get(key));
        }

        System.out.println("Size of Map: " + map.size());
        map.clear(); //clears hashmap , removes all element
        System.out.println("Size of Map: " + map.size());

        map.put(21, "Twenty One");
        map.put(31, "Thirty One");

        System.out.println("Does HashMap contains 21 as key: " + map.containsKey(21));
        System.out.println("Does HashMap contains 21 as value: " + map.containsValue(21));

        map.remove(key21);
        System.out.println("Does HashMap contains 21 as key: " + map.containsKey(21));

    }
}
