package job4j.loop;

import org.junit.Test;
import ru.job4j.loop.PrimeNumber;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void when5() {
        assertThat(
                PrimeNumber.calc(5),
                is(3)
        );
    }

    @Test
    public void when1() {
        assertThat(
                PrimeNumber.calc(1),
                is(0)
        );
    }

    @Test
    public void when10() {
        assertThat(
                PrimeNumber.calc(10),
                is(4)
        );
    }
}