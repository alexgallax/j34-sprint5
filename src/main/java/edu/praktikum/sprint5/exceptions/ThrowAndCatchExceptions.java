package edu.praktikum.sprint5.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Исключения
 */
public class ThrowAndCatchExceptions {

    public static void main(String[] args) {
        try {
            System.out.println(stringToInt("a"));
        } catch (NumberFormatException e) {
            System.out.println("Указано не числовое значение " + e.getMessage());
        }

        readData();

        stringMustNotBeEmpty("");
        stringMustNotBeEmptyCustom("");
    }

    public static int stringToInt(String string) {
        return Integer.parseInt(string);
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String stringMustNotBeEmpty(String string) {
        if (string != null && !string.isEmpty()) {
            return string;
        } else {
            throw new RuntimeException("Строка пустая");
        }
    }

    public static String stringMustNotBeEmptyCustom(String string) {
        if (string != null && !string.isEmpty()) {
            return string;
        } else {
            throw new CustomException();
        }
    }
}
