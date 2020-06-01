package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square() {
    int inp = 4;
    int ink = 1;
    double expected = 1;
    double out = SqArea.square(inp, ink);
    Assert.assertEquals(expected, out, 0.01);
    }
}