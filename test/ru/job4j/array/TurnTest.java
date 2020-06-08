package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void switchTurn() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] expected = new int[]{5, 4, 3, 2, 1};
        int[] rsl = Turn.switchTurn(input);
        assertThat(
                rsl,
                is(expected)
        );
    }

    @Test
    public void switchTurn6Element() {
        int[] input = new int[]{1, 1, 2, 3, 7, 7};
        int[] expected = new int[]{7, 7, 3, 2, 1, 1};
        int[] rsl = Turn.switchTurn(input);
        assertThat(
                rsl,
                is(expected)
        );
    }
}