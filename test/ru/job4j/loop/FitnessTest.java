package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void whenIvanNineteenNikolayHandred() {
        assertThat(
                Fitness.calc(90, 100),
                is(1)
        );
    }

    @Test
    public void whenIvanNineteenNikolaySeventeen() {
        assertThat(
                Fitness.calc(90, 70),
                is(0)
        );
    }

    @Test
    public void whenIvanFifteenNikolayNineteen() {
        assertThat(
                Fitness.calc(50, 90),
                is(2)
        );
    }

    @Test
    public void whenIvanNineteenNikolayNineteen() {
        assertThat(
                Fitness.calc(90, 90),
                is(1)
        );
    }
}