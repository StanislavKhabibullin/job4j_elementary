package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class MortGageTest {

    @Test
    public void whenYear1() {
        MortGage mortGage = new MortGage();
        int year = mortGage.year(1000, 1200, 1);
        assertThat(year, is(1));
    }

    @Test
    public void whenYear2() {
        MortGage mortGage = new MortGage();
        int year = mortGage.year(100, 120, 50);
        assertThat(year, is(2));
    }
}