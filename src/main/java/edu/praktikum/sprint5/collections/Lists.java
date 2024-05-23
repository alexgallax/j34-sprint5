package edu.praktikum.sprint5.collections;

import edu.praktikum.sprint5.models.Proton;
import edu.praktikum.sprint5.models.Soyuz;
import edu.praktikum.sprint5.models.SpaceShip;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Списки (List)
 */
public class Lists {

    public static void main(String[] args) {
        SpaceShip soyuz = new Soyuz(3);
        SpaceShip proton = new Proton(1);

        List<SpaceShip> arrayList = new ArrayList<>();
        arrayList.add(soyuz);
        arrayList.add(proton);

        /*
        Внутри ArrayList массив, размер которого увеличивается при необходимости

        [    ] -> [       ] -> [             ]
        [ "a",  "zxy", "abc" ]
        [ "a",  "b", "zxy", "abc" ]

        Pros: быстрое чтение элементов, так как к ним можно получить доступ по индексу
        Cons: долгое добавление и удаление элементов, так как необходимо каждый раз сдвигать все последующие элементы
         */

        System.out.println(arrayList);

        List<SpaceShip> linkedList = new LinkedList<>();
        linkedList.add(soyuz);
        linkedList.add(proton);

        /*
        Внутри LinkedList ноды, каждая хранит значение элемента и ссылки на предыдущую и следующую ноду

        ("a")-> <-("zxy")-> <-("abc")
        ("a")-> <-("b")-> <-("zxy")-> <-("abc")

        Pros: быстрое добавление и удаление элементов, так как нужно только добавить ноду
        и изменить ссылки у соседних нод
        Cons: долгое чтение элементов, так как каждый раз вычитывание происходит с начала списка,
        пока по ссылкам не дойдет до нужного элемента
         */

        System.out.println(linkedList);
    }
}
