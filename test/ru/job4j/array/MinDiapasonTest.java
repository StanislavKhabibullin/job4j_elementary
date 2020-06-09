package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class MinDiapasonTest {

    @Test
    public void whenMinFirst() {
        assertThat(
                MinDiapason.minDiap(new int[]{0, 1, 2, 3}, 0, 2),
                is(0)
        );
    }

    @Test
    public void whenMinLast() {
        assertThat(
                MinDiapason.minDiap(new int[]{0, 1, 2, 3, 7, 9, 1}, 2, 6),
                is(1)
        );
    }

    @Test
    public void whenMinMiddle() {
        assertThat(
                MinDiapason.minDiap(new int[]{0, 1, 9, 3, 7, 9, 1}, 2, 5),
                is(3)
        );
    }
}