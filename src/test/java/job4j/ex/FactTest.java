package job4j.ex;

import org.junit.Test;
import ru.job4j.ex.Fact;

import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void main() {
        Fact.calc(-5);
    }

    @Test
    public void calc() {
    }
}