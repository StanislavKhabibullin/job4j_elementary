package job4j.loop;

import org.junit.Test;
import ru.job4j.loop.Factorial;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void ifNIsFiveThenResultHundredTwenty() {
        assertThat(
                Factorial.calc(5),
                is(120)
        );
    }

    @Test
    public void ifNIsZeroThenResultOne() {
        assertThat(
                Factorial.calc(0),
                is(1)
        );
    }

    @Test
    public void ifNIsOneThenResultOne() {
        assertThat(
                Factorial.calc(1),
                is(1)
        );
    }
}
