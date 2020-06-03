package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class MultyMaxTest {

    @Test
    public void whenSecondMax() {
        MultyMax check = new MultyMax();
        int result = check.max(3, 7, 1);
        assertThat(result, is(7));
    }

    @Test
    public void whenFirstMax() {
        MultyMax check = new MultyMax();
        int result = check.max(7, 3, 1);
        assertThat(result, is(7));
    }

    @Test
    public void whenFirdMax() {
        MultyMax check = new MultyMax();
        int result = check.max(1, 3, 9);
        assertThat(result, is(9));
    }

    @Test
    public void whenAllTheSame() {
        MultyMax check = new MultyMax();
        int result = check.max(5, 5, 5);
        assertThat(result, is(5));
    }

}