package edu.praktikum.sprint5.collections;

import edu.praktikum.sprint5.models.Proton;
import edu.praktikum.sprint5.models.Soyuz;
import edu.praktikum.sprint5.models.SpaceShip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Сортировка объектов (Comparable)
 */
public class Sorting {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("BB");
        list.add("AA");
        list.add("CC");

        System.out.println("Несортированный: " + list);

        Collections.sort(list);

        System.out.println("Сортированный: " + list);

        List<SpaceShip> ships = new ArrayList<>();
        ships.add(new Soyuz(3));
        ships.add(new Soyuz(2));
        ships.add(new Proton(2));
        ships.add(new Proton(1));
        ships.add(new Soyuz(4));

        Collections.sort(ships);

        System.out.println(ships);
    }
}
