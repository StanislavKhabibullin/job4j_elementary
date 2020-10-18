package ru.job4j.ex;

public class ElementAbuseExeption extends ElementNotFoundException {
    public ElementAbuseExeption(String message) {
        super(message);
    }
}
