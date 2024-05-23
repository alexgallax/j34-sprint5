package edu.praktikum.sprint5.exceptions;

public class CustomException extends RuntimeException {

    public CustomException() {
        super("Строка пустая");
    }
}
