package edu.praktikum.sprint5.collections;

import java.util.*;

/**
 * Set и получение списка только с уникальными значениями элементов
 */
public class Sets {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("sdffds");
        list.add("a");
        list.add("po11");
        list.add("a");

        Set<String> hashSet = new HashSet<>(list);
        Set<String> linkedHashSet = new LinkedHashSet<>(list);
        Set<String> treeSet = new TreeSet<>(list);

        System.out.println(list);

        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
    }
}
