package ru.job4j.condition;

@SuppressWarnings("checkstyle:WhitespaceAround")
public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if (question.equals("Hellow, bot!")) {
            rsl = "Hellow smart ass!";
        } else if (question.equals("Bye bye")) {
            rsl = "See you soon!";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Hellow, bot!");
        System.out.println(rsl);
        rsl = DummyBot.answer("Bye bye");
        System.out.println(rsl);
    }
}
