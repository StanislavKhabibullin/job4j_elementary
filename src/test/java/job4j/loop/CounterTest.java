package job4j.loop;

import org.junit.Test;
import ru.job4j.loop.Counter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void sumByEvenWhenNumbersFromOneToTenThenThirti() {
        assertThat(
                Counter.sumByEven(1, 10),
                is(30)
        );
    }

    @Test
    public void sumWhenNumbersFromOneToFiveThenFifteen() {
        assertThat(
                Counter.sum(1, 5),
                is(15)
        );
    }
}