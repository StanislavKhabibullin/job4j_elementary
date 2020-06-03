package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

@SuppressWarnings("checkstyle:WhitespaceAround")
public class MathTest {

    @Test
    public void max() {
        int rsl = Math.max(1, 2);
        assertThat(rsl, is(2));
    }

    @Test
    public void firstMax() {
        assertThat(
                Math.whichMax(25, 14),
                is("first number is max")
        );
    }

    @Test
    public void secondMax() {
        assertThat(
                Math.whichMax(25, 76),
                is("second number is max")
        );
    }

    @Test
    public void theSame() {
        assertThat(
                Math.whichMax(30, 30),
                is("both numbers are the same")
        );
    }
}