package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] rst = new int[]{5, 0, 3, 6};
        int value = 5;
        int expected = 0;
        int result = FindLoop.indexOf(rst, value);
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayHas0Then1() {
        int[] rst = new int[]{5, 0, 3, 6};
        int value = 0;
        int expected = 1;
        int result = FindLoop.indexOf(rst, value);
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayHas7ThenError() {
        int[] rst = new int[]{5, 0, 3, 6};
        int value = 7;
        int expected = -1;
        int result = FindLoop.indexOf(rst, value);
        assertThat(result, is(expected));
    }
}