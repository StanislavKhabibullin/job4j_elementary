package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void monoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean rezult = MatrixCheck.monoHorizontal(input, 1);
        assertThat(
                rezult,
                is(true)
        );
    }

    @Test
    public void monoVertikal() {
        char[][] input = {
                {' ', ' ', 'X'},
                {'X', 'X', 'X'},
                {' ', ' ', 'X'},
        };
        boolean rezult = MatrixCheck.monoVertikal(input, 2);
        assertThat(
                rezult,
                is(true)
        );
    }

    @Test
    public void monoDiagonal() {
        char[][] input = {
                {'L', ' ', 'X'},
                {'X', 'X', 'X'},
                {' ', ' ', 'X'},
        };
        char[] rezult = MatrixCheck.extraDiagonal(input);
        char[] expected = new char[]{'L', 'X', 'X'};
        assertThat(
                rezult,
                is(expected)
        );
    }
}