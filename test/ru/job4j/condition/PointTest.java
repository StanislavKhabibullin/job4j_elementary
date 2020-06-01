package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        int inx1 = 0;
        int iny1 = 0;
        int inx2 = 5;
        int iny2 = 5;
        double expected = 7.07;
        double out = Point.distance(inx1, iny1, inx2, iny2);
        Assert.assertEquals(expected, out, 0.01);
    }
}