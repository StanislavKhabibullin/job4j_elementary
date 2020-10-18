package job4j.array;

import org.junit.Test;
import ru.job4j.array.Check;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void ifMoonTrue() {
        boolean[] input = new boolean[]{true, true, true, true};
        boolean src = Check.moon(input);
        boolean expected = true;
        assertThat(
                src,
                is(expected)
        );
    }

    @Test
    public void ifMoonFalse() {
        boolean[] input = new boolean[]{false, false, false, false};
        boolean src = Check.moon(input);
        boolean expected = true;
        assertThat(
                src,
                is(expected)
        );
    }

    @Test
    public void ifMoonDifferent() {
        boolean[] input = new boolean[]{false, true, false, true};
        boolean src = Check.moon(input);
        boolean expected = false;
        assertThat(
                src,
                is(expected)
        );
    }
}