package edu.praktikum.sprint5.collections;

import edu.praktikum.sprint5.models.Soyuz;
import edu.praktikum.sprint5.models.SpaceShip;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Map
 */
public class Maps {

    public static void main(String[] args) {
        Soyuz soyuz = new Soyuz(2);
        Soyuz soyuz2 = new Soyuz(2);

        System.out.println(Objects.equals(soyuz, soyuz2));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "один");
        map.put(0, "ноль");
        map.put(2, "два");
        map.put(2, "точно два");

        Map<SpaceShip, String> shipsMap = new HashMap<>();
        shipsMap.put(new Soyuz(1), "Союз 1");
        shipsMap.put(new Soyuz(1), "Союз 2");

        System.out.println(shipsMap);
    }
}
