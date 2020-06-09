package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void whenMinFirst() {
        assertThat(
                Min.findMin(new int[]{0, 1, 2, 3}),
                is(0)
        );
    }

    @Test
    public void whenMinLast() {
        assertThat(
                Min.findMin(new int[]{10, 11, 12, 3}),
                is(3)
        );
    }

    @Test
    public void whenMinMiddle() {
        assertThat(
                Min.findMin(new int[]{110, 11, 12, 13}),
                is(11)
        );
    }
}