package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void sort5Elements() {
        assertThat(
                SortSelected.sort(new int[]{5, 4, 3, 2, 1}),
                is(new int[]{1, 2, 3, 4, 5})
        );
    }

    @Test
    public void sort7Elements() {
        assertThat(
                SortSelected.sort(new int[]{5, 4, 3, 2, 1, 9, 1}),
                is(new int[]{1, 1, 2, 3, 4, 5, 9})
        );
    }
}