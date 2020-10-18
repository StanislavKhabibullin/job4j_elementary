package job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;
import ru.job4j.converter.Converter;

public class ConverterTest extends TestCase {
    @Test
    public void testRubleToEvro() {
        int in = 320;
        int expected = 4;
        int out = Converter.rubleToEvro(in);
        Assert.assertEquals(expected, out);
    }

@Test
    public void testRubleToDollar() {
    int in = 140;
    int expected = 2;
    int out = Converter.rubleToDollar(in);
    Assert.assertEquals(expected, out);
    }
}