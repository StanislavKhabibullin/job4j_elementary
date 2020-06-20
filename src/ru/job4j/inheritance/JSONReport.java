package ru.job4j.inheritance;

@SuppressWarnings("checkstyle:WhitespaceAround")
public class JSONReport extends TechPort {

    @Override
    public String generate(String name, String body) {
        return "name: " + name
                + System.lineSeparator()
                + "body: " + body;
    }
}
