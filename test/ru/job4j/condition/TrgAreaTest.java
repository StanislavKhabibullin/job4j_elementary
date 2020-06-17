package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class TrgAreaTest {

    @Test
    public void exist() {
        assertThat(TrgArea.exist(1, 10, 3),
                is(false)
        );
    }

    @Test
    public void area() {
        assertEquals(
                TrgArea.trgsquare(2, 2, 2),
                1.73,
                0.01
        );
    }
}