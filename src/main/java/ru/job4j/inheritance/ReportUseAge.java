package ru.job4j.inheritance;

public class ReportUseAge {
    public static void main(String[] args) {
        HtmlReport report = new HtmlReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
        JSONReport result = new JSONReport();
        text = result.generate("name", "body");
        System.out.println(text);
    }
}
