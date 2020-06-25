package ru.job4j.poly;

public interface Store {
    void save(String value);

    @SuppressWarnings("checkstyle:ConstantName")
    String[] load = new String[0];
}
