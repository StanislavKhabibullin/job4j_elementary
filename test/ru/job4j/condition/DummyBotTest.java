package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

@SuppressWarnings("checkstyle:WhitespaceAround")
public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        assertThat(
                DummyBot.answer("Hellow, bot!"),
                is("Hellow smart ass!")
        );
    }

    @Test
    public void whenByeBot() {
        assertThat(
                DummyBot.answer("Bye bye"),
                is("See you soon!")
        );
    }

    @Test
    public void whenUnknownBot() {
        assertThat(
                DummyBot.answer("What is going on"),
                is("Это ставит меня в тупик. Задайте другой вопрос.")
        );
    }
}