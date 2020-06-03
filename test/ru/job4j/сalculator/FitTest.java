package ru.job4j.сalculator;

import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("checkstyle:EmptyLineSeparator")
public class FitTest {

    @Test
    public void manWeight() {
        double in = 175;
        double expected = 87.25;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void woomanWeight() {
        double in = 160;
        double expected = 57.50;
        double out = Fit.woomanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

}