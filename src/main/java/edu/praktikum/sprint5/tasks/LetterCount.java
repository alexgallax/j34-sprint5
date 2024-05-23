package edu.praktikum.sprint5.tasks;

import java.util.HashMap;
import java.util.Map;

/**
 * Подсчет количества каждого символа в слове
 */
public class LetterCount {

    public static void main(String[] args) {
        String word = "gorilla";

        System.out.println(lettersCount(word));
        System.out.println(lettersCount2(word));
        System.out.println(lettersCount3(word));
    }

    /**
     * Подсчет количества каждого символа в слове
     * @param word - слово для подсчета символов
     * @return Map, в качестве ключей - символы, в качестве значений - общее количество соответствующего символа в слове
     */
    private static Map<Character, Integer> lettersCount(String word) {
        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (result.get(letter) == null) {
                result.put(letter, 1);
            } else {
                result.put(letter, result.get(letter) + 1);
            }
        }

        return result;
    }

    /**
     * Подсчет количества каждого символа в слове
     * @param word - слово для подсчета символов
     * @return Map, в качестве ключей - символы, в качестве значений - общее количество соответствующего символа в слове
     */
    private static Map<Character, Integer> lettersCount2(String word) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            int count = map.getOrDefault(letter, 0);
            map.put(letter, count + 1);
        }

        return map;
    }

    /**
     * Подсчет количества каждого символа в слове
     * @param word - слово для подсчета символов
     * @return Map, в качестве ключей - символы, в качестве значений - общее количество соответствующего символа в слове
     */
    private static Map<Character, Integer> lettersCount3(String word) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            map.merge(letter, 1, Integer::sum);
        }

        return map;
    }
}
