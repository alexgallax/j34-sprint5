package edu.praktikum.sprint5.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Реализации Map
 */
public class MapTypes {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "AAAAA");
        hashMap.put(3, "CCCCC");
        hashMap.put(2, "BBBBB");
        System.out.println(hashMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "AAAAA");
        linkedHashMap.put(3, "CCCCC");
        linkedHashMap.put(2, "BBBBB");
        System.out.println(linkedHashMap);

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "AAAAA");
        treeMap.put(3, "CCCCC");
        treeMap.put(2, "BBBBB");
        System.out.println(treeMap);
    }
}
