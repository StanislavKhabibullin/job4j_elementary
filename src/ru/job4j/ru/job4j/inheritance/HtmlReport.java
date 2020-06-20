package ru.job4j.ru.job4j.inheritance;

@SuppressWarnings("checkstyle:EmptyLineSeparator")
public class HtmlReport extends TechPort {

    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>"
                + "<br/>"
                + "<span>" + body + "</span>";
    }
}
