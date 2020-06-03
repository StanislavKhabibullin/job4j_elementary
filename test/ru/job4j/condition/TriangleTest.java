package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

@SuppressWarnings("checkstyle:WhitespaceAround")
public class TriangleTest {

    @Test
    public void whenExist() {
        assertThat(
                Triangle.exist(2, 2, 2),
                is(true)
        );
    }

    @Test
    public void whenDoesNotExist() {
        assertThat(
                Triangle.exist(2, 1, 7),
                is(false)
        );
    }
}