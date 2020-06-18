package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

@SuppressWarnings("checkstyle:EmptyLineSeparator")
public class TrgAreaTest {

    @Test
    public void exist() {
        assertThat(TrgArea.exist(1, 10, 3),
                is(false)
        );
    }

    @Test
    public void area1() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 3);
        Point third = new Point(3, 0);
        TrgArea temp;
        temp = new TrgArea(first, second, third);
        assertEquals(temp.area(),
                4.5,
                0.1
        );
    }
}